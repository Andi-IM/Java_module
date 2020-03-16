package Percabangan;

/*
Nama : Andi Irham Marhamuddin
Kelas : TRPL 1B
*/

import java.util.Scanner;

public class tiketbus{
    public static void main(String[]args){
    char tujuan;
    char kelas;
    int jml_tiket;
    int eks, bisnis, ekonomi;
    int harga;
    int diskon;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Masukkan tujuan Anda: ");
    System.out.println("1. Jakarta \n2. Yogya \n3. Surabaya");
    tujuan = scanner.nextInt();
    switch (tujuan){
        case '1':
                eks = 70000;
                bisnis = 40000;
                ekonomi = 10000;

                System.out.println("Masukkan kelas Anda: ");
                System.out.println("1. Eksekutif \n2. Bisnis \n3. Ekonomi");
                kelas = scanner.nextLine();
                switch (kelas){
                    case '1':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * eks;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    case '2':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * bisnis;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    case '3':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * ekonomi;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    default:
                    System.out.println("Maaf, input yang anda masukkan salah!");
                    break;
                }
                break;
        case '2':
                System.out.println("Masukkan kelas Anda: ");
                System.out.println("1. Eksekutif \n2. Bisnis \n3. Ekonomi");
                eks = 80000;
                bisnis = 50000;
                ekonomi = 20000;
                switch (kelas){
                    case '1':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * eks;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    case '2':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * bisnis;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    case '3':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * ekonomi;
                    if(jml_tiket >=4){
                        diskon = 10/100*harga;
                        harga = harga - diskon;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    }else{
                        diskon = 0;
                        harga = harga - diskon;
                        System.out.println("Jumlah tiket yang anda bayar= "+harga);
                    }
                    default:
                    System.out.println("Maaf, input yang anda masukkan salah!");
                    break;
                }
                break;
        case '3':
                System.out.println("Masukkan kelas Anda: ");
                System.out.println("1. Eksekutif \n2. Bisnis \n3. Ekonomi");
                eks = 90000; bisnis = 60000; ekonomi = 30000;
                switch (kelas){
                    case '1':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * eks;
                    if(jml_tiket >=4){
                        diskon = 10/100*harga;
                        harga = harga - diskon;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    }else{
                        diskon = 0;
                        harga = harga - diskon;
                        System.out.println("Jumlah tiket yang anda bayar= "+harga);
                    }
                    break;
                    case '2':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * bisnis;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    break;
                    case '3':
                    System.out.print("Masukkan jumlah tiket Anda: ");
                    jml_tiket = scanner.nextLine();
                    harga = jml_tiket * ekonomi;
                    System.out.println("Jumlah tiket yang Anda bayar= "+harga);
                    break;
                    default:
                    System.out.println("Maaf, input yang anda masukkan salah!");
                    break;
                }
        default:
        break;
        }
     }

}
