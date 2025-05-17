package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.HashSet;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        HashMap<Character, Integer> cart = new HashMap<>();
        cart.put("A", 0);
        cart.put("B", 0);
        cart.put("C", 0);
        cart.put("D", 0);


        for (int i = 0; i < skus.length(); i++) {
            cart.put(skus.charAt(i), cart.get(skus.charAt(i)) + 1);
        }

        int aItemsPrice = cart.
        int cItemsPrice = cart.get("C") * 20;
        int dItemsPrice = cart.get("D") * 15;


        return -1;
    }
}
