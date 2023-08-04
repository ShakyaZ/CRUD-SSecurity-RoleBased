package com.example.schoolcrud;
import com.example.schoolcrud.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = StudentRepository.class)
@EnableWebSecurity
public class SchoolCrudApplication{

    public static void main(String[] args) {
        SpringApplication.run(SchoolCrudApplication.class, args);

    }

}
