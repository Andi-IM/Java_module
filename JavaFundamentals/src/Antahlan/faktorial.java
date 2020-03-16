/**
 * Nama : Andi IrhaM M / 1911082006
 * Kelas : TRPL 1B
 * Deskripsi : Bilangan Faktorial
 */
import java.util.Scanner;
public class faktorial{
    public static void main(String[] args){
        int x,i, fak=1;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        in.close();
         for (i=1;i<=x;i++){
            fak = fak * i;
        }
        System.out.println(fak);
    }
}