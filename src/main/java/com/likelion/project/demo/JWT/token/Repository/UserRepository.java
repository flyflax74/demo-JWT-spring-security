package com.likelion.project.demo.JWT.token.Repository;

import com.likelion.project.demo.JWT.token.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
