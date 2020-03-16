import java.util.Scanner;

public class billingwarnet{
    public static void main(String[] args){
        int jb, tarif;
        Scanner masuk = new Scanner(System.in);
        
        jb = masuk.nextInt();
            masuk.close();

        if (jb > 4){
            tarif = 1 * 4000 + 3 * 3000 + (jb-4) * 2000;
            System.out.println(tarif);
        } else if (jb > 1 && jb <= 4){
            tarif = 1 * 4000 + (jb - 1) * 3000;
            System.out.println(tarif);
        } else { // jam < 2
            tarif = jb * 4000;
            System.out.println(tarif);
        }

    }
}