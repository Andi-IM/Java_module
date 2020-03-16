import java.util.Random;
import java.util.Scanner;

/**
 * Array2D1
 */
public class Array2D1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, i,j;
        int jum = 0, min, imin=0, jmin=0;
        float rata;

        Random rand = new Random();
        
        System.out.print("Baris: ");m=in.nextInt();
        System.out.print("Kolom: ");n=in.nextInt();

        int bil[][] = new int[m][n];
        min = 10;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                bil[i][j]=rand.nextInt(10)+1;
                jum = jum + bil[i][j];
                if (bil[i][j]<min) {
                    min = bil[i][j];
                    imin=i;
                    jmin=j;
                }                
            }
        }
        rata = (float) jum/m*n;
        //menampilkan isi array 2D
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(bil[i][j]+"\t");                
            }
            System.out.println();
        }
        System.out.println("Jumlah= "+jum);
        System.out.println("Rata-rata= "+rata);
        System.out.println("Nilai min= "+min+" pada baris= "+(imin+1)+" dan kolom= "+(jmin+1));
    }
}