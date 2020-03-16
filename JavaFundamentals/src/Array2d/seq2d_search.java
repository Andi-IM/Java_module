package Array2d;

import java.util.Random;
import java.util.Scanner;

/**
 * seq2d_search
 * 8 Desember 2019
 */
public class seq2d_search {
    static Random ran = new Random();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int cari, m,n;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan baris data: "); m = in.nextInt();
        System.out.print("Masukkan kolom data: "); n = in.nextInt();
        
        int array[][] = new int[m][n];
        buatMatriks(array);
        printMatriks(array);

        System.out.print("Masukkan angka yang ingin dicari pada matriks: "); cari = in.nextInt();
        search(array, cari);
        
        
    }

    public static void buatMatriks(int[][] A) {
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[j][i]=ran.nextInt(10)+1;
            }
        }
    }

    public static void printMatriks(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
            System.out.print(A[i][j]+"\t"); 
            }
            System.out.println();   
        }
        System.out.println();
    }

    public static void search(int[][] A, int x) {
        int jum=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j]==x) {
                    System.out.println(x+" ada pada matriks ke-("+(i+1)+","+(j+1)+")");
                    jum=jum+1;
                }
            }
        }    
        if (jum==0) {
            System.out.println(x+" tidak ada pada matriks.");
        }    
    }

}