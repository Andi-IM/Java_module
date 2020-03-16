package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * Array12
 * Pembuat :
 * Tanggal:
 * Deskripsi : Proses input array, dan menyalin Array.
 */
public class Array12 {

    public static void main(String[] args) {
        int A[], B[];
        int i, n;

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        A = new int[n];
        B = new int[n];
        //isi A

        for(i=0; i<n; i++){
            A[i]= rand.nextInt(100)+1;
            System.out.println(A[i]+" \t");
        }

        //menyalin isi A ke B
        System.out.print("\n===Array B setelah disalin dari Array A===");
        int x=0;
        for (int j = 0; j < n; j++) {
            B[i] = A[i];
            System.out.print(B[i]+" \t");
            x=x+1;
        }
        in.close();
    }
}