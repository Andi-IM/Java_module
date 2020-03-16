import java.util.Random;
import java.util.Scanner;

/**
 * Penjumlahanm
 * Andi Irham M
 * Kelas Trpl 1B
 * 9 Desember 2019
 *  menjumlahkan 2 buah matriks.
 */
public class Penjumlahanm {
    static Scanner in = new Scanner(System.in);
    static Random rand = new Random();
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

        if (baris1 == baris2 && kolom1 == kolom2) {    
            int[][] Hasil = new int[baris1][kolom2];
            hitungmatriks(Hasil, A1, A2, baris1, kolom2);
            System.out.println("Hasil");
            printMatriks(Hasil);
        }else{
            System.out.println("Matriks tidak dapat dijumlahkan.");
        }
    }

    public static void buatMatriks(int[][] A) {
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j]=rand.nextInt(10)+1;
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
            A[i][j]=B[i][j]+C[i][j];
            }
        }
    }

}