package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * arraygn
 */
public class arraygn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int n, cnt=0;
        n = in.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i]=ran.nextInt(10)+1;
        }

        System.out.println("Hasil Array\n");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"\t");
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i]%2==0) {
                A[i]=1;
                cnt++;
            }else{
                A[i]=0;
            }
        }

        System.out.println("Hasil Perubahan Array\n");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"\t");
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i]==1) {
                System.out.print("\narray genap berada pada indeks "+i);
            }
        }
        System.out.println("\nJumlah bilangan genap= "+cnt);
        in.close();
    }
}