package com.example.build;

import org.gradle.api.Action;
import org.gradle.api.Task;

import java.io.Serializable;

public final class PrintFunctionalTestReportAction implements Action<Task>, Serializable {
    private static final long serialVersionUID = 1L;

    private final String reportPath;

    public PrintFunctionalTestReportAction(String reportPath) {
        this.reportPath = reportPath;
    }

    @Override
    public void execute(Task task) {
        System.out.println("\nFunctional test report: " + reportPath);
    }
}
