package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class TaskExecutorTest {

    private final TaskExecutor taskExecutor = new TaskExecutor();

    @Test
    void testExecuteTaskWithinTimeout() {
        // Specify a timeout duration of 4 seconds
        Duration timeoutDuration = Duration.ofSeconds(4);

        // Use assertTimeout to verify that executeTask completes within the timeout
        assertTimeout(timeoutDuration, taskExecutor::executeTask);
    }
}
