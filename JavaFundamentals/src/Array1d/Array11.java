package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * Array11
 * Pembuat :
 * Tanggal:
 * Deskripsi : Proses input array, hitung jumlah, hitung rata-rata, max, min, array 1Dimensi
 */
public class Array11 {

    public static void main(String[] args) {
        Random Random = new Random();
        int A = Random.nextInt(100);
        int nilai[];
        int i, n, jum=0;
        int max, imax, min, imin;
        float rata;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan ukuran Array : " ); n = in.nextInt();

        nilai = new int[n];
        System.out.print("Masukkan "+n+" buah bilangan bulat.");
        nilai[0]= (int)(Math.random()*100);  //in.nextInt();
        jum = nilai[0];
        max = nilai[0]; imax = 0;
        min = nilai[0]; imin = 0;
        for (i = 1; i < n; i++) 
        {
            nilai[i]= (int)(Math.random()*100); //in.nextInt();
            jum=jum+nilai[i];
            if(nilai[i]>max)
            {
                max = nilai[i];
                imax = i;
            }
            if(nilai[i]>max)
            {
                min = nilai[i];
                imin = i;
            }
        }
        rata=(float) jum/n;
        System.out.println("===Isi Array===");
        for (i = 0; i <n; i++) {
            System.out.println("nilai ["+i+"] = "+nilai[i]);
        }
        System.out.println("Angka rahasia A = "+A);
        System.out.println("Jumlah = "+jum);
        System.out.println("Rata-rata = "+rata);
        System.out.println("nilai terbesar = "+max+" pada indeks "+imax);
        System.out.println("nilai terkecil = "+min+" pada indeks "+imin);
        in.close();
    }
}