import java.util.Random;
import java.util.Scanner;

/**
 * bubble_sort
 */
public class bubble_sort {

    public static void main(String[] args) {
        int n, i, tukar;

        Scanner in = new Scanner(System.in);

        System.out.println("====BUBBLE SORT ASCENDING ====");
        System.out.println("Masukkan banyak data :");
        n = in.nextInt();
        int array[] = new int[n];

        Random rand = new Random();
        System.out.println("Input data. "); 
        for (i = 0; i < n; i++) {
            array[i]=rand.nextInt(100)+1;
            System.out.print(array[i]+"\t");
        }

        //sorting
        System.out.print("\nProses bubble sorting");
        for (i = 0; i < (n-1) ; i++) {
            for (int k = 0; k < n-i-1; k++) {
            if (array[k]>array[k+1]) {
                tukar = array[k];
                array[k] = array[k+1];
                array[k+1]= tukar; 
                }
            }
        }
        System.out.print("\n Isi Array setelah diurutkan Ascending");
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l]+"\t");
        }
    }
}