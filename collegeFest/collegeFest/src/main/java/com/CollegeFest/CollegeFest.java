package com.CollegeFest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollegeFest {

	public static void main(String[] args) {
		SpringApplication.run(CollegeFest.class, args);

		System.out.println("Welcome to Great Learning College Fest Registration Portal");
		System.out.println("Use URL as localhost:<PORT>/StudentManagementSystem ");
	}

}
