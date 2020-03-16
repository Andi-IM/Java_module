/*
    Nama / No BP    : Andi Irham Marhamuddin / 1911082006
    Tanggal         : 13 September 2019
    Deskripsi       : hitung biaya pengiriman  
*/
import java.util.Scanner;

public class kelulusanmhs{
    public static void main(String[] args){
    String nama;
    int nilai;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Nama mahasiswa : ");
    nama = scanner.nextLine();
    System.out.print("Nilai mahasiswa : ");
    nilai = scanner.nextInt();

    if(nilai >= 65){
        System.out.println(nama + " Dinyatakan LULUS");
    } else {
        System.out.println(nama + " Dinyatakan GAGAL");
           }
    }
}