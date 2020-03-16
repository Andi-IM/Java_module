/*
    Nama / No BP    : Andi Irham Marhamuddin / 1911082006
    Tanggal         : 9 September 2019
    Deskripsi       : hitung belanja  
*/
import java.util.Scanner;

public class hitungbelanja{
    public static void main(String[] args){
        //float 
        int diskon;
        int telur, cabe, tomat, gula, total, bayar, kembalian;
        int rb1, rb2, rb5, rb10, rb20, rb50, rb100; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====DAFTAR HARGA TOKO MAKMUR=====");
        System.out.println("1. Telur   = Rp. 20.000,- per kg");
        System.out.println("2. Cabe    = Rp. 70.000,- per kg");
        System.out.println("3. Tomat   = Rp.  5.000,- per kg");
        System.out.println("4. Gula    = Rp. 12.000,- per kg");
        System.out.println("==================================");
        System.out.println("Silahkan menuliskan banyak belanjaan Anda: ");  
        System.out.print("Telur  = "); telur = scanner.nextInt();
        System.out.print("Cabe   = "); cabe  = scanner.nextInt();
        System.out.print("Tomat  = "); tomat = scanner.nextInt();
        System.out.print("Gula   = "); gula  = scanner.nextInt();

        System.out.println("======PERHITUNGAN BELANJA======");
        System.out.println("Telur  = "+telur+" x 20.000 = "+ "Rp. "+telur * 20000 );
        System.out.println("Cabe   = "+cabe+" x 70.000 = "+"Rp. "+cabe * 70000);
        System.out.println("Tomat  = "+tomat+" x  5.000 = "+"Rp. "+tomat * 5000); 
        System.out.println("Gula   = "+gula+" x 12.000 = "+"Rp. "+gula * 12000);
        
        total = (telur * 20000) + (cabe * 70000) + (tomat * 5000) + (gula * 12000);

        rb100 = total / 100000;
        rb50 = total % 100000 / 50000;
        rb20 = total % 100000 % 50000 / 20000;
        rb10 = total % 100000 % 50000 % 20000 / 10000;
        rb5 = total % 100000 % 50000 % 20000 % 10000 / 5000;
        rb2 = total % 100000 % 50000 % 20000 % 10000 % 5000 / 2000;
        rb1 = total % 100000 % 50000 % 20000 % 10000 % 5000 % 2000 / 1000;

        //hitung diskon 
        //jika total belanja > 200rb, diskon 10%
        if(total > 200000){
            diskon = 10 * total / 100;
        } else {
            diskon = 0;
        }

        System.out.println("-------------------------------");
        System.out.print("Total Pembayaran       = Rp. "+total);
        System.out.println();
        System.out.println("Diskon belanja         = Rp. "+diskon);
        System.out.print("Uang bayar             = Rp. "); bayar = scanner.nextInt(); 
        kembalian = bayar - (total - diskon);
        System.out.println("Uang kembali           = Rp. "+kembalian);
        System.out.println("================================="); 
        System.out.println("==TERIMA KASIH  BELANJA DI SINI==");
        System.out.println("=================================");
        System.out.println("====ANDA SOPAN KAMI PUN SEGAN====");
        System.out.println("=================================");
        
        System.out.println();
        System.out.println("Rp. "+total+" = "+rb100+" lembar 100rb, "+rb50+" lembar 50rb, "+rb20+" lembar 20rb, "+rb10+" lembar 10rb, "+rb5+" lembar 5rb, "+rb2+" lembar 2rb, "+rb1+" lembar 1rb.");
    }
}