package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProject2Application {

	public static void main(String[] args) {
		System.out.print("Jenkins Program Executed,,,");
		System.out.println("Yash Java Version: " + System.getProperty("java.version"));
		
		SpringApplication.run(JenkinsProject2Application.class, args);
	}

}
