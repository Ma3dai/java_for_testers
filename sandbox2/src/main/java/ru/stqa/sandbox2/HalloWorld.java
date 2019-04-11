package ru.stqa.sandbox2;

public class HalloWorld {

    public static void main (String[] args) {

        hallo(" world");
        hallo(" user");


        Square s = new Square(30);
        System.out.println("Площадь квадрата со сторонами " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(4, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
    }

    public static void hallo(String somebody) {
        System.out.println("Hallo" + somebody);
    }




}
