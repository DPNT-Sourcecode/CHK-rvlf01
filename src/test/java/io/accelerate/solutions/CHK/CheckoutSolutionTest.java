package io.accelerate.solutions.CHK;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {
    private CheckoutSolution checkoutSolution;

    @BeforeEach
    public void name() {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void run() {
        assertThat(checkoutSolution.checkout("ABAC"), equalTo(150));
        assertThat(checkoutSolution.checkout("AAA"), equalTo(130));
        assertThat(checkoutSolution.checkout("BB"), equalTo(45));
        assertThat(checkoutSolution.checkout("CCC"), equalTo(80));
        assertThat(checkoutSolution.checkout("BBBB"), equalTo(75));
        assertThat(checkoutSolution.checkout("AAABB"), equalTo(175));
    }
}