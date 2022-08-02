
/*
    Area of triangle
    area = (1/2) * base * height;
*/

import java.util.*;
public class Area {
    public static void main(String[] args){

        // int base = 4;
        // int height = 6;
        // int area = (1/2) * base * height;
        // System.out.println(area); // 0

        Scanner sc = new Scanner(System.in);
        double base,height,area;
        System.out.print("Enter the height : ");
        height = sc.nextDouble();
        System.out.print("Enter the base : ");
        base = sc.nextDouble();
        area  = 0.5 * base * height;
        System.out.println("The Area of triangle is : " + area);

        sc.close();
    }
}
