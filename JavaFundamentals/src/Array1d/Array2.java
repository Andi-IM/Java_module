package src.Array1d;

import java.util.Scanner;
public class Array2{
    public static void main(String[] args){
        int[] A = new int[10];
        int total,banyak;
            total = 0;
            banyak = 0;

        Scanner in = new Scanner(System.in);
        
        //input
        for (int i = 0; i<10;i++){

            System.out.print("Nilai ke-"+(i+1)+" = ");A[i] = in.nextInt();
            if(A[i]%2==0 && A[i]>0){
            total = total + A[i];
            banyak++;
            } 
        }
        
        System.out.println();

        //output
        for (int i = 0; i<10;i++){
        System.out.print(A[i]+ " \t");    
        }
        System.out.println("Genap = "+total);
        System.out.println("Banyak = "+ banyak);

        in.close();
    }
}