public class wideNarrow {
    public static void main(String[] args){
        // byte b = 10;
        // short s = 10;
        // int i = 10;
        // long l = 10;
        // float f = 120.5f;
        // double d = 100.2f;
        // char c = 10;
        // boolean boo = true;

        //  //i = f ; size error, widening not possible
        //  i = (int)f; // narrowing
        //  System.out.println(i);
        //  f = i;
        //  d = f;
        //  //f = d; size error, widening not possible
        // float fa = (float)d; // narrowing
        //  System.out.println(fa);


        float f = 12.5f;
        double d = 120.3645896;

        f = (float)d; // narrowing
        System.out.println(f); // 120.364586 lossing data

    }
}
