/*
	Program   : PDAM.java
	Pembuat   : Hakkan Syukri
	Tanggal   : 16 Desember 2019
	Deskripsi : Menghitung tagihan PDAM menggunakan method
*/

import java.util.Scanner;
public class PDAM{
	public static void main(String [] args){
		int kat, pakai,pajak,beban,tagihan,bayar;
		Scanner in = new Scanner (System.in);
		printMenu(); //pemanggilan procedure
		System.out.print("Masukkan kategori pelanggan (1/2/3) : ");
		kat = in.nextInt();
		if(isKategori (kat)) //Kategori 1/2/3
		{
			beban = hitBeban(kat);
			System.out.print("Masukkan banyak pemakaian : ");
			pakai = in.nextInt();
			tagihan = hitTagihan(beban,pakai);
			pajak = hitPajak(tagihan);
			bayar = hitBayar(tagihan,pajak);
			System.out.println("==Tagihan PDAM bulan ini==");
			System.out.println("Beban =  "+beban);
			System.out.println("Pemakaian = " +(pakai*2000));
			System.out.println("Tagihan = " +tagihan);
			System.out.println("Pajak = "+pajak);
			System.out.println("Bayar = "+bayar);
		}
		else //kategori selain 3
		 System.out.println("Maaf, kategori salah. Tagihan tidak dapat dihitung.");

		}
		
		static void printMenu()
		{
		System.out.println("==Program Tagihan PDAM==");
		System.out.println("==Kategori Pelanggan==");
		System.out.println("Kategori 1 ==> Beban = Rp.30.000,00");
		System.out.println("Kategori 2 ==> Beban = Rp.50.000,00");
		System.out.println("Kategori 3 ==> Beban = Rp.70.000,00");
		
		}
		static boolean isKategori(int kat)
		{
			if(kat>=1 && kat<=3)
				return true;
			else
				return false;
		}
		static int hitBeban(int kat)
		{
		int b;
			if(kat==1)
				b=30000;
			if (kat==2)
				b= 50000;
			else if(kat==3)
				b = 70000;
			else  //bukan 1, 2, 3
				b= 0;			
			//endif
			return b;
		}
		static int hitTagihan(int beban, int pakai)
		{
			int tg;
			tg = beban + (pakai*2000);
			return tg;
		}
		static int hitPajak(int tg)
		{
			int p;
			if(tg>500000)
				p=(25*tg)/1000;
			else //tg<=500000
				p=0;
			//endif
			return p;
		}
		static int hitBayar(int tg, int p)
		{
			return tg+p;
		}
	}