import java.util.Scanner;

/**
 * tokosp
 */
public class tokosp {

    public static void main(String[] args) {
        char mem;
        int pakai,pajak,beban,tagihan,bayar;
		Scanner in = new Scanner (System.in);
		printMenu(); //pemanggilan procedure
		System.out.print("Masukkan kategori pelanggan (a/b/c) : ");
        mem = in.next().charAt(0);
    
        if(isiMember(mem)) //Kategori 1/2/3
		{
			
		}
		else //kategori selain 3
		 System.out.println("Maaf, kategori salah. Tagihan tidak dapat dihitung.");

    }

    static void printMenu()
		{
		System.out.println("==Program Penjualan Sparepart Motor==");
		System.out.println("==Jenis Member==");
		System.out.println("a. Umum ==> discount =  0%");
		System.out.println("b. VIP  ==> discount =  10%");
		System.out.println("c. Gold ==> discount =  20%");
        }
    
    static boolean isiMember(int mem)
		{
			if(mem>='a' && mem<='c')
				return true;
			else
				return false;
		}
        
}