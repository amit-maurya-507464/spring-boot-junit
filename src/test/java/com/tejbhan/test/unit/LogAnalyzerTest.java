package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class LogAnalyzerTest {

    private final LogAnalyzer logAnalyzer = new LogAnalyzer();

    @Test
    void testAnalyzeLog() {
        List<String> expectedLogLines = List.of(
                "INFO: Application started",
                "WARN: Null pointer exception occurred",
                "ERROR: Database connection failed"
        );

        List<String> actualLogLines = logAnalyzer.analyzeLog();

        assertLinesMatch(expectedLogLines, actualLogLines,
                "Generated log lines should match expected log lines");
    }
}
