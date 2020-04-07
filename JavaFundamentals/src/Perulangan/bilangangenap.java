/**
 * bilangangenap
 */

import java.util.Scanner;

public class bilangangenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, genap = 0, ganjil = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("masukan nilai" + i + " :");
            a = input.nextInt();
            if (a % 2 == 0) {
            genap = genap + 1;
            } else {
            ganjil = ganjil + 1;}
        }
        System.out.println("Bilang ganjil : "+ ganjil);
        System.out.println("Bilang genap : "+genap);
    }
}
