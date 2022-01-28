package com.example.oauth;

import com.intuit.karate.junit5.Karate;

class OauthTestRunner {

    @Karate.Test
    Karate runAll() {
        return Karate.run().relativeTo(getClass());
    }
}
