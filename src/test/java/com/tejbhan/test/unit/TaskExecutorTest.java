package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class TaskExecutorTest {

    private final TaskExecutor taskExecutor = new TaskExecutor();

    @Test
    void testExecuteTaskWithinTimeout() {
        // Specify a timeout duration of 4 seconds
        Duration timeoutDuration = Duration.ofSeconds(2);

        // Use assertTimeout to verify that executeTask completes within the timeout
        assertTimeout(timeoutDuration, taskExecutor::executeTask);
    }

    @Test
    void testExecuteTaskWithinTimeoutOrExit() {
        // Specify a timeout duration of 3 seconds
        Duration timeoutDuration = Duration.ofSeconds(5);

        // Use assertTimeoutPreemptively to verify that executeTask completes within the timeout
        assertTimeoutPreemptively(timeoutDuration, taskExecutor::executeTask);
    }
}
