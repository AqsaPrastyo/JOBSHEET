package src.P11;

import java.util.Scanner;

public class NestedLoop04 {
  public static void main(String[] args) {
    
Scanner sc04 = new Scanner(System.in);

double ness[][] = new double[5][7];


for (int i = 0; i < ness.length; i++) {
  System.out.println("Kota ke-" + i);
  for (int j = 0; j < ness[0].length; j++) {
    System.out.print("Hari ke-" + (j + 1) + ": ");
    ness[i][j] = sc04.nextDouble();
  }
  System.out.println( );
}

// for (int i = 0; i < ness.length; i++) {
//   System.out.print("Kota ke-" + (i + 1) + ": ");
//   for (int j = 0; j < ness[0].length; j++) {
//     System.out.print(ness[i][j] + " ");
    
//   }
//   System.out.println( );
// }


for (int i = 0; i < ness.length; i++) {
  
      System.out.print("Kota ke-" + (i + 1) + ": ");
      for (double hari : ness[i]) {
        System.out.print(hari + " ");
      }
      System.out.println();
    }


  }
}
