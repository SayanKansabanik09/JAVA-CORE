public class IncDec {
    public static void main(String[] args){
        int x = 5;
        x++;
        System.out.println(x);

        //int a =2, b = 3, c;
        //c = 2 * a++ + 3 * ++b;
        //int d = 2 * a++ + 3 * ++a;
        //System.out.println(c); // 2 * 2 + 3 * 4 = 16
        //System.out.println(d); // 2 * 2 + 3 * 4 = 16

        // char a = 'A';
        // a++;
        // System.out.println(a); // B 66

        byte b = 4;
        b++;
        System.out.println(b); // 5 which is byte type
        // b= b + 1; // throws error 1 is integer literal
    }
}