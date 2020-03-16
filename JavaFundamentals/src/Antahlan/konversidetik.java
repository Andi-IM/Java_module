/*
	Nama / No BP	: Andi Irham Marhamuddin / 1911082006
	Tanggal			: 6 September 2019
	Desktripsi		: Konversi detik ke dalam bentuk Jam, Menit, Detik
*/

import java.util.Scanner;

class konversidetik{
	public static void main(String[] args){
	int T;
	int jam, menit, detik;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Masukkan nilai T = ");
	T = scanner.nextInt();
	
	jam = T / 3600;
	menit = T % 3600 / 60;
	detik = T % 60;
	
	System.out.println(jam);
	System.out.println(menit);
	System.out.println(detik);
	}
}