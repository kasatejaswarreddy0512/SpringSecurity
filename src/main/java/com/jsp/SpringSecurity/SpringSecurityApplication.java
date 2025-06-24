package com.jsp.SpringSecurity;

import com.jsp.SpringSecurity.entity.Role;
import com.jsp.SpringSecurity.entity.User;
import com.jsp.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}


}
