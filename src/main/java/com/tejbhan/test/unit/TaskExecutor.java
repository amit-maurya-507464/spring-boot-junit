package com.tejbhan.test.unit;

import java.util.concurrent.TimeUnit;

public class TaskExecutor {

    public void executeTask() {
        try {
            // Simulate a time-consuming task
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Task execution interrupted", e);
        }
    }
}
