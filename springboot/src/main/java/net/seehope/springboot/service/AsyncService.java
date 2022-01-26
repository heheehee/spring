package net.seehope.springboot.service;

import java.util.concurrent.Future;

public interface AsyncService {
    public Future<Boolean> task1() throws InterruptedException;
    public Future<Boolean> task2() throws InterruptedException;
    public Future<Boolean> task3() throws InterruptedException;

}
