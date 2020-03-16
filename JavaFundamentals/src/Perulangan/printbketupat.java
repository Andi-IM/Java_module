package Perulangan;

import java.util.Scanner;

public class printbketupat{
public static void main(String[] args){
int b, i, j, k, kl;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        System.out.print("Kolom = ");kl = in.nextInt();
        for(i=1;i<=b;i++){
            for(j=i;j>=1;j--){
                System.out.print("x");
            }
            for(k=1;k<=kl;k++){
            System.out.print("a");
            }
            System.out.println();
        }
        in.close();
    }
}