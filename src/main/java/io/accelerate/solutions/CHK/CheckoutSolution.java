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

        if (!skus.matches("[ABCDE]+")) {
            return -1;
        }

        HashMap<Character, Integer> cart = new HashMap<>();
        cart.put('A', 0);
        cart.put('B', 0);
        cart.put('C', 0);
        cart.put('D', 0);
        cart.put('E', 0);

        for (int i = 0; i < skus.length(); i++) {
            cart.put(skus.charAt(i), cart.get(skus.charAt(i)) + 1);
        }

        // Apply buy two E get one B free
        int newBCount = Math.max(0, cart.get('B') - cart.get('E') / 2);
        System.out.println(cart.get('E') + "E have been bought, number of chargeable B goes from " + cart.get('B') + " to " + newBCount);
        cart.put('B', newBCount);

        int aCount = cart.get('A');
        int bCount = cart.get('B');
        int cCount = cart.get('C');
        int dCount = cart.get('D');
        int eCount = cart.get('E');

        int aItemsPrice = ((aCount / 5) * 200) + (((aCount % 5) / 3) * 130) + (((aCount % 5) % 3) * 50);
        int bItemsPrice = ((bCount / 2) * 45) + ((bCount % 2) * 30);
        int cItemsPrice = cCount * 20;
        int dItemsPrice = dCount * 15;
        int eItemsPrice = eCount * 40;

        return aItemsPrice + bItemsPrice + cItemsPrice + dItemsPrice + eItemsPrice;
    }
}







