package src.Array1d;

import java.util.Scanner;

/**
 * array5
 */
public class array5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //inisiasi
        System.out.print("Masukkan ukuran Array : "); int uk = in.nextInt();
        int[] A = new int[uk];
        int[] B = new int[uk];

        //input
        for (int i = 0; i<uk;i++){
            System.out.print("Nilai ke-"+(i+1)+" = ");
            A[i] = in.nextInt(); 
        }
        System.out.println();
        
        //memindahkan A-B
        int x = uk-1;
        for (int i = 0; i<uk;i++){
        B[x] = A[i];
        x--;
        }
        
        //output
        System.out.print("Array 1 = ");
        for (int i = 0; i<uk;i++){
            System.out.print(A[i]+" ");
            }
        System.out.println();
        
        System.out.print("Array 2 = ");
        for (int i = 0; i<uk;i++){
            System.out.print(B[i]+" ");
            }
        in.close();
            
    }
}