package src.Array1d;

import java.util.*;
/**
 * array7
 */
public class array7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //inisiasi
        System.out.print("Masukkan ukuran Array A: "); int uk1 = in.nextInt();
        System.out.print("Masukkan ukuran Array B: "); int uk2 = in.nextInt();
        int[] A = new int[uk1];
        int[] B = new int[uk2];
        int[] C = new int[uk1];
        
        if (uk1 == uk2) {
            //input
            System.out.println("Array A");
            for (int i = 0; i<uk1;i++){
            //System.out.print("Nilai ke-"+(i+1)+" = ");
            A[i] = (int)(Math.random()*100); 
            }
        System.out.println("\n Array B");
            for (int i = 0; i < uk2;i++) {
                //System.out.print("Nilai ke-"+(i+1)+" = ");
                B[i] = (int)(Math.random()*100); 
            }
        System.out.println();
            //output masing-masing array
            for (int i = 0; i < uk2;i++) {
                System.out.print(A[i]+" ");
            }
            System.out.println();
            for (int i = 0; i < uk2;i++) {
                System.out.print(B[i]+" ");
            }
            System.out.println();

            //melakukan perbandingan
            for (int i = 0; i < uk2;i++) {
                if (A[i]>B[i]) {
                    C[i] = A[i];   
                } else{
                    C[i] = B[i];
                }
                System.out.print(C[i]+" ");
            }
        } else{
            System.out.print("Maaf ukuran kedua array tidak sama");
        }
        in.close();
    }
}