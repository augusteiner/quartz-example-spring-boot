package io.quartz.example.spring.quartzexamplespringboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

//@Configuration
//@EnableScheduling
//@ComponentScan({"io.quartz.example.spring.*"})
public class SpringConfiguration /* implements SchedulingConfigurer */ {

//    @Override
//    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegister) {
//        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
//        taskScheduler.setPoolSize(10);
//        taskScheduler.setThreadNamePrefix("Spring-scheduler-task-pool-");
//        taskScheduler.initialize();
//
//        scheduledTaskRegister.setTaskScheduler(taskScheduler);
//    }
}
