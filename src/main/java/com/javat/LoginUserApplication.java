package com.javat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javat.models.User;

@SpringBootApplication
public class LoginUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginUserApplication.class, args);
	}
	@Bean(name = "USER_BEAN")
   public User setUser() {
	   User u = new User();
	   u.setUsername("admin");
	   u.setPassword("admin123");
	   return u;
  }
}


