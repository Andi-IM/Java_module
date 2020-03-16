import java.util.Scanner;

public class pangkat{
    public static void main(String[] args){
        int i, p, y, x;

        Scanner in = new Scanner(System.in);
        System.out.println("x = "); x = in.nextInt();
        System.out.println("Y = "); y = in.nextInt();

        p= 1;
        for(i = 1; i<=y;i++){
            p = p * x;
        }
        System.out.println(p);
    }
}