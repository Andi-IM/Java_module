package src.Array1d;

import java.util.Scanner;
public class Array3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //inisiasi
        System.out.print("Masukkan Ukuran Array = ");
        int uk = in.nextInt();
        
        int[] A = new int[uk];
        int[] B = new int[uk];
        //int total=0,banyak=0;
            
        //input
        for (int i = 0; i<uk;i++){
            System.out.print("Nilai ke-"+(i+1)+" = ");
            A[i] = in.nextInt(); 
        }
        
        System.out.println();

        //output
        for (int i = 0; i<uk;i++){
        B[i] = B[i] + A[i]; 
        System.out.println(A[i]);
        System.out.print("\t");
        System.out.println(B[i]);
        }

        in.close();
    }
}