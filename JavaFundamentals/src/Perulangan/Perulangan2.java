package Perulangan;

import java.util.Scanner;

public class Perulangan2{
public static void main(String[] args){
int b, k, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        System.out.print("Kolom = ");k = in.nextInt();
        for(i=1;i<=b;i++){
            for(j=1;j<=k;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        in.close();
    }
}