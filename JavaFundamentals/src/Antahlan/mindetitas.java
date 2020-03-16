import java.util.Scanner;

/**
 * mindetitas
 */
public class mindetitas {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int baris, kolom;
        boolean idt;
        baris = in.nextInt();
        kolom = in.nextInt();
        
        int[][] A = new int[baris][kolom];
        A=isiArray(A);
        idt = indetiti(A);
        if (idt==true) {
            System.out.println("Matriks adalah indetitas");
        }else{
            System.out.println("Matriks bukan indetitas");
        }
    }
    public static int[][] isiArray(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
               A[i][j]=in.nextInt(); 
            }
        }
        return A;
    }

    public static boolean indetiti(int[][] A) {
        boolean hasil=false, hasil2=false;
        if(A.length == A[i].length){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i==j) {
                    if(A[i][j]==1){
                    hasil = true;}
                }else{
                    if (A[i][j]==1) {
                        hasil2 = false;
                    }else{
                        hasil2=true;
                    }
                }
            }
        }
        }else{
            hasil = false;
        }
        hasil = hasil && hasil2;
        return hasil;
    }
}