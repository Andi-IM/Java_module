import java.util.Scanner;

/**
 * konversisuhu
 */
public class konversisuhu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int c, r,f,k;
        c = in.nextInt();
        
        r= reamur(c);
        f= farenheit(c);
        k= kelvin(c);

        System.out.println(r);
        System.out.println(f);
        System.out.println(k);
    }
    public static int reamur(int c) {
        int R;
        R = c/4*5;
        return R;
    }
    public static int farenheit(int c) {
        int F;
        F = (c*9/5)+32;
        return F;
    }
    public static int kelvin(int c) {
        int K;
        K = c+273;
        return K;
    }
}