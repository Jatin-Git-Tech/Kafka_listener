package com.example.demo_listener.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmployeeAllocationListener {

    @KafkaListener(topics = "employee-allocations", groupId = "notification-group")
    public void handleEmployeeAllocation(String message) {
        // Implement notification logic, e.g., send an email or log a message
        System.out.println("Received allocation message: " + message);
    }
}