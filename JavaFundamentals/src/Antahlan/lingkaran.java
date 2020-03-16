/*
	Nama/No BP	: Andi Irham Marhamuddin
	Tanggal		: 2 September 2019
	Deskripsi	: Menghitung Luas lingkaran
*/

import java.util.Scanner;

class lingkaran{
	public static void main(String[] args){
	double pi = 3.1415;
	int r; 
	double luas,kel;
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("===Program Hitung Luas Lingkaran===");
	System.out.print("Panjang Jari-jari = ");
	r = scanner.nextInt();

	//Proses
	luas = pi * r * r;
	kel  = 2*pi*r;
	
	//Hasil
	System.out.println("Luas lingkaran = "+luas);
	System.out.println("Keliling lingkaran = "+kel);
	System.out.println("===================================");
	}
}
