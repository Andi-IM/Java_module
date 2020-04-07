import java.util.Scanner;

/*
this lib not use
#include <stdio.h> 
#include <conio.h> 
*/

/**
 * fibonacci
 */
public class fibonacci {
	public static void main(String[] args) { //void main(){ 
		int i,j,n,f=1,f2=1,fibo=0;  
		Scanner in = new Scanner(System.in);
	System.out.printf("masukkan n = ");n = in.nextInt();//printf("masukkan n = ");scanf("%d",&n);  
	System.out.printf("Deret Fibonacci -> 1 ");    	    //printf("Deret Fibonacci -> 1 ");  
		for(i=1;i<=n-2;i++){   
			System.out.printf("%d ",f2);   				 //	printf("%d ",f2);   
			fibo=f+f2; 
			f = f2;   
			f2 = fibo;  
		}  
	System.out.printf("%d\n",fibo);  					//printf("%d\n",fibo);  
	System.out.printf("jawab = %d",fibo);				//printf("jawab = %d",fibo); 
	}										//}
}