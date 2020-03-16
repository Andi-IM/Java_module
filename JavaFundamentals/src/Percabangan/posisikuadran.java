package Percabangan;

import java.util.Scanner;

public class posisikuadran{
    private static int x;

    public static void main(String[] args){
        int y;

        Scanner masuk = new Scanner(System.in);
        System.out.println("===Program Kuadran Titik===");
        System.out.print("x = "); x = masuk.nextInt();
        System.out.print("y = "); y = masuk.nextInt();
        
        if(x>0 && y >0){
            System.out.println("Titik berasa di kuadaran ke 1.");
        } else if(x < 0 && y > 0){
            System.out.println("Titik berada di kuadran ke 2.");
        } else if(x < 0 && y < 0){
            System.out.println("Titik berada di kuadran ke 3.");
        } else if(x > 0 && y < 0){
            System.out.println("Titik berada di kuadran ke 4.");
        } else if(x == 0 && y != 0){
            System.out.println("Titik berada di sumbu y.");
        } else if(x != 0 && y == 0){
            System.out.println("Titik berada di sumbu x.");            
        } else { //x == 0 && y==0
            System.out.println("Titik berada di pusat koordinat.");
        } //endif
        masuk.close();
    }
}