import java.util.Scanner;

public class kelipatan3{
    public static void main(String[] args){
        int i, bil, banyak;
        
        Scanner in = new Scanner(System.in);

        System.out.println("input banyak bilangan : "); banyak= in.nextInt();

        for(i = 1; i<=banyak;i++){
            bil = i * 3;
            System.out.println(bil);
        }
    }
}