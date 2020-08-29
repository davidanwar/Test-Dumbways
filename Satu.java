//package com.agripedia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Scanner input = new Scanner(System.in);
        System.out.println("Berapa jumlah orang yang hadir : ");
       int person = input.nextInt();
       countHandshake(person);



    }
    public static void countHandshake(int person) {
        int count = 0;
        for (int i = person-1; i >= 1; i-- ) {
            count = count + i;
        }
        System.out.println("Jumlah jabat tangan adalah " + count);
    }



}