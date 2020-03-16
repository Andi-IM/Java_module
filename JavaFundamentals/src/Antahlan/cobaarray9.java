import java.util.Scanner;

/**
 * cobaarray9
 */
public class cobaarray9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        //pengulangan
        do{
        //inisiasi
        System.out.print("Masukkan ukuran Array A: "); int uk1 = in.nextInt();
        int[] A = new int[uk1];
        int is, ang;
        
            //input
            System.out.print("Array A : ");
            for (int i = 0; i<uk1;i++){
                //System.out.print("Nilai ke-"+(i+1)+" = ");
                A[i] = (int)(Math.random()*100); 
            }
            //output Array A
            for (int i = 0; i <uk1;i++) {
                System.out.print(A[i]+" ");
            }
            System.out.print("\nIndeks sisip: "); is = in.nextInt();
            System.out.print("Angka sisip: "); ang = in.nextInt();

            A = new int[uk1+1];
            for (int i = 0; i < A.length; i++) {
                if (i < is) {
                    A[i]= A[i];
                } else if(i == is){
                    A[i] = ang;
                }else if(i > is){
                    A[i] = A[i-1];
                }
            }
            //output B
            System.out.print("New Array A : ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i]+" ");
            }
            System.out.println();
            System.out.println("\nLanjut ga? (0 / 1)"); 
            x=in.nextInt(); //x=in.next().charAt(0);
        }while(x>0 && x<2);
    }
}