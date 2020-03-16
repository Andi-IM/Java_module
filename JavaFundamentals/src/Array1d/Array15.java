package src.Array1d;

import java.util.Random;
import java.util.*;

/**
 * Array15
 * Deskripik : A 1 2 3 4 5 5
 *             B 7 6 1 4 2
 *             C bilangan terbesar dari A dan B
 */
public class Array15 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int a=0;
        a=rand.nextInt(10)+1;
        System.out.println(a);
        in.close();
    }
}