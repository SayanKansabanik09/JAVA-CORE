import java.util.*;
public class Cuboid {

    public static void main(String[] args){
        double length,height, breadth;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length: ");
        length = sc.nextDouble();
        System.out.print("enter the height: ");
        height = sc.nextDouble();
        System.out.print("enter the breadth: ");
        breadth = sc.nextDouble();


        double frontBackArea = length * height;
        double rightLeftArea = breadth * height;
        double bottomTopArea = length * breadth;

        double volume = length * height * breadth;
        double totalArea = 2*(frontBackArea + rightLeftArea + bottomTopArea);
        // 2* ()
        System.out.println("Total Area of Cuboid is: " + totalArea);
        System.out.println("Total volume of Cuboid is: "+ volume);

        sc.close();
    }
    
}
