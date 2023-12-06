package src.P14;

import java.util.Scanner;

public class Percobaan204 {
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);
    System.out.println("Bilangan yang dihitung: ");
    int bilangan = sc04.nextInt();
    System.out.println("Pangkat: ");
    int pangkat = sc04.nextInt();
    System.out.println(hitungPangkat(bilangan, pangkat));
  }
static int hitungPangkat (int x, int y ){
  if (y == 0) {
    return (1);
  }else {
    return (x * hitungPangkat(x, y - 1));
  }
}





}
