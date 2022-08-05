public class Relational{
    public static void main(String[] args){


        int a =5, b = 10, c = 15;

        System.out.println(a > b); // false
        // using short circuit logical and operator
        System.out.println(a < b && a < c); //true
        System.out.println(a < b && a > c); // false
        // using logical and operator bitwise version
        System.out.println(a < b & a < c); // true
        System.out.println(a > b && a < c); // false

        // checking short-circuiting AND 
        System.out.println("a = " + a ); // 5
        System.out.println(a > b && a++ < c); // false
        System.out.println("a = " + a); // 5
        // Conclusion: whenever the first condition is false in this AND operation it doesnot bother to check the 
        //second condition is it true or false or any other expressions

        // checking bitwise or single version &
        System.out.println("a = " + a); // 5
        System.out.println(a > b & a++ < c); // false
        System.out.println("a = " + a); // 6
        // Conclusion : for single version of &, it will check both conditions to evaluate; thats why increment operation on variable
        // a working properly in this case.

        // checking short circuting OR
        System.out.println("a = " + a); // 5
        System.out.println(a < b || a++ > c); // true
        System.out.println("a = " + a); // 5

        //checking bitwise or single version OR
        System.out.println("a = " + a); // 5
        System.out.println(a < b | a++ > c); // true
        System.out.println("a = " + a); // 6

    }
}