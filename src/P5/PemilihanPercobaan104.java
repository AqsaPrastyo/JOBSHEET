package src.P5;

import java.util.Scanner;

public class PemilihanPercobaan104 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

System.out.print("Masukan angka: ");
int angka = input04.nextInt();
String genap;


// menggunakan if
// if (angka %2==0 ) {
//  System.out.println("Angka " + angka + " bilangan genap");
// }else{
//  System.out.println("Angka " + angka + " bilangan ganjil");
// }

//menggunakan Tenary Operator
genap = (angka % 2==0) ?  "Genap" : "ganjil";

System.out.println(genap);

input04.close();
  }
}
