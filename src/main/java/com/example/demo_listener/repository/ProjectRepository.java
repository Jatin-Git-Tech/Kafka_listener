package com.example.demo_listener.repository;

import com.example.demo_listener.model.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {
}