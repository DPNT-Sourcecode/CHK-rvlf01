package io.accelerate.solutions.CHK;

import java.util.HashMap;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        System.out.println(skus);

        if (skus == null) {
            return -1;
        }

        if (skus.isEmpty()) {
            return 0;
        }

        if (!skus.matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]+")) {
            return -1;
        }

        HashMap<Character, Integer> cart = new HashMap<>();
        cart.put('A', 0);
        cart.put('B', 0);
        cart.put('C', 0);
        cart.put('D', 0);
        cart.put('E', 0);
        cart.put('F', 0);
        cart.put('G', 0);
        cart.put('H', 0);
        cart.put('I', 0);
        cart.put('J', 0);
        cart.put('K', 0);
        cart.put('L', 0);
        cart.put('M', 0);
        cart.put('N', 0);
        cart.put('O', 0);
        cart.put('P', 0);
        cart.put('Q', 0);
        cart.put('R', 0);
        cart.put('S', 0);
        cart.put('T', 0);
        cart.put('U', 0);
        cart.put('V', 0);
        cart.put('W', 0);
        cart.put('X', 0);
        cart.put('Y', 0);
        cart.put('Z', 0);


        for (int i = 0; i < skus.length(); i++) {
            cart.put(skus.charAt(i), cart.get(skus.charAt(i)) + 1);
        }

        // Apply buy two E get one B free
        int newBCount = Math.max(0, cart.get('B') - cart.get('E') / 2);
        System.out.println(cart.get('E') + "E have been bought, number of chargeable B goes from " + cart.get('B') + " to " + newBCount);
        cart.put('B', newBCount);

        // Apply buy two F get one F free
        int newFCount = cart.get('F') - cart.get('F') / 3;
        System.out.println(cart.get('F') + "F have been bought, number of chargeable F goes from " + cart.get('F') + " to " + newFCount);
        cart.put('F', newFCount);

        int aCount = cart.get('A');
        int bCount = cart.get('B');
        int cCount = cart.get('C');
        int dCount = cart.get('D');
        int eCount = cart.get('E');
        int fCount = cart.get('F');
        int gCount = cart.get('G');
        int hCount = cart.get('H');
        int iCount = cart.get('I');
        int jCount = cart.get('J');
        int kCount = cart.get('K');
        int lCount = cart.get('L');
        int mCount = cart.get('M');
        int nCount = cart.get('N');
        int oCount = cart.get('O');
        int pCount = cart.get('P');
        int qCount = cart.get('Q');
        int rCount = cart.get('R');
        int sCount = cart.get('S');
        int tCount = cart.get('T');
        int uCount = cart.get('U');
        int vCount = cart.get('V');
        int wCount = cart.get('W');
        int xCount = cart.get('X');
        int yCount = cart.get('Y');
        int zCount = cart.get('Z');



        int aItemsPrice = ((aCount / 5) * 200) + (((aCount % 5) / 3) * 130) + (((aCount % 5) % 3) * 50);
        int bItemsPrice = ((bCount / 2) * 45) + ((bCount % 2) * 30);
        int cItemsPrice = cCount * 20;
        int dItemsPrice = dCount * 15;
        int eItemsPrice = eCount * 40;
        int fItemsPrice = fCount * 10;

        return aItemsPrice + bItemsPrice + cItemsPrice + dItemsPrice + eItemsPrice + fItemsPrice;
    }
}
