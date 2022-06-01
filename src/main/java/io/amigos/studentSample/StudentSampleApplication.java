package io.amigos.studentSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSampleApplication {
	public String hello(){
		return "hello GitHub";
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentSampleApplication.class, args);
	}

}
