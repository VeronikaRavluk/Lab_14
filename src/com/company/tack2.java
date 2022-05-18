package com.company;
import java.util.Scanner;

public class tack2 {
    public static void main(String[] args){
            String scan1, scan2, scan3, scan4, scan5;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть 1 слово:");
            scan1 = scanner.nextLine();

            System.out.println("Введіть 2 слово:");
            scan2 = scanner.nextLine();

            System.out.println("Введіть 3 слово:");
            scan3 = scanner.nextLine();

            System.out.println("Введіть 4 слово:");
            scan4 = scanner.nextLine();

            System.out.println("Введіть 5  слово:");
            scan5 = scanner.nextLine();

            System.out.println(scan1.substring(0,1));
            System.out.println(scan2.substring(0,1));
            System.out.println(scan3.substring(0,1));
            System.out.println(scan4.substring(0,1));
            System.out.println(scan5.substring(0,1));
        }

    }

