package src.Array1d;

//import java.io.*;
import java.util.Scanner;

/**
 * Array10
 * 
 * Sama dengan soal 9 cuma user difasilitasi untuk menghapus array pada indeks terntentu.
 * contoh : 
 *      ukuran = 4
 *  12 44 55 23
 * hapus urutan ke 3
 *  12 44 23
 */
public class Array10 {

    public static void main(final String[] args) {
        //final BufferedReader bilangan = new BufferedReader(new InputStreamReader(System.in));
        final Scanner in = new Scanner(System.in);
        int x, y;
        // pengulangan
        do {
            // inisiasi
            System.out.print("Masukkan ukuran Array A: ");
            final int uk1 = in.nextInt();
            final int[] A = new int[uk1];
            final int X = uk1 + 1;
            final int[] B = new int[X];
        int is, ang, del;
        
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

            System.out.print("\nmau dihapus salah satu indeksnya ga? (0 / 1)"); y=in.nextInt();
            if (y>0 && y<2) {
                int count = 0;
                System.out.print("Indeks yang akan dihapus : "); 
                del = in.nextInt();
                for (int i = 0; i < B.length; i++) {
                    if(B[i]==B[del]){
                        for (int j = i; j < (B.length-1);j++) 
                        {
                            B[j]=B[j+1];
                            count++;
                        }
                        break;    
                    }
                }
                if (count==0) 
                    {
                        System.out.println("item tidak ditemukan!");
                    }
                else
                    {
                        System.out.print("Array B : ");
                        for (int j = 0; j < (B.length-1); j++) 
                        {
                            System.out.print(B[j]+" ");    
                        }
                    }
                
            } 
            System.out.println("\nLanjut ga? (0 / 1)"); 
            x=in.nextInt(); //x=in.next().charAt(0);    
            System.out.println();    
        }while(x>0 && x<2);

        in.close();
    }
}