/*
    Nama / No BP    : Andi Irham Marhamuddin / 1911082006
    Tanggal         : 13 September 2019
    Deskripsi       : hitung biaya pengiriman  
*/
import java.util.Scanner;

public class hitungbkirim{
    public static void main(String[] args){
    int uang;  
    float biaya, terkirim, rupiah;
    String cost;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insert your money amount to send: $");
    uang = scanner.nextInt();
    if(uang>=500){
        biaya = (float) 0.2*uang;
        cost = "2%";
    } else{
        biaya = (float) 0.1*uang;
        cost = "1%";
    }
    terkirim = uang - biaya;
    rupiah = terkirim * 14200;

    System.out.println("OK, Your Money is sent");
    System.out.println("Amount of your money is $"+uang);
    System.out.println("The cost is "+cost+" of your money = $"+biaya);
    System.out.println("Amount of sent: $"+terkirim);
    System.out.println("Your money is sent to Indonesia");
    System.out.println("$"+terkirim+" = "+"Rp. "+rupiah);
    System.out.println("Thank You");
    }
}