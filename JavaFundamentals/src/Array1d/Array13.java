package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * Array13
 * Pembuat :
 * Tanggal:
 * Deskripsi : Proses input array, salin dalam keadaan terbalik.
 */
public class Array13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int A[], B[];
        int i, n, x;
        Scanner in = new Scanner(System.in);
        System.out.print("Ukuran Array = ");
        n = in.nextInt();

        A = new int[n];
        B = new int[n];
        //isi A
        System.out.println("\n===Array A sebelum disalin ke Array B===");
        for(i=0; i<n; i++){
            A[i]= rand.nextInt(100)+1;
            System.out.print(A[i]+" \t");
        }

        //menyalin isi A ke B dalam kedaan terbalik
        System.out.println("\n===Array B setelah disalin dari Array A===");
        x=n-1;
        for (int j = 0; j < n; j++) {
            B[x] = A[j];
            x--;
        }
        for (int j2 = 0; j2 < n; j2++) {
            System.out.print(B[j2]+"\t");
        }
        in.close();
    }
}