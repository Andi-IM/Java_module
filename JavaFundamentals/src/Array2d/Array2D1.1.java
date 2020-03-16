package Array2d;

import java.util.Scanner;

/**
 * Array2D1.1
 */
public class Array2D1.1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int disp[][] = new int[2][3];
   /*Counter variables for the loop*/
   int i, j;
   for(i=0; i<2; i++) {
      for(j=0;j<3;j++) {
         System.out.println("Enter value for disp["+i+"]["+j+"]: ");
         
      }
   }
   //Displaying array elements
   printf("Two Dimensional array elements:\n");
   for(i=0; i<2; i++) {
      for(j=0;j<3;j++) {
         printf("%d ", disp[i][j]);
         if(j==2){
            System.out.println();
         }
      }
   }
    }
}