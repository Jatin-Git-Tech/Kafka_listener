package com.example.demo_listener.Controller;

import com.example.demo_listener.model.Employee;
import com.example.demo_listener.repository.EmployeeRepository;
import com.example.demo_listener.Service.NotificationProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final NotificationProducer notificationProducer;

    public EmployeeController(EmployeeRepository employeeRepository, NotificationProducer notificationProducer) {
        this.employeeRepository = employeeRepository;
        this.notificationProducer = notificationProducer;
    }

    @GetMapping("/employees")
    public Flux<Employee> getEmployees(@RequestParam(required = false) String primarySkill) {
        if (primarySkill != null) {
            return employeeRepository.findByPrimarySkill(primarySkill);
        }
        return employeeRepository.findAll();
    }

    @PostMapping("/allocate")
    public Mono<Employee> allocateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee)
                .doOnSuccess(savedEmployee -> notificationProducer.sendEmployeeAllocation("Employee allocated: " + savedEmployee.getEmployeeName()));
    }
}