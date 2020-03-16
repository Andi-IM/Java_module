/*
	Nama/No BP	: Andi Irham Marhamuddin / 1911082006
	Tanggal		: 2 September 2019
	Desktripsi	: Operasi x; /; +; -; div; mod; untuk dua buah bilangan bulat
*/

class Kalkulator4{
	public static void main(String[] args){
		int bil1, bil2;
		int hasil;
		float bagi;
		int hasildiv, hasilmod;
		bil1 = 10; bil2 = 3;
		System.out.println("Bil1 = " +bil1+ "\n Bil2 = " +bil2);
		hasil = bil1 + bil2;
		System.out.println("Bil1 + Bil2 = " + hasil);
		System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
		//hasil = bil1 + bil2;
		System.out.println(bil1 + " * " + bil2 + " = " + (bil1*bil2));
		bagi = (float)bil1 / bil2;
		System.out.println("BIl1 / Bil2 = " + bagi);
		hasildiv = bil1 / bil2;
		System.out.println("Bil1 div Bil2 = " + hasildiv);
		hasilmod = bil1 % bil2;
		System.out.println("Bil1 mod Bil2 = " + hasilmod);
	}
}