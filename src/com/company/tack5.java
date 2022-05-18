package com.company;
import java.util.Scanner;

public class tack5 {
    public static void main(String[] args){
        String firstLine, secondLine;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        firstLine = scanner.nextLine();

        System.out.println("Введіть другий рядок");
        secondLine = scanner.nextLine();

        if (firstLine.length() > secondLine.length()){
            System.out.println("Перший рядок  більшим");
        }
        if (secondLine.length() > firstLine.length()){
            System.out.println("Другий рядок більший");
        }
        else{
            System.out.println("Рядки рівні");
        }
    }
}
