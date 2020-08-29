//package com.agripedia;


import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa serial number yang mau di buat? ");
        int jumlah = input.nextInt();
        generate(jumlah);
    }
    static void generate(int number) {
        for (int k = 1; k <= number; k++) {
            String result = new SecureRandom().ints(0, 36)
                    .mapToObj(i -> Integer.toString(i, 36))
                    .map(String::toUpperCase).distinct().limit(16).collect(Collectors.joining())
                    .replaceAll("([A-Z0-9]{4})", "$1-").substring(0, 19);

            System.out.println(result);
        }
    }
}