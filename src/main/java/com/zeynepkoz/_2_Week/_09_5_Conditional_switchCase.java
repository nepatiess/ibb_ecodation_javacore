package com.zeynepkoz._2_Week;
import java.util.Scanner;

public class _09_5_Conditional_switchCase {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number=scanner.nextInt();

        // switch-case
        switch (number) {
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println(number + " 1<=NUMBER<=5 dışındadır");
                break;
        }
    }
}
