import java.util.Scanner;

public class Perulangan{
public static void main(String[] args){
int b, k, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        System.out.print("Kolom = ");k = in.nextInt();
        for(i=1;i<=b;i++){
            for(j=1;j<=k;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        in.close();
    }
}