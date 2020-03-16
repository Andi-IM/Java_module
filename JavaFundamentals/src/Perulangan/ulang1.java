package Perulangan;

import java.util.Scanner;

/**
 * ulang1
 */
public class ulang1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baris,kolom;
        baris=in.nextInt();
        kolom=in.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
            if (i>0 && i<baris-1 && j>0 && j<kolom-1) {    
                System.out.print("0 \t");
            }else{
                System.out.print("1 \t");
            }
        }
        System.out.println();
        }
}
}