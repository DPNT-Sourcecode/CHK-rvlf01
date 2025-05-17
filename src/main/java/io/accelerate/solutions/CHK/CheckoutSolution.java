package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.HashSet;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        HashMap<String, Integer> cart = new HashMap<>();
        cart.put("A", 0);
        cart.put("B", 0);
        cart.put("C", 0);
        cart.put("D", 0);


        for (int i = 0; i < skus.length(); i++) {
            cart.get(String.valueOf(skus.charAt(i)))++;
        }

        return -1;
    }
}


