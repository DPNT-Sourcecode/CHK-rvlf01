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
        // 1
        assertThat(checkoutSolution.checkout("ABAC"), equalTo(150));
        assertThat(checkoutSolution.checkout("AAA"), equalTo(130));
        assertThat(checkoutSolution.checkout("BB"), equalTo(45));
        assertThat(checkoutSolution.checkout("CCC"), equalTo(60));
        assertThat(checkoutSolution.checkout("BBBB"), equalTo(90));
        assertThat(checkoutSolution.checkout("AAABB"), equalTo(175));
        assertThat(checkoutSolution.checkout("AxA"), equalTo(-1));
        assertThat(checkoutSolution.checkout("-"), equalTo(-1));
        assertThat(checkoutSolution.checkout(""), equalTo(0));

        // 2
        assertThat(checkoutSolution.checkout("AAAAAAAAA"), equalTo(380));
        assertThat(checkoutSolution.checkout("BBEE"), equalTo(110));
        assertThat(checkoutSolution.checkout("BBBEE"), equalTo(125));
        assertThat(checkoutSolution.checkout("BBBEEEE"), equalTo(190));


        // 3
        assertThat(checkoutSolution.checkout("FFF"), equalTo(20));

    }



}
