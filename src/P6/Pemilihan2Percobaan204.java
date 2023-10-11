package src.P6;

import java.util.Scanner;

public class Pemilihan2Percobaan204 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

    System.out.print("Masukan Sudut 1: ");
    double Sudut1 = input04.nextDouble();
    System.out.print("Masukan Sudut 2: ");
    double Sudut2 = input04.nextDouble();
    System.out.print("Masukan Sudut 3: ");
    double Sudut3 = input04.nextDouble();

double totalSudut = Sudut1 + Sudut2 + Sudut3;
System.out.println("Total Sudutnya: " + totalSudut);

if (totalSudut == 180) {
  if (Sudut1 == 90 || Sudut2 == 90 || Sudut3 == 90) {
    System.out.println("Segitiga Siku-Siku");
  } else if(Sudut1 == Sudut2 && Sudut2 == Sudut3) {
    System.out.println("Segitiga Sama Sisi");
  } else if (Sudut1 == Sudut2 || Sudut2 == Sudut3 || Sudut1 == Sudut3) {
    System.out.println("Segitiga Sama Kaki");
  } else {
    System.out.println("Segitiga Sembarang");
  }

} else {
  System.out.println("Bukan Segitiga");
}



















input04.close();
  }
}
