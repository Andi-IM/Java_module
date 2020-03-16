/**
 * ProsesArray
 * Nama      : Andi Irham Marhamuddin
 * BP        : 1911082006
 * tanggal   : 6 12 2019
 * Deskripsi : Membuat Array dengan menggunakan method.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProsesArray {
    static Random ran = new Random();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    int n, jum,x,ix;
    System.out.print("Masukkan array: "); n = in.nextInt();
    
    System.out.println("Array Pertama");
    int[] A1 = new int[n];
    isiArray(A1);
    printArray(A1);
    jum = jumlahArray(A1);
    System.out.println("Jumlah= "+jum);
    System.out.println("Rata-rata= "+rataArray(jum,n));

    System.out.println("\nArray Kedua");
    int[] A2 = new int[n];
    isiArray(A2);
    printArray(A2);
    jum = jumlahArray(A2);
    System.out.println("Jumlah= "+jum);
    System.out.println("Rata-rata= "+rataArray(jum,n));

    System.out.println("\nArray Ketiga = Array pertama + Array kedua");
    int[] A3 = new int[n];
    A3=tambahArray(A1, A2);
    printArray(A3);
    jum = jumlahArray(A3);
    System.out.println("Jumlah= "+jum);
    System.out.println("Rata-rata= "+rataArray(jum,n));
    System.out.print("Masukkan nilai yang akan dicari: ");
    x = in.nextInt();
    ix = seqSearch(A3, x);
    if (ix==-1) {
        System.out.println(x+" tidak ada pada indeks");
    }else{ //ix==i
        System.out.println(x+" ada pada posisi "+(ix+1));
    }
    System.out.print("Masukkan bilangan yang ingin ditambahkan "); int insert=in.nextInt();
    System.out.print("Posisi mana bilangan ini dimasukkan? "); int position=in.nextInt();
    
    A3 = insertX(A3,insert,position);
    printArray(A3);

    System.out.println("Bubble Sort array");
    bubblev(A3);
    printArray(A3);

    System.out.println("Penyalinan");
    int[] A4 = new int[n];
    salinA(A3, A4);
    System.out.print("Hasil salinan Array: ");
    printArray(A4);
    System.out.println();

    System.out.print("Masukkan indeks array yang ingin dihapus: "); int del=in.nextInt();
    deleteX(A3, del);
    }
    
    static int[] insertX(int[]A, int x, int pos){
        int n, i;
        n=A.length;
        int[] newA = new int[n+1];

        for(i=0;i<=n;i++){
            if(i<(pos-1))
                newA[i]=A[i];
            else if(i==(pos-1))
                newA[i]=x;
            else //i>pos-1
                newA[i]=A[i-1];
            //endif
        }   
        return newA;
    }

    public static void bubblev(int[] A){
        int tukar, n;
        n = A.length;
        for (int i = 0; i < (n-1) ; i++) {
            for (int k = 0; k < n-i-1; k++) {
            if (A[k]>A[k+1]) {
                tukar = A[k];
                A[k] = A[k+1];
                A[k+1]= tukar; 
                }
            }
        }
    }

    public static void deleteX(int[] A, int x) {
        int n;
        n = A.length+1;
        int[] newA = new int[n-1];
        for (int i = 0; i < newA.length; i++) {
            newA[i]=A[i];
            if (A[x]==A[i]) {
                newA[i]=0;
            }else{
                System.out.print(A[i]+"\t");
                System.out.println(A.length);
            }  //A[i] --> newA[i] jika A[i] = = indeks array yang akan dihapus
        }
    }           // 1    2   3   4
                // 1   (0)  3   4
                // 1    3   4

    public static void salinA(int[] A, int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i]=A[i];
        }
    }

    static void isiArray(int[] A){ 
        int n,i;
        n=A.length;
        for (i = 0; i < A.length; i++) {
            A[i]=ran.nextInt(10)+1;
        }
    }
    static void printArray(int[] A) {
        int n, i;
        n=A.length;
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i]+"\t"); 
        }
        System.out.println();   
    }
    
    /*
    static void tambahArray(int[] A, int[] B, int[] C){
        int n= A.length;
        for (int i = 0; i < n; i++) {
            C[i]=A[i]+B[i];
        }
    }
    */
    static int seqSearch(int[] A, int x){
        int n,i;
        n = A.length;
        for(i=0;i<n;i++){
            if(A[i]==x){
                return i; //jika ada
            }//endif
        }return -1; //jika tidak ada
    }
    static int[] tambahArray(int[] A, int[] B){
        int n = A.length;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i]=A[i]+B[i];
        }
        return C;
    }

    static int jumlahArray(int[] A){ 
        int n,i, jum=0;
        n=A.length;
        for (i = 0; i < A.length; i++) {
            jum+=A[i];
        }
        return jum;
    }
    static float rataArray(int jum,int n) {
        float hasil;
        hasil = (float) jum/n;
        return hasil;
    }
}