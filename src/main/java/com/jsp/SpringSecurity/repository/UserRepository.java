package com.jsp.SpringSecurity.repository;

import com.jsp.SpringSecurity.entity.Role;
import com.jsp.SpringSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
