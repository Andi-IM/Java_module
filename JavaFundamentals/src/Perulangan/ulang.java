package Perulangan;

/*
    Nama / No. BP : Andi Irham Marhamuddin
    Kelas : TRPL 1B
*/


import java.util.Scanner;
public class ulang{
    public static void main(String[] args) {
        long i, j;
        Scanner in = new Scanner(System.in);
        j = in.nextInt();

        //for (i = 1; i<=j; i++){
        //    System.out.println(i);
        //}
        
        /*
        i = 0;
        while(i<=j){
            System.out.println(i);
            i++;
        } 
        */

        i = 0;
        do{
            System.out.println(i);
            i++;
        } while (i<=j);

    }
    
}