import java.util.Scanner;

/**
 * fungsi1
 * Andi Irham Marhamuddin
 * 9 Desember 2019
 * Menentukan jumlah min dan max dengan method.
 */

public class fungsi1 {

    public static void main(String[] args) {
        printBanner();
        printHeadings();
        readAndPrintData();        
    }

    public static void printBanner() {
        System.out.println("\n"+
        "********************************************************\n"+
        "+++     SUM, MIN, AND MAX WITH METHOD PROGRAM        +++\n"+
        "********************************************************\n");
    }

    public static void printHeadings() {
        System.out.printf("%8s %8s %8s %8s %8s\n", 
        "Hitung", "Nilai", "Jumlah", "Minimum", "Maximum");
    }

    public static void readAndPrintData() {
        int cnt=0, sum=0, nilai, min, max;
        Scanner scan = new Scanner(System.in);
        nilai = scan.nextInt();
        max = min = nilai;
        while (nilai != -999) {
            cnt++;
            sum = sum + nilai;
            min = min2(nilai, min);
            System.out.printf("%8d %8d %8d %8d %8d\n", cnt, nilai, sum, min, max);
            nilai = scan.nextInt();
        }
    }

    public static int min2(int a, int b) {
        if(a<b)
            return a;
        else
            return b;
    }

    public static int max2(int a, int b) {
        if(a<b)
            return b;
        else
            return a;
    }

}