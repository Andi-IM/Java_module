package Perulangan;

import java.util.Scanner;

public class Perulangan5{
public static void main(String[] args){
int b, k, i, j, n;
        n = 12;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        System.out.print("Kolom = ");k = in.nextInt();
        for(i=1;i<=b;i++){
            for(j=1;j<=k;j++){
                if(i==j){
                    System.out.print("1 \t");
                } else {
                    System.out.print("0 \t");
                }
            }
            System.out.println();
        }
        in.close();
    }
}