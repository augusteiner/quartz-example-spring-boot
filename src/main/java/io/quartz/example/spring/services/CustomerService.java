package io.quartz.example.spring.services;

import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerService {
    public void sayHello() {
        System.out.println("Hello");
    }

    public Collection<Object> getAllCustomers() {
        return List.of(new Object());
    }
}
