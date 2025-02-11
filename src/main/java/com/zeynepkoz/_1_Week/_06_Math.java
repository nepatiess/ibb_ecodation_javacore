package com.zeynepkoz._1_Week;

public class _06_Math {

    public static void main(String[] args) {
        // NaN: Not a Number
        System.out.println("En küçük: " + Math.min(3,10));
        System.out.println("En büyük: " + Math.max(-300,10));

        System.out.println("Mutlak değer: " + Math.abs(-100));
        System.out.println("Karekök: " + Math.sqrt(25));
        System.out.println("Mutlak değer:" + Math.sqrt(Math.abs(-100)));
        System.out.println("Üslü sayı: " + Math.pow(2,5));

        System.out.println("Alta yuvarla: " + Math.floor(2.9));
        System.out.println("Üste yuvarla: " + Math.ceil(2.1));
        System.out.println("Üste yuvarla: " + Math.ceil(2.000000000001));
        System.out.println("Ortalama yuvarla: " + Math.round(3.4)); // .4 aşağı yuvarlar
        System.out.println("Ortalama yuvarla: " + Math.round(3.5)); // 5 ve yukarı ise yukarı yuvarla

        System.out.println("Pi sayısı: " + Math.PI);
        System.out.println("e sayısı: " + Math.E);

        System.out.println("Trigonometrik Sinüs: " + Math.sin(1));
        System.out.println("Trigonometrik Asinüs: " + Math.asin(1));
        System.out.println("Trigonometrik Cosinus: " + Math.cos(1));
        System.out.println("Trigonometrik Tanjant: " + Math.tan(1));

    }

}

