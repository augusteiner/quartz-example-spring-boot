package io.quartz.example.spring.jobs;

import io.quartz.example.spring.services.CustomerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;

@Component
public class HelloJob {

    private final ArrayDeque<Object> customers = new ArrayDeque<>();

    private final CustomerService customerService;

    public HelloJob(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Scheduled(fixedDelay = 120_000)
    public void initCustomers() {
        customers.clear();

        customers.addAll(customerService.getAllCustomers());
    }

    @Scheduled(fixedDelay = 10_000)
    @Scheduled(fixedDelay = 10_000)
    @Scheduled(fixedDelay = 10_000)
    @Scheduled(fixedDelay = 10_000)
    public void computePerCustomer() {
        Object customer = customers.pop();

        // TODO: computação de alto custo
    }
}
