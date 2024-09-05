package com.example.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}
	@GetMapping("/learningportal")
	public String learning(){
		return "Grow your knowledge";
	}
	@GetMapping("/courses")
	public String courses() {
		return "select the courses";
	}
	

}
