package com.howto.DemoUser.repository;

import com.howto.DemoUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}