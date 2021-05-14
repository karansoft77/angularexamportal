package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examserver.model.UserRole;
import com.exam.examserver.model.role;
import com.exam.examserver.model.user;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	UserService us;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("String Code");
		
		/*
		 * user user=new user();
		 * 
		 * user.setFirstname("Karan"); user.setLastname("Gupta");
		 * user.setUsername("karansoft77");
		 * 
		 * role role = new role();
		 * 
		 * role.setRole(44l); role.setRoleName("ADMIN");
		 * 
		 * Set<UserRole> userRoleseSet = new HashSet<>(); UserRole userRole = new
		 * UserRole(); userRole.setRole(role); userRole.setUser(user);
		 * userRoleseSet.add(userRole);
		 * 
		 * user createuser = this.us.createuser(user, userRoleseSet);
		 * System.out.println(createuser.getUsername());
		 */
		 
	}

}
