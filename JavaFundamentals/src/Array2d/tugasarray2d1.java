package Array2d;

import java.util.Scanner;

/**
 * tugasarray2d
 * na = 15%kuis +15%tugas + 30%UTS + 40%UAS
 * andi - syarif
 */
public class tugasarray2d1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Variables
        int m, n=5, i, j, na=0;
        int jum=0, min=100, imin=0, max=0, imax=0; 
        String jmin="", jmax="";
        float rata;

        //Rowinput
        System.out.print("Masukkan banyak mahasiswa= "); m= in.nextInt();
        
        //Array initialization
        String judul[] = {"No.","Kuis","Tugas","UTS", "UAS", "NA", "NH"};
        int nilai[][] = new int[m][6];
        char nh[] = new char[m];
        int h[] = new int[5];
        
        //array input
        for (i = 0; i < m; i++) {
            nilai[i][0]=i+1;
            for (j = 1; j < n; j++) 
            {
            nilai[i][j]=(int)(Math.random()*((100-40)+1))+40;
            
            if (nilai[i][j]<min) {
                imin=i+1;
                if (j!=0) {
                min = nilai[i][j];
                if (j==1) {
                    jmin="Kuis";
                } else if (j==2) {
                    jmin="Tugas";
                } else if (j==3) {
                    jmin="UTS";
                } else if (j==4) {
                    jmin="UAS";
                }
            }}
            if (nilai[i][j]>=max) 
                {
                imax=i+1;
                if (j!=0) {
                max = nilai[i][j];
                if (j==1) {
                    jmax="Kuis";
                } else if (j==2) {
                    jmax="Tugas";
                } else if (j==3) {
                    jmax="UTS";
                } else if (j==4) {
                    jmax="UAS";
                }
                }}
    
            na = ((15*nilai[0][1])/100)+((15*nilai[i][2])/100)+((3*nilai[i][3])/10)+((4*nilai[i][4])/10);
            nilai[i][5]=na;
            jum += nilai[i][5];
            if (nilai[i][5]>90) {
                nh[i]='A';
                a += 1;
            }else if (nilai[i][5]>=80) {
                nh[i]='B';
                b += 1;
            }else if (nilai[i][5]>60) {
                nh[i]='C';
                c += 1;
            }else if (nilai[i][5]>50)
            {
                nh[i]='D';
                d += 1;
            }
            else{
                nh[i]='E';
                e += 1;
            }
            }}
        rata = (float) jum/m;
        
        //menampilkan isi array 1D
        for (j = 0; j < judul.length; j++) {
            System.out.print(judul[j]+"\t");                
        }
        System.out.println();

        //menampilkan isi array 2D
        for (i = 0; i < m; i++) {
            
            for (j = 0; j < n; j++) {
                System.out.print(nilai[i][j]+"\t");
            }
            System.out.print(nilai[i][5]+"\t");
            System.out.print(nh[i]);
            System.out.println();
        }
        System.out.println("Nilai tertinggi = "+max+" oleh mahasiswa nomor urut "+imax+" pada nilai "+jmax);
        System.out.println("Nilai terendah = "+min+" oleh mahasiswa nomor urut "+imin+" pada nilai "+jmin);
        System.out.println("Rerata Nilai Akhir kelas = "+rata);

        System.out.println("Disribusi Nilai:");
        System.out.println("Nilai A = "+a);
        System.out.println("Nilai B = "+b);
        System.out.println("Nilai C = "+c);
        System.out.println("Nilai D = "+d);
        System.out.println("Nilai E = "+e);
    }
}