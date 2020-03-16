package src.Array1d;

import java.util.Scanner;

/**
 * array6
 */
public class array6 {

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
            System.out.print("Nilai ke-"+(i+1)+" = ");
            A[i] = in.nextInt(); 
            }
        System.out.println("\n Array B");
            for (int i = 0; i < uk2;i++) {
                System.out.print("Nilai ke-"+(i+1)+" = ");
                B[i] = in.nextInt(); 
            }
        System.out.println();

            //melakukan selisih
            for (int i = 0; i < uk2;i++) {
                if (A[i]>B[i]) {
                    C[i] = A[i]-B[i];   
                } else if (A[i]<B[i]) {
                    C[i] = B[i]-A[i];
                }
                System.out.print(C[i]+" ");
            }
        } else{
            System.out.print("Maaf ukuran kedua array tidak sama");
        }
        in.close();
    }
}