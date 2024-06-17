package com.example.laptrinh_s3.Repositories;


import com.example.laptrinh_s3.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, String> {
    @Query("SELECT r FROM Role r where r.role_name=?1 ")
    Role findOneByName(String name);
}