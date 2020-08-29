//package com.agripedia;

import java.util.Arrays;

public class Main {
    private char[] theArray = {'a', 'c', 'i', 'f', 'g', 'b' };

    void urutkan() {
        for (int i = theArray.length-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j+1]) {
                    swapHuruf(j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(theArray));
    }

    private void swapHuruf(int indexOne, int indexTwo) {
        char temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }


    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        System.out.println("Array sebelum diurutkan ");
        System.out.println(Arrays.toString(main.theArray));
        System.out.println("Array setelah diurutkan ");
        main.urutkan();
    }

}

