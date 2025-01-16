package com.example.demo_listener.repository;

import com.example.demo_listener.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
    Flux<Employee> findByPrimarySkill(String primarySkill);
    // Add more methids
}