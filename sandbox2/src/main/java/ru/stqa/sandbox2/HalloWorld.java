package ru.stqa.sandbox2;

public class HalloWorld {

    public static void main (String[] args) {

        hallo(" world");
        hallo(" user");


        Square s = new Square(30);
        System.out.println("Площадь квадрата со сторонами " + s.l + " равна " + area(s));

        Rectangle r = new Rectangle(4, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + area(r));
    }

    public static void hallo(String somebody) {
        System.out.println("Hallo" + somebody);
    }

    public static double area (Square s){
        return s.l * s.l;
    }

    public static double area (Rectangle r){
        return r.a * r.b;
    }
}
