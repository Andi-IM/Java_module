import java.util.Random;
import java.util.Scanner;

/**
 * perkalianm2
 * 8 Desember 2019
 * Andi Irham M
 * andi.irhamm@gmail.com
 */

public class perkalianm2 {
    static Scanner in = new Scanner(System.in);
    static Random ran = new Random();
    public static void main(String[] args) {
        int baris1, kolom1, baris2, kolom2;
        baris1=in.nextInt();
        kolom1=in.nextInt();
        
        int[][] A1 = new int[baris1][kolom1];
        buatMatriks(A1);
        printMatriks(A1);

        baris2=in.nextInt();
        kolom2=in.nextInt();
        int[][] A2 = new int[baris2][kolom2];
        buatMatriks(A2);
        printMatriks(A2);
        
        int[][] Hasil = new int[baris1][kolom2];
        hitungmatriks(Hasil, A1, A2, baris1, kolom2);
        System.out.println("Hasil");
        printMatriks(Hasil);
    }

    public static void buatMatriks(int[][] A) {
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j]=ran.nextInt(10)+1;
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

    public static void hitungmatriks(int[][] A, int[][] B, int[][] C, int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                A[i][j]=0;
                for (int j2 = 0; j2 < C.length; j2++) {
                    A[i][j]+=B[i][j2]*C[j2][j];
                    //A[i][j]=B[i][j]*C[i][j]+B[i][j+1]*C[i+1][j];}
                }
            }
        }
    }
}