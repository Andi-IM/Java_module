/*
    Nama Pembuat   : Andi Irham Marhamuddin
    No BP          : 1911082006
    Tanggal        : 16 September 2016
    Deskripsi      : 
*/

import java.util.Scanner;

public class max2{
    public static void main(String[] args){
        int bil1, bil2, max=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan 1 = ");
        bil1 = scanner.nextInt();
        System.out.print("Bilangan 2 = ");
        bil2 = scanner.nextInt();
        // versi 1
        if(bil1>bil2){
            max = bil1;
        } else{ //bil1<=bil2
            max = bil2;
        }
        //endif
        System.out.println("Bilangan terbesar adalah: "+max);

        // versi 2
        if(bil1>bil2){
            System.out.println(bil1 + "Lebih besar dari "+ bil2);
        } else if(bil1<bil2){
            System.out.println(bil2 + "lebih besar dari " + bil1);
        } else{ //bil1 = bil2
            System.out.println(bil1 + " Sama dengan " + bil2);
        } //endif
    }
}