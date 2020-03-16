/*
Nama / No BP	: Andi Irham Marhamuddin / 1911082006
Tanggal			: 6 September 2019
Desktripsi		: Nilai akhir mahasiswa dihitung dengan rumus 10%tugas + 15% kuis + 30% uts + 45% uas
*/

import java.util.Scanner;

class NAMahasiswa{
	//Deklarasi
	public static void main(String[] args){
	double NA;
	int ntugas, nkuis, nuts, nuas;
	Scanner scanner = new Scanner(System.in);
	
	//Keluaran
	System.out.println("===Program Perhitungan Nilai Akhir Mahasiwa===\n");
	System.out.print("Masukkan nilai Tugas	= ");
	ntugas = scanner.nextInt();
	System.out.print("Masukkan nilai Kuis	= ");
	nkuis = scanner.nextInt();
	System.out.print("Masukkan nilai UTS	= ");
	nuts = scanner.nextInt();
	System.out.print("Masukkan nilai UAS	= ");
	nuas = scanner.nextInt();
	
	//proses
	NA = (0.1 * ntugas) + (0.15 * nkuis) + (0.3 * nuts) + (0.45 * nuas);
	System.out.print("Nilai Akhir Anda		= "+NA);
	System.out.print("=============================================");
	}
}