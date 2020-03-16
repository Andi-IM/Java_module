package Perulangan;

/**
    Nama / No BP : Andi Irham Marhamuddin / 1911082006
    Kelas : TRPL 1 B
    Deskripsi : menulis kata hello sebanyak input user
 */

 import java.util.Scanner;
public class ulang2{
    public static void main(String[] args){
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        for (int y = 0;y<=x;y++){
            System.out.println("Hello");
        }
    }
}