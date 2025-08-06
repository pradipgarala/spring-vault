package com.example.spring_vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringVaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringVaultApplication.class, args);
    }

}


@RestController
class MyController {

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    @GetMapping("/")
    public String getStuff() {
        return "These are values from Vault! Username: %s, Password: %s".formatted(username, password);
    }
}