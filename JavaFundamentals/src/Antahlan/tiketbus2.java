import java.util.Scanner;

public class tiketbus2{
    public static void main(String[]args){
    int bus;
    int jml, armada;
    float harga;

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("1. Jakarta \n2. Yogyakarta \n3. Surabaya");
    System.out.print("\nMasukkan tujuan Anda: (1)..(3)");
    bus = scanner.nextInt();
    switch (bus){
        case 1:
        System.out.println("Masukkan armada anda: (1/2/3)");
        armada = scanner.nextInt();
        System.out.println("Masukkan jumlah tiket Anda: ");
        jml = scanner.nextInt();
        
        if(armada == 1){
            harga = 70000 * jml;
        System.out.println(harga);
        } else if(armada == 2){
            harga = 40000 * jml;
            System.out.println(harga);
        } else if(armada == 3){
            harga = 10000 * jml;
            System.out.println(harga);
        }      
            break;
        case 2:
        System.out.println("Masukkan armada anda: (1/2/3)");
        armada = scanner.nextInt();
        System.out.println("Masukkan jumlah tiket Anda: ");
        jml = scanner.nextInt();
        
        if(armada == 3 && jml > 3){
            harga = (float)0.9 * 20000 * jml;
            System.out.println("Anda dapat diskon 10%= "+((float)0.1*20000*jml));
            System.out.println(harga);
        } else if(armada == 3 && jml < 4){
            harga = 20000 * jml;
            System.out.println(harga);
        } else if(armada == 2){
            harga = 50000 * jml;
            System.out.println(harga);
        } else if(armada == 1){
            harga = 80000 * jml;
            System.out.println(harga);
        }            
        break;
        case 3:
        System.out.println("Masukkan armada anda: (1/2/3)");
        armada = scanner.nextInt();
        System.out.println("Masukkan jumlah tiket Anda: ");
        jml = scanner.nextInt();
        
        if(armada == 3 && jml > 3){
            harga = (float)0.9 * 20000 * jml;
            System.out.println(harga);
        } else if(armada == 3 && jml < 4){
            harga = 20000 * jml;
            System.out.println(harga);
        } else if(armada == 2){
            harga = 50000 * jml;
            System.out.println(harga);
        } else if(armada == 1){
            harga = 80000 * jml;
            System.out.println(harga);
        }            
            break;
        default:
            break;
    }

    }
}
