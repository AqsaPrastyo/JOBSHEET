package src.P10;

import java.util.Arrays;

public class Numbers04 {
  public static void main(String[] args) {
    int [][] myNumbers04 = new int[3][];
myNumbers04 [0] = new int[5];
myNumbers04 [1] = new int[3];
myNumbers04 [2] = new int[1];

// Untuk menjawab no 1
for (int i = 0; i < myNumbers04.length; i++) {
  System.out.println(Arrays.toString(myNumbers04[i]));
}

// Untuk menjawab no 4
for (int i = 0; i < myNumbers04.length; i++) {
 System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers04[i].length); 
}










  }
}
