package com.example.laptrinh_s3.Services;

import com.example.laptrinh_s3.Entities.Role;
import com.example.laptrinh_s3.Repositories.RoleRepository;
import com.example.laptrinh_s3.RequestEntities.RequestRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    public Role getRoleById(String id) {
        return roleRepository.findById(id).get();
    }
    public Role createRole(RequestRole requestRole) {
        Role role = new Role();
        role.setRole_name(requestRole.getRole_name());
        return roleRepository.save(role);
    }
}