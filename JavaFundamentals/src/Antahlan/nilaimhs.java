import java.util.Random;
import java.util.Scanner;

/**
 * nilaimhs
 */
public class nilaimhs {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N;
    Header();
    N=scan.nextInt();
    IOMhs(N);
    //NilaiABC(nilai,nh, N);
    //minmax(nilai);

    }

    public static void Header() {
        System.out.println("\n"+
            "********************************************************\n"+
            "+++         Nilai Mahasiswa with Method form         +++\n"+
            "********************************************************\n");
            System.out.print("Masukkan jumlah mahasiswa= ");    
            }

    public static void IOMhs(int n) {
        int cnt=0, na, jum=0, min=100, max = 0; 
        int posmin=1; //mewakili posisi min
        int posmax=1; //mewakili posisi max
        char huruf='A'; 
        float rata;
        int[] nilai = new int[4]; //nilai mewakili nilai kuis, tugas, uts, uas
        int[] sebh = new int[5]; //array mewakili sebaran huruf a, b, c, d, e
        Random rand = new Random();

        System.out.printf("%8s %8s %8s %5s %8s %8s %8s\n", 
                  "No", "Kuis", "Tugas", "UTS", "UAS", "NA", "NH");
    
        
        for (int i = 1; i <=n; i++) {
            cnt++;
            for (int j = 0; j < nilai.length; j++) {
                nilai[j] = rand.nextInt((100-30)+1)+30;
                if (nilai[j]<min) {
                    min = nilai[j];
                }
                if (nilai[j]>=max) {
                    max = nilai[j];
                }
            }
            na = ((15*nilai[0])/100)+
                ((15*nilai[1])/100)+
                ((30*nilai[2])/100)+
                ((40*nilai[3])/100);
            
            jum += na;
            huruf = nh(na, huruf);
            switch (huruf) {
                case 'A':
                    sebh[0] += 1;
                    break;
                case 'B':
                    sebh[1] += 1;
                    break;
                case 'C':
                    sebh[2] += 1;
                    break;
                case 'D':
                    sebh[3] += 1;
                    break;
                case 'E':
                    sebh[4] += 1;
                    break;
            }
                System.out.printf("%8d %8d %8d %8d %8d %8d %8c\n", cnt, nilai[0], nilai[1], nilai[2], nilai[3], na, huruf);
        }
        rata = (float) jum / n;
        System.out.println("jumlah= "+jum);
        System.out.println("rata-rata= "+rata);
        System.out.println("Nilai minimum= "+min);
        System.out.println("Nilai Max= "+max);

        System.out.println("\nDistribusi Nilai");
        System.out.println("Nilai A= "+sebh[0]);
        System.out.println("Nilai B= "+sebh[1]);
        System.out.println("Nilai C= "+sebh[2]);
        System.out.println("Nilai D= "+sebh[3]);
        System.out.println("Nilai E= "+sebh[4]);

    }

    public static char nh(int a, char b) {
        if (a>90) {
            b = 'A';
        } else if (a>=80) {
            b = 'B';
        } else if (a>60) {
            b = 'C';
        } else if (a>50) {
            b = 'D';
        } else {
            b = 'E';
        }
        return b;
    }

    public static void max() {
        
    }

    public static void min() {
        
    }
    
}