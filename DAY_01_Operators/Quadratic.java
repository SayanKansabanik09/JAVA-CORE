/*
 * ax^2 + bx + c = 0
 */
import java.util.*;
public class Quadratic{
    public static void main(String[] args){

        int a,b,c;
        double r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quoefficient of Quadratic equation: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.println("Roots: " + r1 + " ,"+ r2);

        sc.close();
    }
}