package src.Array1d;

import java.util.*;
/**
 * Nama / BP : Andi Irham Marhamuddin / 1911082006
 * Kelas     : TRPL 1 B
 * Deskripsi : Menggabungkan 2 Array
 */
public class array8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //inisiasi
        System.out.print("Masukkan ukuran Array A: "); int uk1 = in.nextInt();
        System.out.print("Masukkan ukuran Array B: "); int uk2 = in.nextInt();
        int[] A = new int[uk1];
        int[] B = new int[uk2];
        int X = uk1+uk2;
        int[] C = new int[X];
        int Z;
        
            //input
            System.out.print("Array A : ");
            for (int i = 0; i<uk1;i++){
                //System.out.print("Nilai ke-"+(i+1)+" = ");
                A[i] = (int)(Math.random()*100); 
            }
            //output Array A
            for (int i = 0; i <uk1;i++) {
                System.out.print(A[i]+" ");
            }
            System.out.print("\nArray B : ");
            for (int i = 0; i < uk2;i++) {
                //System.out.print("Nilai ke-"+(i+1)+" = ");
                B[i] = (int)(Math.random()*100); 
            }
            //Output Array B
            for (int i = 0; i <uk2;i++) {
                System.out.print(B[i]+" ");
            }
            System.out.println();

        if (uk1 < uk2) {
            Z = uk1;
            System.out.print("Array C : ");
            for (int i = 0; i < uk1; i++) {
                C[i] = A[i];
            }
            for (int i = 0; i <uk2; i++) {
                C[Z] = B[i];
                Z++;
            }

            for(int i = 0; i<X;i++){
                System.out.print(C[i]+" ");
            }
        }   
        else if(uk2 < uk1){
            Z = uk2;
            System.out.print("Array C : ");
            for (int i = 0; i < uk1; i++) {
                C[i] = B[i];
            }
            for (int i = 0; i <uk2; i++) {
                C[Z] = A[i];
                Z++;
            }

            for(int i = 0; i<X;i++){
                System.out.print(C[i]+" ");
            }
        }
        else{
            Z = uk1;
            System.out.print("Array C : ");
            for (int i = 0; i < uk1; i++) {
                C[i] = A[i];
            }
            for (int i = 0; i <uk2; i++) {
                C[Z] = B[i];
                Z++;
            }
            for(int i = 0; i<X;i++){
                System.out.print(C[i]+" ");
            }
        }
        in.close();
    }
}