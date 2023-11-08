package src.P10;

public class Bioskop04 {
  public static void main(String[] args) {
    

String penonton [][] = new String[4][2];

penonton [0][0] = "Amir"; 
penonton [0][1] = "Benna";
penonton [1][0] = "Candra"; 
penonton [1][1] = "Dela"; 
penonton [2][0] = "Eka";
penonton [2][1] = "Farhan"; 
penonton [3][0] = "Gisel"; 
// untuk menjawab no 3 
penonton [3][1] = "Hannah";


    // System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]) ;
    // System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]) ;
    // System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]) ;
    // System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]) ;


// untuk menjawab no 4
// System.out.println(penonton.length);
// System.out.println(penonton[0].length);
// System.out.println(penonton[1].length);
// System.out.println(penonton[2].length);
// System.out.println(penonton[3].length);

// Untuk menjawab no 5
// System.out.println(penonton.length);

// for (int i = 0; i < penonton.length; i++) {
//   System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
// }

// Untuk menjawab no 6
// System.out.println(penonton.length);
// for (String[] barisPenonton : penonton) {
//   System.out.println("Panjang baris: " + barisPenonton.length);
// }


// untuk menjawab no 10
System.out.println("Penonton pada baris ke-3: ");

for (int i = 0; i < penonton[2].length; i++) {
  System.out.println(penonton[2][i]);
}

























  }
}
