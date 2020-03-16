package src;

import java.util.Scanner;

public class barispola{
public static void main(String[] args){
int b, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        for(i=b;i>=1;i--){
            for(j=i;j>=1;j--){
                if(i%2==0){
                System.out.print(i);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        in.close();
    }
}