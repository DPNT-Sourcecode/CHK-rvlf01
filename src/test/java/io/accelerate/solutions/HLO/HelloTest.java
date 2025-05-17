package io.accelerate.solutions.HLO;

import io.accelerate.solutions.HLO.HelloSolution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloTest {
    private HelloSolution helloSolution;

    @BeforeEach
    public void name() {
        helloSolution = new HelloSolution();
    }

    @Test
    public void run() {
        assertThat(helloSolution.hello("Tom"), equalTo("Hello, Tom!"));
    }
}