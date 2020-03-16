/**
 * Nama  : Andi Irham M / 1911082006
 * Kelas : TRPL 1B
 * Deskripsi : Menuliskan deret angka ke layar
 */

 import java.util.Scanner;

public class carikel3{
    public static void main(String[] args){
        int i,j;
        Scanner in = new Scanner(System.in);
        j = in.nextInt();
        in.close();
        for (i = 1;i<100;i++){
            if (i % j == 0){
                System.out.println(i+"\t");
            }
        }
    }
}