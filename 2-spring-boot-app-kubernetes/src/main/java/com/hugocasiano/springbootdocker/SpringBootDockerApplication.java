package com.hugocasiano.springbootdocker;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
	
	private final Environment env;

    public SpringBootDockerApplication(Environment env) {
        this.env = env;
    }	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	@GetMapping("/hello")
	public String h() {
		return "Variables..." + System.getenv().toString();
	}
}
