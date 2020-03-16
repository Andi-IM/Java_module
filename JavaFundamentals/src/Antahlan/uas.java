import java.util.Scanner;

/**
 * uas
 */
public class uas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d,e,f,g;
        float h;

        a=in.nextInt();
        b=in.nextInt();
        c=b; d=b; e=b;

        for (int i = 2; i <= a; i++) {
            b=in.nextInt();
            c+=b;
            if (b<d) {
                d=b;
            }
            if (b>e) {
                e=b;
            }
        }

        f=c-d-e;
        g=a-2;
        h=f/g;
        System.out.println(h);
    }
}