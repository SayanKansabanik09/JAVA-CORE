public class Bitwise {
    public static void main(String[] args){
        int a = 12, b = 9;
        // swap this two numbers

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a+" b = "+b);
    }
}
