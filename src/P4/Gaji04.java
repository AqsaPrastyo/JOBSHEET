package src.P4;

import java.util.Scanner;

public class Gaji04 {
  
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
int jmlMasuk, jmlTdkMasuk, TotGaji;
int gaji=40000, potGaji=25000;

System.out.print("Masukan jumlah hari anda masuk: ");
jmlMasuk = input.nextInt();
System.out.print("Maksukan jumlah hari anda tidak masuk: ");
jmlTdkMasuk = input.nextInt();

TotGaji = (jmlMasuk*gaji)-(jmlMasuk*potGaji);

System.out.println("Gaji yang anda terima adalah: " + TotGaji);
// ini percobaan 2
  }

}
