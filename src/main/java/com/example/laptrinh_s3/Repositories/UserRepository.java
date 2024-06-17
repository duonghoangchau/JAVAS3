package com.example.laptrinh_s3.Repositories;

import com.example.laptrinh_s3.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, String> {
    @Query("select u from User u where u.username=?1")
    User findByUsername(String username);
}