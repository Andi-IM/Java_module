package src.Array2d;

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

/**
 * Array2D2_method
 * 11 Desember 2019
 * Andi - Sarif - Adio Ihsan - Ihsan
 */

public class Array2D2_method {
    static Scanner in = new Scanner(System.in); //inisialisasi variable utama in sebagai input Scanner()
    static Random rand = new Random();          //inisialisasi variabel utama rand sebagai fungsi Random()

    public static void main(String[] args) {
    int N;
    Header();
    System.out.print("Masukkan jumlah mahasiswa= ");
    N=in.nextInt(); //N adalah input jumlah
    int nilai[][] = new int[N][6]; //untuk kolom dibuat statis dengan jumlah 6 
    char nh[] = new char[N];       // kolom yang dibuat beda sendiri karena bertipe data berbeda
        
    nilai = InputMhs(nilai, N);
    NilaiABC(nilai, nh, N);
    minmax(nilai);
    in.close();
    }

    public static void Header() {
    System.out.println("\n"+
        "********************************************************\n"+
        "+++    Nilai Mahasiswa with Array and Method form    +++\n"+
        "********************************************************\n");
    }

    public static int[][] InputMhs(int[][]A,int B) { //FINAL
        int i, j;
        for (i = 0; i < B; i++) {
            A[i][0]=i+1;
            for (j = 1; j < 5; j++) { 
                //port na harus dilewati
                //dimulai dari j=1 karena j=0 sudah menjadi counter
                A[i][j]=rand.nextInt((100-30)+1)+30;
            }
        }
        return A;
    }

    public static void NilaiABC(int[][] A, char[] B, int C) {
        int jum=0; 
        float rata=0;
        int[] huruf = new int[5]; //huruf mewakili a,b,c,d,e;

        int x = A.length;

        jum = Jum(A, jum);
        rata = jum/x;
        for (int i = 0; i < x; i++) {
                if (A[i][5]>90) { //Nilai A untuk nilai angka lebih dri 90
                    B[i]='A';
                    huruf[0] += 1;
                }else if (A[i][5]>=80) {//Nilai B untuk nilai angka lebih dari 79
                    B[i]='B';
                    huruf[1] += 1;
                }else if (A[i][5]>60) { //Nilai C untuk nilai angka lebih dari 60
                    B[i]='C';
                    huruf[2] += 1;
                }else if (A[i][5]>50)   //Nilai D untuk nilai angka lebih dari 50
                {
                    B[i]='D';
                    huruf[3] += 1;
                }
                else{                   //nilai[i][5]<=50
                    B[i]='E';
                    huruf[4] += 1;
                }
        }
        Print(A, B, C,jum, rata);        
        printABC(huruf);
    }

    public static int Jum(int[][] A, int JUM) {
        int na=0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                na = ((15*A[i][1])/100)+
                ((15*A[i][2])/100)+
                ((30*A[i][3])/100)+
                ((40*A[i][4])/100);
                A[i][5]=na;
            }
            JUM = JUM + na;
        }
        return JUM;
    }

    public static void minmax(int[][] A) {
        int i, j, min=100, imin=0, max=0, imax=0;
        String jmin="", jmax="";

        for (i = 0; i < A.length; i++) {
            for (j = 1; j < A[i].length; j++) {
                if (A[i][j]<min) {
                    imin=i+1;
                    min=A[i][j];
                jmin = horiString(jmin, j); //horizontal positioning string value
                }
            }
        }

        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                if (A[i][j]>=max) {
                    imax=i+1;
                if (j!=0) {
                    max=A[i][j];
                }
                jmax = horiString(jmax, j);
                }
            }
        }
        printm(min,imin,jmin,max,imax,jmax);
    }

    public static String horiString(String A, int x) {
        String[] matkul = {"Kuis","Tugas","UTS","UAS"};
        switch (x) {
            case 1:
                A=matkul[0];
                break;
            case 2:
                A=matkul[1];
                break;
            case 3:
                A=matkul[2];
                break;
            case 4:
                A=matkul[3];
                break;
            }
            return A;
    }

    public static void Print(int[][] A, char[] B, int C, int D, float E){
        int i, j;
        int m, n; 
        n = 5; //n adalah jumlah kolom yang pasti == 6 untuk no, kuis, tugas, uts, uas, na;
        m = C; //C mewakili jumlah baris
        System.out.printf("%8s %8s %8s %5s %8s %8s %8s\n", 
        "No", "Kuis", "Tugas", "UTS", "UAS", "NA", "NH");
    
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("%8d",A[i][j]);
            }
            System.out.printf("%8d",A[i][5]);
            System.out.printf("%8c",B[i]);
            System.out.println();
        }
        System.out.println("jumlah = "+D);
        System.out.println("Rerata Nilai Akhir kelas = "+E);
    }

    public static void printm(int min2, int imin2, String jmin2, int max2, int imax2, String jmax2) {        
        System.out.println("Nilai tertinggi = "+max2+" oleh mahasiswa nomor urut "+imax2+" pada nilai "+jmax2);
        System.out.println("Nilai terendah = "+min2+" oleh mahasiswa nomor urut "+imin2+" pada nilai "+jmin2);
    }
    
    public static void printABC(int[] A) {
        System.out.println("Disribusi Nilai:");
        System.out.println("Nilai A = "+(A[0]));
        System.out.println("Nilai B = "+(A[1]));
        System.out.println("Nilai C = "+(A[2]));
        System.out.println("Nilai D = "+(A[3]));
        System.out.println("Nilai E = "+(A[4]));
    }
}