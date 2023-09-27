package P5;

import java.util.Scanner;

public class PemilihanPercobaan104 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

System.out.print("Masukan angka: ");
int angka = input04.nextInt();
String genap;

if (angka %2==0 ) {
  System.out.println("Angka " + angka + " bilangan genap");
}else{
  System.out.println("Angka " + angka + " bilangan ganjil");
}




  }
}
