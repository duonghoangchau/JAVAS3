package com.example.laptrinh_s3.Controllers;

import com.example.laptrinh_s3.RequestEntities.RequestUser;
import com.example.laptrinh_s3.RequestEntities.RequestUserUpdate;
import com.example.laptrinh_s3.Services.RoleService;
import com.example.laptrinh_s3.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/new")
    public String newStudent(Model model) {
        model.addAttribute("user", new RequestUser());
        return "Layout/User/new";
    }
    @PostMapping("/save")
    public String save(RequestUser requestUser) {
        userService.CreateUser(requestUser);
        return "redirect:/users";
    }
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("users", userService.findAll());
        return "Layout/User/index";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("user", userService.findById(id));
        model.addAttribute("roles", roleService.getAllRoles());
        return "Layout/User/edit";
    }
    @PostMapping("/savechange")
    public String saveChange(RequestUserUpdate requestUserUpdate) {
        userService.UpdateUser(requestUserUpdate);
        return "redirect:/users";
    }

}