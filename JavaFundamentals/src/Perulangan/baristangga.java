import java.util.Scanner;

public class baristangga{
public static void main(String[] args){
int b, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Baris = ");b = in.nextInt(); 
        for(i=1;i<=b;i++){
            for(j=i;j>=1;j--){
                System.out.print("  ");
            }
            System.out.println("|_");
        }
        in.close();
    }
}