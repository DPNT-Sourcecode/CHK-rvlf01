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
        //System.out.println(cart.get('E') + "E have been bought, number of chargeable B goes from " + cart.get('B') + " to " + newBCount);
        cart.put('B', newBCount);

        // Apply buy two F get one F free
        int newFCount = cart.get('F') - cart.get('F') / 3;
        //System.out.println(cart.get('F') + "F have been bought, number of chargeable F goes from " + cart.get('F') + " to " + newFCount);
        cart.put('F', newFCount);

        // Apply buy three N get one M free
        int newMCount = Math.max(0, cart.get('M') - cart.get('N') / 3);
        //System.out.println(cart.get('N') + "N have been bought, number of chargeable M goes from " + cart.get('M') + " to " + newMCount);
        cart.put('M', newMCount);

        // Apply buy three R get one Q free
        int newQCount = Math.max(0, cart.get('Q') - cart.get('R') / 3);
        //System.out.println(cart.get('R') + "R have been bought, number of chargeable Q goes from " + cart.get('Q') + " to " + newQCount);
        cart.put('Q', newQCount);

        // Apply buy two U get one F free
        int newUCount = cart.get('U') - cart.get('U') / 3;
        //System.out.println(cart.get('U') + "U have been bought, number of chargeable U goes from " + cart.get('U') + " to " + newUCount);
        cart.put('U', newUCount);

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
        int gItemsPrice = gCount * 20;
        int hItemsPrice = ((hCount / 10) * 80) + (((hCount % 10) / 5) * 45) + (((hCount % 10) % 5) * 10);
        int iItemsPrice = iCount * 35;
        int jItemsPrice = jCount * 60;
        int kItemsPrice = ((kCount / 2) * 150) + ((kCount % 2) * 80);
        int lItemsPrice = lCount * 90;
        int mItemsPrice = mCount * 15;
        int nItemsPrice = nCount * 40;
        int oItemsPrice = oCount * 10;
        int pItemsPrice = ((pCount / 5) * 200) + ((pCount % 5) * 50);
        int qItemsPrice = ((qCount / 3) * 80) + ((qCount % 3) * 30);
        int rItemsPrice = rCount * 50;
        int sItemsPrice = sCount * 30;
        int tItemsPrice = tCount * 20;
        int uItemsPrice = uCount * 40;
        int vItemsPrice = ((vCount / 3) * 130) + (((vCount % 3) / 2) * 90) + (((vCount % 3) % 2) * 50);
        int wItemsPrice = wCount * 20;
        int xItemsPrice = xCount * 90;
        int yItemsPrice = yCount * 10;
        int zItemsPrice = zCount * 50;

        return aItemsPrice +
               bItemsPrice +
               cItemsPrice +
               dItemsPrice +
               eItemsPrice +
               fItemsPrice +
               gItemsPrice +
               hItemsPrice +
               iItemsPrice +
               jItemsPrice +
               kItemsPrice +
               lItemsPrice +
               mItemsPrice +
               nItemsPrice +
               oItemsPrice +
               pItemsPrice +
               qItemsPrice +
               rItemsPrice +
               sItemsPrice +
               tItemsPrice +
               uItemsPrice +
               vItemsPrice +
               wItemsPrice +
               xItemsPrice +
               yItemsPrice +
               zItemsPrice;
    }
}

