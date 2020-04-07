import java.util.Scanner;								// mengambil library yang terdapat pada JDK, JDK memiliki banyak library
														// library tak hanya dapat diambil JDK, anda juga bisa membuat library sendiri
//int main ()
//(

/**
 * bilanganprima
 */
public class bilanganprima {							// ini adalah kelas yang akan diterjemahkan oleh JDK dari .java menjadi .class
	public static void main(String[] args) {			// ini adalah main method, semua kodingan akan dibaca langsung di dalam tanda {}
		int batas, x, cek, i;							// pengenalan variable
		Scanner in = new Scanner(System.in);			// pemanggilan fungsi java.util.Scanner(); dengan parameter System.in
		System.out.print("Batas dari derert bilangan prima");		// cout<<"batas dari deret bilangan prima : ";
		batas = in.nextInt();							// cin>>batas;
		System.out.println();							// cout<<endl;
		System.out.println("deret bilangan prima sampai angka "+batas+" adalah: ");		// cout<<"deret bilangan prima sampai angka "<<batas<<" adalah: "<<endl<<endl;
	
		for (x = 2; x<=batas; x++)						// inisiasi for yang mengadaptasi cara c++
		{
			cek = 0;
			for (i = 2; i < x; i++){
			if (x % i == 0){
					cek = 1;
				}
			}

			if (cek == 0){
				System.out.print(x+", ");									//cout<<x<<", ";
				}	
		}
	
	}
}
	
//}
//getch();
//}