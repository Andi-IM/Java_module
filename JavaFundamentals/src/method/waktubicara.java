package method;

import java.util.Scanner;

/**
 * waktubicara
 * Nama     : Andi Irham Marhamuddin
 * Kelas    : TRPL 1B
 *  tanggal: 2 Desember 2019
 */
public class waktubicara {

    public static void main(String[] args) {
        int j1, m1, d1,j2,m2,d2;
        int dur;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan waktu awal pembicaraan ");
        System.out.println("xx:xx:xx");
        j1=in.nextInt(); m1=in.nextInt(); d1=in.nextInt();
        System.out.println("Masukkan waktu akhir pembicaraan ");
        j2=in.nextInt(); m2=in.nextInt(); d2=in.nextInt();
        
        System.out.println("Tariff");
        
        dur = det(j2,m2,d2) - det(j1,m1,d1);
        double bayar2 = bayar(dur);

        System.out.println("Durasi Pembicaraan = "+dur+" detik");
        System.out.println("Pulsa anda dipotong sebesar Rp. "+bayar2); 

    }
    public static int det(int a, int b, int c) {
        int di;
        di = (a*3600)+(b*60)+c;
        return di;
    }
    public static double bayar(int a) {
        int biaya = (a/10)*200;
        int total;
        int disc = 0;
        if (biaya>20000) {
            disc = biaya/10;   
        }
        total = biaya - disc;
        return total;
    }
}