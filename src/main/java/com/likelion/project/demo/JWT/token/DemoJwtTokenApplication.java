package com.likelion.project.demo.JWT.token;

import com.likelion.project.demo.JWT.token.Entity.User;
import com.likelion.project.demo.JWT.token.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoJwtTokenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtTokenApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("Hoang Minh");
		user.setPassword(passwordEncoder.encode("123"));
		userRepository.save(user);
		System.out.println(user);
	}

}
