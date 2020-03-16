package src.Array1d;

import java.util.Scanner;

/**
 * Array9
 *  Nama  : Andi Irham Marhamuddin / 1911082006
 *  Kelas : TRPL 1B
 *  Deskripsi : Menyisipkan Sebuah Array
 */
public class Array9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        //pengulangan
        do{
        //inisiasi
        System.out.print("Masukkan ukuran Array A: "); int uk1 = in.nextInt();
        int[] A = new int[uk1];
        int X = uk1+1;
        int[] B = new int[X];
        int is, ang;
        
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
            System.out.print("\nIndeks sisip: "); is = in.nextInt();
            System.out.print("Angka sisip: "); ang = in.nextInt();

            //input B
            for (int i = 0; i < B.length; i++) {
                if (i < is) {
                    B[i]= A[i];
                } else if(i == is){
                    B[i] = ang;
                }else if(i > is){
                    B[i] = A[i-1];
                }
            }
            //output B
            System.out.print("Array B : ");
            for (int i = 0; i < B.length; i++) {
                System.out.print(B[i]+" ");
            }
            System.out.println();
            System.out.println("\nLanjut ga? (0 / 1)"); 
            x=in.nextInt(); //x=in.next().charAt(0);
        
        }while(x>0 && x<2);

        in.close();
    }
}