

import java.util.*;

class Circle {

    private double radius = 0;

    public void TakeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle : ");
        radius = sc.nextDouble();
    }

    public double Area() {
        return Math.PI * radius;

    }

    public double Perimeter() {
        return Math.PI * 2 * radius;
    }
;

};
public class Main {

    public static void main(String[] args) {
        Circle cr = new Circle();
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("----------------------CIRCLE ------------------------");
        System.out.println(" FUNCITON WHICH YOU WANT TO DO : ");
        System.out.println("1. AREA \n2. PERIMETER ");
        count = sc.nextInt();
        switch (count) {
            case 1:
                cr.TakeInput();
                cr.Area();
                break;
            case 2:
                cr.TakeInput();
                cr.Perimeter();
                break;
        }

    }

}
