package src.P5;

import java.util.Scanner;

public class PemilihanPercobaan204 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
  
  System.out.print("Nilai uas    : ");
  float uas = input04.nextFloat();
  System.out.print("Nilai uts    : ");
  float uts = input04.nextFloat();
  System.out.print("Nilai kuis   : ");
  float kuis = input04.nextFloat();
  System.out.print("Nilai tugas  : ");
  float tugas = input04.nextFloat(); 

  float total =   (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

  String message = total < 65 ? "Remidi" : "Tidak Remidi";

  System.out.println("Nilai Akhir = " + total + " sehingga " + message);


  
  }
}
