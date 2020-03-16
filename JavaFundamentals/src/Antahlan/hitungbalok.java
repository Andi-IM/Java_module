/*
	Nama/No BP 	: Andi Irham Marhamuddin / 1911082006
	Tanggal		: 2 September 2019
	Deskripsi	: Menghitung luas Balok
*/

class hitungbalok{
	public static void main(String[] args){
	int p, l, t, vol; //memperkenalkan p,l,t, dan vol sebagai variabel integer
	int la, lp;  // sama dengan di atas

	p = 10; l = 5; t = 5; // assignment untuk p = 10; l = 5; t = 5
	vol = p * l * t; // membuat rumus volume sebagai p * l * t
	la = p * l; // luas alas (la) = p * l
	lp = (2 * (p * l))  + (2 * (p * t)) + (2 * (l * t)); // luas permukaan

	System.out.println("Panjang = "+p+ "\nLebarLebar = "+l+ "\nTinggi = "+t);
	System.out.println("Volume Balok = " +p+ " * " +l+ " * " +t+ " = " +vol	);
	System.out.println("Luas alas Balok = "+ p + " * "+ l + " = " + la);
	System.out.println("Luas permukaan Balok = (2 * ("+ p + " * " + l + ")) + (2 * ("+ p + " * "+ t +")) + (2 * ("+ l + " * "+ t +"))"+" = "+ lp); 
	System.out.println(vol+" "+p+l);
	}
}

