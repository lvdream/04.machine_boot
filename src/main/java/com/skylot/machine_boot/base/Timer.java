package com.skylot.machine_boot.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Slf4j
public class Timer {

    @Async("heartBeatPLC")
    @Scheduled(fixedDelay = 200)
    public Future<String> doTask1() throws InterruptedException {
        log.info("Task1 started.");
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        Thread.sleep(5000);
        log.info("Task1 finished, time elapsed: {} ms.", end - start);
        return new AsyncResult<>("Task1 accomplished!");
    }

    @Async("ftpSearch")
    @Scheduled(fixedDelay = 200)
    public Future<String> doTask2() throws InterruptedException {
        log.info("Task2 started.");
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        Thread.sleep(5000);
        log.info("Task2 finished, time elapsed: {} ms.", end - start);
        return new AsyncResult<>("Task1 accomplished!");
    }

    @Async("Parking")
    @Scheduled(fixedDelay = 200)
    public Future<String> doTask3() throws InterruptedException {
        log.info("Task3 started.");
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        Thread.sleep(5000);
        log.info("Task3 finished, time elapsed: {} ms.", end - start);
        return new AsyncResult<>("Task1 accomplished!");
    }

    @Async("heartBeatSaaS")
    @Scheduled(fixedDelay = 200)
    public Future<String> doTask4() throws InterruptedException {
        log.info("Task4 started.");
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        Thread.sleep(5000);
        log.info("Task4 finished, time elapsed: {} ms.", end - start);
        return new AsyncResult<>("Task4 accomplished!");
    }
}
