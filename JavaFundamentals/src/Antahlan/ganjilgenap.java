/*
    Nama / No BP    : Andi Irham Marhamuddin / 1911082006
    Tanggal         : 13 September 2019
    Deskripsi       : kondisional ganjil genap
*/
import java.util.Scanner;

public class ganjilgenap{
    public static void main(String[] args){
    int bil;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan : ");
    bil = scanner.nextInt();

    if(bil%2 == 0){
        System.out.println(bil + " merupakan bilangan genap");
    } else {
        System.out.println(bil + " merupakan bilagan ganjil");
           }
    }
}