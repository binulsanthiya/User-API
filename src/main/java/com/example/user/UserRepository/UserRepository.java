package com.example.user.UserRepository;

import com.example.user.UserModel.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}