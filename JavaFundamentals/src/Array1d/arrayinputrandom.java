package src.Array1d;

import java.util.*;

/**
 * arrayinputrandom
 */
public class arrayinputrandom {

    public static void main(String[] args) {
        int uk, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Ukuran Array : "); uk = in.nextInt();
        int[] A = new int[uk];
        int[] B = new int[uk];
        z = uk-1;
        //input
        for (int i = 0; i<uk;i++){
            System.out.print("Nilai ke-"+(i+1)+" = ");
            A[i] = (int)(Math.random()*100);
            B[z] = A[i];
            z--; 
        }

        System.out.println();
        for (int i = 0; i < uk; i++) {
            System.out.print("\n"+A[i]+"\t\t"+B[i]);
            System.out.println();
        }
        in.close();
    }
}