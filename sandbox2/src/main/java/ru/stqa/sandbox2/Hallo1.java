package ru.stqa.sandbox2;

public class Hallo1 {

    public static void main (String[] args) {

        hallo("world");
        hallo("user");

        double a = 4.0;
        double b = 8;

        System.out.println("Площадь квадрата со сторонами " + a + "равна " + area(a));
    }

    public static void hallo(String somebody) {
        System.out.println("Hallo" + somebody);
    }

    public static double area (double l){
        return l * l;
    }
}
