package src.Array1d;

import java.util.Scanner;

/**
 * anoseq_sch
 */
public class anoseq_sch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[] = new int[100];
        int n, i, x=0, ix=0;
        int flag;

        n = in.nextInt();
        for (i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        i = 0 ; flag = 0;
        while (flag==0 && i<n) {
            if (A[i]==x) {
                flag = 1;
                ix = 1;
            }
            i+=1;
        }

        if (flag==1) {
            System.out.println("nilai ada pada index "+ix);
        }else{
            System.out.println("NIlai tak ditemukan!");
        }
        in.close();
    }
}