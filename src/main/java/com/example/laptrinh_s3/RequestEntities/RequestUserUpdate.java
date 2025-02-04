package com.example.laptrinh_s3.RequestEntities;

import com.example.laptrinh_s3.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestUserUpdate {
    private String id;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String birthDay;
    private Role role;
}