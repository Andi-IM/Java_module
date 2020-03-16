package Perulangan;

import java.util.Scanner;
public class ulangdanhitung{
    public static void main(String[] args){
        int b, k, i, j, n, sum;
        n = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        System.out.print("Kolom = ");k = in.nextInt();
        for(i=1;i<=b;i++){
            sum = 0;
            for(j=1;j<=k;j++){
                System.out.print(n+"\t");
                sum = sum + n;
                n++;
            }
            System.out.print(" = "+sum+"\t");
            System.out.println();
        }
        in.close();
    }
}