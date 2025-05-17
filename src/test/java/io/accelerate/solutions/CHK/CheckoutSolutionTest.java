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
        assertThat(checkoutSolution.checkout("FF"), equalTo(20));
        assertThat(checkoutSolution.checkout("FFF"), equalTo(20));
        assertThat(checkoutSolution.checkout("FFFFF"), equalTo(40));
        assertThat(checkoutSolution.checkout("FFFFFF"), equalTo(40));


        // 4
        assertThat(checkoutSolution.checkout("HHHHHHHHHHHHHHHH"), equalTo(135)); // 16 H
        assertThat(checkoutSolution.checkout("KKK"), equalTo(190));
        assertThat(checkoutSolution.checkout("NNNM"), equalTo(120));
        assertThat(checkoutSolution.checkout("NNNMM"), equalTo(135));
        assertThat(checkoutSolution.checkout("PPPPPP"), equalTo(250));
        assertThat(checkoutSolution.checkout("QQQQ"), equalTo(110));
        assertThat(checkoutSolution.checkout("RRR"), equalTo(150));
        assertThat(checkoutSolution.checkout("RRRQ"), equalTo(150));
        assertThat(checkoutSolution.checkout("UU"), equalTo(80));
        assertThat(checkoutSolution.checkout("UUU"), equalTo(120));
        assertThat(checkoutSolution.checkout("UUUU"), equalTo(120));
        assertThat(checkoutSolution.checkout("VVVVVV"), equalTo(260));
        assertThat(checkoutSolution.checkout("VVVVVVV"), equalTo(310));
        assertThat(checkoutSolution.checkout("VVVVVVVV"), equalTo(350));
        assertThat(checkoutSolution.checkout("H"), equalTo(10));
        assertThat(checkoutSolution.checkout("I"), equalTo(35));
        assertThat(checkoutSolution.checkout("J"), equalTo(60));
        assertThat(checkoutSolution.checkout("K"), equalTo(70));
        assertThat(checkoutSolution.checkout("L"), equalTo(90));
        assertThat(checkoutSolution.checkout("M"), equalTo(15));
        assertThat(checkoutSolution.checkout("N"), equalTo(40));
        assertThat(checkoutSolution.checkout("O"), equalTo(10));
        assertThat(checkoutSolution.checkout("P"), equalTo(50));
        assertThat(checkoutSolution.checkout("Q"), equalTo(30));
        assertThat(checkoutSolution.checkout("R"), equalTo(50));
        assertThat(checkoutSolution.checkout("S"), equalTo(20));
        assertThat(checkoutSolution.checkout("T"), equalTo(20));
        assertThat(checkoutSolution.checkout("U"), equalTo(40));
        assertThat(checkoutSolution.checkout("V"), equalTo(50));
        assertThat(checkoutSolution.checkout("W"), equalTo(20));
        assertThat(checkoutSolution.checkout("X"), equalTo(17));
        assertThat(checkoutSolution.checkout("Y"), equalTo(20));
        assertThat(checkoutSolution.checkout("Z"), equalTo(21));


        // 5
        assertThat(checkoutSolution.checkout("XYYZ"), equalTo(62));
        assertThat(checkoutSolution.checkout("YST"), equalTo(45));
        assertThat(checkoutSolution.checkout("TZZZ"), equalTo(65));
        assertThat(checkoutSolution.checkout("ZZZZ"), equalTo(66));
        assertThat(checkoutSolution.checkout("YS"), equalTo(40));



    }



}

