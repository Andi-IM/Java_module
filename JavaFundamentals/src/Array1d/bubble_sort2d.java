package Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * bubble_sort2d
 */
public class bubble_sort2d {

    public static void main(String[] args) {
        int baris, kolom, i, j, tukar, x, coba, b;
        int c;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Baris: "); baris = in.nextInt();
        System.out.print("Masukkan Kolom: "); kolom = in.nextInt();
        int a[][] = new int[baris][kolom];

        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                a[i][j] = rand.nextInt(10)+1;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        if (baris < kolom) {
            c = kolom;
        } else if (baris > kolom) {
            c = baris;
        } else {
            c = baris + kolom;
        } */

        for (i = 0; i <baris; i++) {
            //bubble sort ascending
            for (j = 0; j < kolom; j++) {
                int o = i;
                int y = j;
                for (int k = 0; k < baris; k++) {
                    for (int l = 0; l < kolom; l++) {
                        if (a[o][y] < a[k][l]) {
                            o = k; y = l;
                        }
                        tukar     = a[i][j];
                        a[i][j]   = a[o][y];
                        a[o][y] = tukar;     
                    }
                }
            }
        }
            //System.out.println("\n isi Array Setelah diurutkan Ascending Proses "+b);
            for (i = 0; i < baris; i++) {
                for (j = 0; j < kolom; j++) {
                    System.out.print(a[i][j] +"\t");
                }
                System.out.println();
            }

    }
}