package com.tejbhan.test.unit;

import java.util.ArrayList;
import java.util.List;

public class LogAnalyzer {

    public List<String> analyzeLog() {
        List<String> logLines = new ArrayList<>();
        logLines.add("INFO: Application started");
        logLines.add("WARN: Null pointer exception occurred");
        logLines.add("ERROR: Database connection failed");
        return logLines;
    }
}
