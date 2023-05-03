package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HelloControllerTest {
    private HelloController helloController = new HelloController();

    @Test
    public void testSayCurrentTime() {
        assertThat(helloController.sayCurrentTime(), containsString("Hello"));
    }

}
