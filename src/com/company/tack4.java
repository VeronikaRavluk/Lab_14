package com.company;
import java.util.Scanner;
public class tack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String n = scan.nextLine();
        System.out.print("Введіть ім'я: ");
        String n1 = scan.nextLine();
        boolean t = n.equalsIgnoreCase(n1);
        System.out.print(t);

    }
}
