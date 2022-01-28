package com.example.sample;

import com.intuit.karate.junit5.Karate;

class SampleRunner {

    @Karate.Test
    Karate testSample() {
        return Karate.run("classpath:com").relativeTo(getClass());
    }

    @Karate.Test
    Karate testSample2() {
        return Karate.run().relativeTo(getClass());
    }
}
