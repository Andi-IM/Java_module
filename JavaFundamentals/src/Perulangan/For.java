package Perulangan;
import java.util.Scanner;

/**
 * For
 * accepted
 */
public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0, i=0, jbil=0, bil=0;
        n = in.nextInt();
        
        for (int j = 1; j <= n; j++) {
            bil = in.nextInt();
            jbil+=bil;
        }
        System.out.println(jbil);
    }
}