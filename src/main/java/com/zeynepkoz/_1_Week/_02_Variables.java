package com.zeynepkoz._1_Week;

public class _02_Variables {
    public static void main(String[] args) {
        // Veri değişken isimleri yazarken:


        // Veri İsimlendirmeleri:
        // 1) isim, sıfat veya zamir kullanmamız lazım.
        // 2) _ veya $ ile başlayabiliriz.
        // 3)sayı ile bitebilir.
        // 4) sayı ile başlamaz.
        // 5) _ veya $ dışında özel simgelerle başlamaz.
        // 6) değişken isimleri camelCase kurallarına göre yazılır

        // 1) isim, sıfat veya zamir kullanmamız lazım.
        // Anlamlı ve açıklayıcı isimler seçiniz.
        int schoolNumber = 25;
        System.out.println("old: " + schoolNumber);

        schoolNumber = 43;
        System.out.println("new: " + schoolNumber);

        //2) _ veya $ ile başlayabiliriz.
        int _schoolNumber = 99;
        System.out.println(_schoolNumber);

        int $schoolNumber = 43;
        System.out.println($schoolNumber);

        // 3)sayı ile bitebilir.
        int schollNumber123 = 123;
        System.out.println(schollNumber123);

        // kebab-case yazamayız:
        // int school-number = 81;

        // aynı isimde yazamayız:
        // int schoolNumber = 52;

        // 4) sayı ile başlamaz.
        // int 8schoolNumber = 11; // sayı ile başlayamayız.

        // 5) _ veya $ dışında özel simgelerle başlamaz.
        // int -schoolNumber = 898; // özel simgeyle yazılmaz.
        // int ``schoolNumber = 56; // özel simgeyle başlamaz.

        // yazmayalım:
        // float TotalSalary = 14.546f;
        // System.out.println(TotalSalary);

        // T --> t yazalım.

        // SABIT Sayılar
        final int MAX_STUDENTS = 200;
        System.out.println(MAX_STUDENTS);




    }
}
