package src.P10;

import java.util.Scanner;

public class BioskopWithScanner04 {
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);

    String penonton [][] = new String[4][2];

while (true) {
  System.out.print("Masukan nama: ");
String nama = sc04.next();
  System.out.print("Masukan baris: ");
int baris = sc04.nextInt();
  System.out.print("Masukan kolom: ");
int kolom = sc04.nextInt();

penonton[baris-1][kolom-1] = nama;

System.out.print("Input penonton lainnya? (y/n): ");
String next = sc04.next();

if (next.equalsIgnoreCase("n")) {
  break;
}

}













    
  }
}
