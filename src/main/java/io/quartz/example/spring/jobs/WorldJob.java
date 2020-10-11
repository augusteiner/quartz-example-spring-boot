package io.quartz.example.spring.jobs;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//@Component
public class WorldJob {

    @Scheduled(fixedDelay = 10_000)
    public void world() {
        final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("[WORLD] : " + fmt.format(LocalDateTime.now()));

        try {
            Thread.sleep(30_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("[WORLD] : " + fmt.format(LocalDateTime.now()) + ": world!");
    }
}
