import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *  ACCEPTED
 */

public class floorcell {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n;
        long c, x;
        DecimalFormat df = new DecimalFormat("#");
        n = in.nextFloat();
        if (n == (int) n) {
            n =(int)n;
            System.out.println(df.format(n)+" "+df.format(n));
        }

        else
        
        if (n<0) {
            c = (int) n;
            x = c-1;
            System.out.println(x+" "+c);
        } else
        if (n>0) {
            c = (int) n;
            x = c+1;
            System.out.println(c+" "+x);
        }
    }
}