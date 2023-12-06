package src.P14;

import java.util.Scanner;

public class Percobaan204 {
  static String deret = " ";
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);
    System.out.println("Bilangan yang dihitung: ");
    int bilangan = sc04.nextInt();
    System.out.println("Pangkat: ");
    int pangkat = sc04.nextInt();

    int hasil = hitungPangkat(bilangan, pangkat);
    System.out.println(deret+ " = " + hasil);
    
  }
static int hitungPangkat (int x, int y ){
  if (y == 0) {
    deret += "x1";
    return (1);
  }else {
    if (!deret.equals("")) {
      
    }
    deret += Integer.toString(x);
    return (x * hitungPangkat(x, y - 1));
  }
}





}
