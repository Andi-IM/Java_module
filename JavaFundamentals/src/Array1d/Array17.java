package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * Array17
 */
public class Array17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int n,i;
        int A1, B1, C, D, E;
        A1=B1=C=D=E=0;
        System.out.print("Masukkan banyak data: "); n = in.nextInt();

        int A[]=new int[n];
        char B[]= new char[n];
        for (i = 0; i < n; i++) {
            A[i]=rand.nextInt(100);
            System.out.print("A["+i+"] ="+A[i]+"   \t");

            if (A[i]>=0 && A[i]<=40) {
                B[i]='E';
            }else if (A[i]>=41 && A[i]<=50) {
                B[i]='D';
            }else if (A[i]>=51 && A[i]<=65) {
                B[i]='C';
            }else if (A[i]>=66 && A[i]<=80) {
                B[i]='B';
            }else{
                B[i]='A';
            }

            System.out.println("B["+i+"] ="+B[i]);
        }
        System.out.println();
        for (i = 0; i < n; i++) {
        if (B[i]=='A') {
            A1+=1;
        }else if (B[i]=='B') {
            B1+=1;
        }else if (B[i]=='C') {
            C+=1;
        }else if (B[i]=='D') {
            D+=1;
        }else{
            E+=1;
        }
    }
        //System.out.println();
        System.out.println("A= "+A1+" orang");
        System.out.println("B= "+B1+" orang");
        System.out.println("C= "+C+" orang");
        System.out.println("D= "+D+" orang");
        System.out.println("E= "+E+" orang");
    in.close();
    }
}