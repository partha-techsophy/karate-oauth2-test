package com.example;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestRunner {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:com")
                .outputCucumberJson(true)
                .parallel(5);
        Assertions.assertTrue(results.getFailCount() == 0);
    }
}
