package src.Array1d;

import java.util.Random;
import java.util.Scanner;

/**
 * Array16
 * 
 */
public class Array16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int n, i, pil;
        int x, ix;

        System.out.print("Masukkan banyak data: "); n = in.nextInt();

        int A[]=new int[n+1];
        int B[]=new int[n];
        for (i = 0; i < B.length; i++) {
            A[i]=rand.nextInt(100);
            B[i]=A[i];
            System.out.println("A["+i+"] ="+A[i]);
        }
        do {
            System.out.println("\n==Menu Tambah/Hapus Elemen Array==");
            System.out.println("1. Tambah Elemen Array");
            System.out.println("2. Hapus Elemen Array");
            System.out.println("3. Selesai");
            System.out.println("Masukkan pilihan Anda (1/2/3)");
            pil=in.nextInt();
            switch (pil) {
                    case 1 : {
                        System.out.println("Nilai elemen yang ingin ditambahkan = "); x = in.nextInt();
                        System.out.println("Indeks penambahan elemen (di mulai dari 0) = "); ix = in.nextInt();
                        if(ix<0 || ix>n)
                        {
                            System.out.println("Maaf indeks yang diinputkan salah");
                        }
                        else
                        {
                            for (i=n-1;i>=ix;i--)
                                A[i+1] = A[i];
                                A[ix]=x;
                            for(i=0; i<=n; i++)
                                System.out.println("A["+i+"] = "+A[i]);
                        }
                    }
                    break;
                    case 2 : {
                        System.out.println("Indeks yang ingin dihapus (di mulai dari 0) = ");
                        ix = in.nextInt();
                        if(ix<0 || ix>n)
                        {
                            System.out.println("Maaf indeks yang diinputkan salah");
                        }
                        else
                        {
                            for(i=ix; i<n-1;i++)
                                B[i] = B[i+1];
                            for(i=0; i<n-1;i++)
                                System.out.println("A["+i+"] = "+B[i]);
                        }
                        
                    }
                    break;
                    
                    default : System.out.println("Proses Selesai");
                    break;
                }
            }while(pil!=3);
            in.close();
    }
}