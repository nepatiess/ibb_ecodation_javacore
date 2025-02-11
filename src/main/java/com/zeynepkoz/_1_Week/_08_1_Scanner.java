package com.zeynepkoz._1_Week;
import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {

        // Field
        String name,surname;
        int language;

        // Kullanıcıdan veri almak istiyorsak
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz: ");
        name = klavye.nextLine();

        System.out.println("Lütfen soyadınızı giriniz: ");
        surname = klavye.nextLine();

        // Stringten'ten int geçerken nasıl çözebiliriz?
        System.out.println("Bildiğiniz diller veya teknolojiler: ");
        language = klavye.nextInt();

        System.out.println("Adınız: " + name + "Soyadınız: " + surname + "Diller: " + language);

        // kullanmadığım Scanner nesnesini kapatalım.
        klavye.close();
    }
}
