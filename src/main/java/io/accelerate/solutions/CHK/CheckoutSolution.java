package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.HashSet;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        System.out.println(skus);

        if (skus == null) {
            return -1;
        }

        if (skus.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> cart = new HashMap<>();
        cart.put('A', 0);
        cart.put('B', 0);
        cart.put('C', 0);
        cart.put('D', 0);

        for (int i = 0; i < skus.length(); i++) {
            if (!cart.containsKey(skus.charAt(i))) {
                return -1;
            }
            cart.put(skus.charAt(i), cart.get(skus.charAt(i)) + 1);
        }

        int aItemsPrice = ((cart.get('A') / 3) * 130) + ((cart.get('A') % 3) * 50);
        int bItemsPrice = ((cart.get('B') / 2) * 45) + ((cart.get('B') % 2) * 30);
        int cItemsPrice = cart.get('C') * 20;
        int dItemsPrice = cart.get('D') * 15;

        return aItemsPrice + bItemsPrice + cItemsPrice + dItemsPrice;
    }
}

