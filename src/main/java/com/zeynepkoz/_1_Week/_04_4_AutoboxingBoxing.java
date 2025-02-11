package com.zeynepkoz._1_Week;

public class _04_4_AutoboxingBoxing {

    public static void main(String[] args) {
        // Primitive Type'da Wraper Type'a Dönüştürme
        int primitiveType = 100;
        Integer wrapperValue = primitiveType; //Autoboxing
        System.out.println("Primitive Type:  " + primitiveType + "Wrapper Type: " + wrapperValue);

        // Unboxing : Wrapper Type --> Primitive Type dönüştürme
        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; //Unboxing
        System.out.println("Wrapper Type: " + wrapperValue2 + "Primiitive Type: " + primitiveValue2);

    }
}
