package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        System.out.print("Введіть слово 1:");
        String w1 = scan.nextLine();
        System.out.print("Введіть слово 2:");
        String w2 = scan.nextLine();
        System.out.print("Введіть слово 3:");
        String w3 = scan.nextLine();
        System.out.print("Введіть слово 4:");
        String w4 = scan.nextLine();
        System.out.print("Введіть слово 5:");
        String w5 = scan.nextLine();
        w1 = w1.concat(" " + w2 + " " + w3 + " " + w4 + " " + w5);
        System.out.print(w1 + ".");
    }
}


