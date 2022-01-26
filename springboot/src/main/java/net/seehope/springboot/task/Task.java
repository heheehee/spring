package net.seehope.springboot.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Task {
    @Scheduled(cron = "4-40 * * * * ?")
    public void task1(){
        log.info("task1");
    }

}
