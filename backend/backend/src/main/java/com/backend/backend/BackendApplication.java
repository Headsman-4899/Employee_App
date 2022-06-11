package com.backend.backend;

import com.backend.backend.entity.Employee;
import com.backend.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstName("first_name1")
                .lastName("last_name1")
                .email("email1@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("first_name2")
                .lastName("last_name2")
                .email("email2@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
    }
}
