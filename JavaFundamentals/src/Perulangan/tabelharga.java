/**
 * tabelharga
 */
public class tabelharga {

	public static void main(String[] args) {
		System.out.printf("Lembar\tHarga\n"); 
		System.out.printf("-------------\n"); 
			for(int i=1;i<=100;i++){ 
			System.out.printf("%d\t%d\n",i,(i*80)); 
			} 
	}
}