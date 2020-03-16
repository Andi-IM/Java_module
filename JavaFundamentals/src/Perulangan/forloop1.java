package Perulangan;

import java.util.Scanner;

/**
 * forloop1
 */
public class forloop1 {
    public static void main(String[] args) {
        int bil;
        int i,a=0;
        Scanner in = new Scanner(System.in);
        bil = in.nextInt();
        for (i = 0; i<=bil; i++) {
        if (a>9) {
            a = 0;
        }
        System.out.print(a+" ");
        a++;
        }
    }
}