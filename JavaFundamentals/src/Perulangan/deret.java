//#include <conio.h>								// kedua library ini ga kepake
//#include <stdio.h> 								//	karena sudah otomatis ada dalam library java.
 
/**
 * deret
 */
public class deret {
	public static void main(String[] args) {		//void main(){ 
		int i,j; 
		for(i=1;i<=20;i++){ 
			if(i % 5 == 0) 
				System.out.printf("%d\n",i); 		//printf == system.out.prinf pada java
			else 
				System.out.printf("%d\t",i); 
		} 
	}												//} 
	
}										
										
										