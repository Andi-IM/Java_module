package Array1d;

import java.util.Scanner;

/**
 * seq_search
 */
public class seq_search {

    public static void main(String[] args) {
        int cari, jum=0, n;
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan banyak data : ");
        n = in.nextInt();
        int array[] = new int[n];

        System.out.println("Masukkan "+n+" buah bilangan bulat");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt(); //(int)(Math.random()*100);
        }

        System.out.println("Masukkan bilangan yang ingin dicari :");
        cari = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i]==cari) {
                System.out.println(cari+" ada pada posisi ke-"+(i+1));
                jum=jum+1;
            }
        }
        if (jum == 0) {
            System.out.println(cari+" tidak ada pada array.");
        }
    }
}