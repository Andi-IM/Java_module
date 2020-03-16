/**
 * Nama / No BP : Andi Irham Marhamuddin / 1911082006
 * Kelas        : TRPL 1B
 * Tanggal      : 30 September 2019
 * Deskripsi    : pengulangan do while
 */

import java.util.Scanner;
public class pengulangandowhile {
    public static void main(String[] args) {
     int bil, x;
     float rata;
     x=0;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Masukkan sejumlah bilangan genap");
     System.out.println("Proses berhenti setelah bilangan ganjil diinputkan");
     do{
     bil = in.nextInt();
     } while(bil%2==0);
     System.out.println(bil+" bukan bilangan genap, proses berhenti.");
    }
}