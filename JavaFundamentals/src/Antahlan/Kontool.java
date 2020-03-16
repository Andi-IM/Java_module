package Antahlan;

import java.util.Scanner;

public class Kontool{    
    public static void main(String[] args){
	int uang;
	int rb10, rb5, rb2, rb1;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Masukkan Jumlah uang anda = ");
	uang = scanner.nextInt();
	
	rb10 = uang / 10000;
	rb5 = rb10 / 5000;
    rb2 = rb5 / 2000;
    rb1 = rb1 / 1000;
	
	System.out.println(rb10);
	System.out.println(rb5);
    System.out.println(rb2);
    System.out.println(rb1);
	}
}