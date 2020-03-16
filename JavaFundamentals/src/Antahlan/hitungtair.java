import java.util.Scanner;
public class hitungtair {
    public static void main(String[] args) {
        int  gol, tagihan;
        float biaya, pajak;
        Scanner in = new Scanner(System.in);
        gol = in.nextInt();
        switch (gol){
            case 1:
            tagihan = in.nextInt();
            if (tagihan > 20){
                biaya = 20 * 2000 + (tagihan - 20) * 3000 + 50000;
                pajak = (float) 0.05 * biaya;
                biaya = biaya + pajak;
                System.out.println(biaya);
            } else{
                biaya = tagihan * 2000 + 50000;
                pajak = (float) 0.05 * biaya;
                biaya = biaya + pajak;
                System.out.println(biaya);
            }
            break;
            case 2:
            tagihan = in.nextInt();
            if (tagihan > 20){
                biaya = 20 * 2000 + (tagihan - 20) * 3000 + 100000;
                pajak = (float) 0.05 * biaya;
                biaya = biaya + pajak;
                System.out.println(biaya);
            } else{
                biaya = tagihan * 2000 + 100000;
                pajak = (float) 0.05 * biaya;
                biaya = biaya + pajak;
                System.out.println(biaya);
            }
            break;
            default:
            break;
        }
    }
}