/**
 * Nama / No BP : Andi Irham Marhamuddin / 1911082006
 * Kelas : TRPL 1B
 * Deskripsi : Membuat............
 */

import java.util.Scanner;
public class tulisbilangan{
    public static void main(String[] args){
        int i, aw, ak, jum,temp;
        float rata;

        Scanner scanner = new Scanner(System.in);
        System.out.println("input awal pengulangan: "); aw = scanner.nextInt();
        System.out.println("input akhir pengulangan: "); ak = scanner.nextInt();

        if(aw>ak){
            temp = aw;
            aw = ak;
            ak = temp;
        }

        jum = 0;
        for(i=aw;i<=ak;i++){
            System.out.println(i);
            jum = jum + i;
        }

        rata = (float)jum/(ak-aw+1);
        System.out.println("Jumlah = "+jum);
        System.out.println("Rata-rata = "+ rata);
    }
}