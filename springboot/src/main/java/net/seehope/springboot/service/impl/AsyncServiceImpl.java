package net.seehope.springboot.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.seehope.springboot.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {
    @Async
    @Override
    public Future<Boolean> task1() throws InterruptedException {
        log.info("task1 start");
        Thread.sleep(1000);
        log.info("task1 end");
        return new AsyncResult<>(true);
    }


    @Async
    @Override
    public Future<Boolean> task2() throws InterruptedException {
        log.info("task2 start");
        Thread.sleep(1000);
        log.info("task2 end");
        return new AsyncResult<>(true);
    }

    @Async
    @Override
    public Future<Boolean> task3() throws InterruptedException {
        log.info("task3 start");
        Thread.sleep(1000);
        log.info("task3 end");
        return new AsyncResult<>(true);
    }
}
