package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * Array14
 * Pembuat :
 * Tanggal:
 * Deskripsi : Proses input array, salin dalam keadaan terbalik.
 */
public class Array14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int A[], B[];
        int i, n;
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
           //menyalin isi A ke B
           for (int j = 0; j < n; j++) {
               B[j] = A[j];
           }
         //mencari bilangan genap dari Array B
         System.out.println("\n===Array B setelah dicari bilangan genapnya===");
         for (int j = 0; j < B.length; j++) {
             if (B[j]%2==0) {
                 System.out.print(B[j]+"\t");
             } 
         }
         in.close();
    }
}