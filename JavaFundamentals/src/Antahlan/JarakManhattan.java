import java.util.Scanner;

/**
 * JarakManhattan
 * ACCEPTED
 */
public class JarakManhattan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long bx, by, kx, ky, x1, x2, y1, y2;
        x1 = in.nextLong();
        y1 = in.nextLong();
        x2 = in.nextLong();
        y2 = in.nextLong();

        if (x1>x2) {
            bx = x1; kx = x2;
        } else {
        bx = x2; kx = x1;}

        if (y1>y2) {
            by = y1; ky = y2;
        } else {
        by = y2; ky = y1;}

        System.out.println((bx-kx)+(by-ky));
    }
}