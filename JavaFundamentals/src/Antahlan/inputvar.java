/*
	Nama / No BP	: Andi Irham Marhamuddin / 1911082006
	Tanggal 		: 6 September 2019
	Deskripsi		: input nilai beberapa tipe data
*/

import java.util.Scanner;

class inputvar{
	public static void main(String[] args){
	//Kamus
	Scanner scanner = new Scanner(System.in);
	float rataUN;
	String Nama, huruf;
	int umur;
	
	//Program
	//Input
	System.out.print("Masukkan sebuah huruf : ");
	huruf = scanner.nextLine();
	System.out.println("Huruf = "+huruf+"\n");
	
	System.out.print("Masukkkan Nama : ");
	Nama = scanner.nextLine();
	System.out.println("Halo "+Nama+" Apa kabar?\n");
	
	System.out.print("Masukkan umur Anda : ");
	umur = scanner.nextInt();
	System.out.println("Umur Anda adalah : "+umur+" tahun.\n");
	
	System.out.print("Masukkan nilai  rata-rata UN : ");
	rataUN = scanner.nextFloat();
	System.out.println("Nilai rata-rata UN	: "+rataUN+"\n");
	}
}