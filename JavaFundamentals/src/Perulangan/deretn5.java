import java.util.Scanner;

//#include <stdio.h> 
//#include <conio.h> 

//void main(){ 
/**
 * deretn5
 */
public class deretn5 {
	public static void main(String[] args) {						// void main();
	Scanner in = new Scanner(System.in);	

	int i,j,n; 
	System.out.printf("masukkan n = ");								//printf("masukkan n = ");		
	n = in.nextInt();												//scanf("%d",&n); 
		for(i=1;i<=n;i++){ 
			for(j=1;j<=((n+1)-i);j++){ 
				if(j % 2 == 0) 
					System.out.printf("O ");						//printf("O ");
				else 
					System.out.printf("X ");						//printf("X "); 
			} 
			System.out.printf("\n");								//printf("\n"); 
		}	
	}																//}
	
}
