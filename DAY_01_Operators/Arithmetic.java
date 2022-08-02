public class Arithmetic{
    public static void main(String[] args){
        System.out.println("Hello World");

        int a = 14, b = 5;

        int c = a / b;
        int r = a % b;
        float f = a / b; 
        float fl = (float)a/b;
        System.out.println(c); // 2
        System.out.println(r);  // 4
        System.out.println(f); // 2.0 because int/int division is between integers gives the result 2 but when it is stored as float type variable gives 2.0
        System.out.println(fl); // 2.8 


        float f1 = 14.3f, f2 = 3.2f; // 2.3f f is mentioned otherwiswe it is treated as double literal
        //in java any decimal value by default treated as double
        float fD = f1 / f2;
        float fR = f1 % f2;
        
        System.out.println(fD);
        System.out.println(fR);

        byte ab = 10;
        short cd = 15;

        //byte ef = ab + cd; //error 
        //short ef = ab +cd; //error
        int ef = ab + cd;
        System.out.println(ef);


        float gh = 12.5f;
        double ij = 2563.3;

        //float kl = gh + ij;
        double kl = gh + ij;
        System.out.println(kl);

         
    }
}