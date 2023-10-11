package src.P5;

import java.util.Scanner;

public class PemilihanPercobaan304 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

    double angka1, angka2, hasil;
    char operator;

    System.out.print("Masukan angka pertama: ");
    angka1 = input04.nextDouble();
    System.out.print("Masukan angka kedua: ");
    angka2 = input04.nextDouble();
    System.out.print("Masukan operator (+ - * /) : ");
    operator = input04.next().charAt(0);

    switch (operator) {
      case '+' :
        hasil = angka1 + angka2;
      System.out.println(angka1  + " + " + angka2 + " = " + hasil);
       // break;
      case '-' :
        hasil = angka1 - angka2;
      System.out.println(angka1  + " - " + angka2 + " = " + hasil);
        break;
      case '*' :
        hasil = angka1 * angka2;
      System.out.println(angka1  + " * " + angka2 + " = " + hasil);
        break;
      case '/' :
        hasil = angka1 / angka2;
      System.out.println(angka1  + " / " + angka2 + " = " + hasil);
        break;
    
      default:
      System.out.println("Operator yang Anda masukkan salah ");
        break;
    }


    input04.close();
  } 
}
