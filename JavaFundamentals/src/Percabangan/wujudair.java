package Percabangan;

/*
    Nama / No BP    : Andi Irham Marhamuddin / 1911082006
    Tanggal         : 13 September 2019
    Deskripsi       : kondisional wujud air 
*/
import java.util.Scanner;

public class wujudair{
    public static void main(String[] args){
    int suhu;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Suhu air : ");
    suhu = scanner.nextInt();

    if(suhu <0){
        System.out.println("air berwujud PADAT");
    }else if(suhu >=0 && suhu <= 100){
        System.out.println("air berwujud CAIR");
           }else{  //>100
        System.out.println("air berwujud GAS");}
    }
}//ENDIF
