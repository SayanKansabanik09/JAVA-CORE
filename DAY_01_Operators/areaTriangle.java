/*
 * s = (a+b+c)/2
 * s = root s(s-a)(s-b)(s-c)
 */

import java.util.*;
public class areaTriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lengths : ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double semiPerimeter = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(semiPerimeter*(semiPerimeter - side1)*(semiPerimeter - side2)*(semiPerimeter - side3));
        // sqrt return double type
        System.out.println("The Area of the triangle is: "  + area);

        sc.close();
    }
}
