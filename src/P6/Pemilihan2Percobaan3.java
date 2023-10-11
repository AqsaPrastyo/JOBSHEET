package src.P6;

import java.util.Scanner;

public class Pemilihan2Percobaan3 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

    String kategori;
    int penghasilan, gajiBersih;
    double pajak;
    
    System.out.print("Masukan kategori: ");
    kategori = input04.nextLine();
    System.out.print("Masukan penghasilan: ");
    penghasilan = input04.nextInt();
    
    if (kategori.equalsIgnoreCase("Pekerja")) {
     if (penghasilan <= 2_000_000 ) {
      pajak = 0.1;
     }else if (penghasilan <= 3_000_000) {
      pajak = 0.15;
     } else {
      pajak = 0.2;
     }
      
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji yang anda dapatkan adalah: " + gajiBersih);
    } else if (kategori.equals("Pebisnis")) {
      if (penghasilan <= 2_500_000) {
        pajak = 0.15;
      } else if (penghasilan <= 3_500_00) {
        pajak = 0.2;
      }else {
        pajak = 0.25;
      }
    
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji yang anda dapatkan adalah: " + gajiBersih);
    }else {
      System.out.println("Kategori yang anda masukan salah!");
    }

    input04.close();
  }
}
