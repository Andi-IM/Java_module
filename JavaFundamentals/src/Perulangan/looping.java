/**
 * looping
 */
public class looping {
	 public static void main(String[] args) {
		int i;
		int j;
	System.out.println(~1);
	System.out.printf("P\tQ\tP or Q\tP and Q\tNot P\tP xor Q\n"); 
	System.out.printf("=================================================\n"); 
	for(i=1;i>=0;i--){ 
		for(j=1;j>=0;j--){ 
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",i,j,(i | j),(i & j),(~i),(i ^ j)); 
			} 
		}	

	 }
}


	 
