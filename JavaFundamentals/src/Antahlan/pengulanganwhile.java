/**
 * Nama / No BP : Andi Irham Marhamuddin / 1911082006
 * Kelas        : TRPL 1B
 * Tanggal      : 30 September 2019
 * Deskripsi    : pengulangan while
 */

 import java.util.Scanner;
 public class pengulanganwhile {
     public static void main(String[] args) {
      int bil, max;
      int jum, hitung;
      float rata;
      hitung = jum = 0;
      Scanner in = new Scanner(System.in);
      
      System.out.println("Masukkan sejumlah bilangan genap");
      System.out.println("Proses berhenti setelah bilangan ganjil diinputkan");
      bil = in.nextInt();
      max = bil;
    
      while (bil%2==0){
          if(bil%2==0){
              jum = jum+bil;
              hitung = hitung+1;
            }
            bil = in.nextInt();
                  max = Math.max(bil, max);
            }
      System.out.println(bil+" bukan bilangan genap, proses selesai.");
      rata = (float)jum/hitung;
        System.out.println("Banyak bilangan = "+hitung);
        System.out.println("Jumlah = "+jum);
        System.out.println("Rata-rata = "+ rata);
      in.close();
     }
 }