import java.util.Scanner;
public class pola1{
    public static void main(String[] args){
        int i, j, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        j = 2;
        for (i=1;i<=n;i++){
            System.out.print(j+" ");
            if(i%2!=0){
                j = j+4;
            }
            else {
                j = j-2;
            }
        }
    }
}