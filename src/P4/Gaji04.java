package src.P4;

import java.util.Scanner;

public class Gaji04 {
  
public static void main(String[] args) {
  Scanner input04 = new Scanner(System.in);
  
int jmlMasuk, jmlTdkMasuk, TotGaji;
int gaji, potGaji;

System.out.print("Masukan jumlah hari anda masuk: ");
jmlMasuk = input04.nextInt();
System.out.print("Maksukan jumlah hari anda tidak masuk: ");
jmlTdkMasuk = input04.nextInt();
System.out.print("Masukan besaran gaji: ");
gaji = input04.nextInt();
System.out.print("Masukan potongan gaji: ");
potGaji = input04.nextInt();

TotGaji = (jmlMasuk*gaji)-(jmlMasuk*potGaji);

System.out.println("Gaji yang anda terima adalah: " + TotGaji);
// ini percobaan 2



input04.close();
  }

}
