import java.text.DecimalFormat;
import java.util.Scanner;

public class FloorandCeiling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.##");
        float y;
        y = in.nextFloat();
        String x = decimal.format(y).replace('.','.');
        float z = Float.parseFloat(x);
        //System.out.println(z);
        System.out.print(Math.floor(y)+" ");
        System.out.print(Math.ceil(y));
    }
}