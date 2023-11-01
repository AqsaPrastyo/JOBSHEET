package src.P5;

import java.util.Scanner;

public class RentalMobil04 {
  public static void main(String[] args) {
    Scanner aqsa04 = new Scanner(System.in);
boolean exit = false;

do {
  System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1C ===");
  System.out.println("Dibuat oleh : Aqsa Herry Prastyo");
  System.out.println("NIM : 2341720153");
  System.out.println("=============================================");

  System.out.println("Pilih Menu: ");
  System.out.println("1. Data Peminjam ");
  System.out.println("2. Data Rental ");
  System.out.print("Menu: ");
  int menu = aqsa04.nextInt();

  switch (menu) {
    case 1:
      System.out.println("=============================================");
      System.out.println("Data Peminjam");
      System.out.println("=============================================");
      System.out.print("Nama : ");
      String namaPeminjam04 = aqsa04.next();
      System.out.print("Alamat : ");
      String alamatPeminjam04 = aqsa04.next();
      System.out.print("NoHp : ");
      int nohpPeminjam = aqsa04.nextInt();
      System.out.print("Jenis mobil : (Avanza/Innova/Fortuner) : ");
      String jenismobilPeminjam04 = aqsa04.next();
      System.out.print("lama rental: ");
      int lamarentalPeminjam04 = aqsa04.nextInt();
      System.out.print("Apakah anda ingin menggunakan sopir? (y/t) : ");
      String sopirPeminjam04 = aqsa04.next();

      System.out.println("\n\n");

      System.out.println("Apakah anda ingin mencetak data peminjam? (y/t) : ");
      String cetakPeminjam04 = aqsa04.nextLine();
      if (cetakPeminjam04.equals("y")) {
        System.out.println("Nama: " + namaPeminjam04);
        System.out.println("Alamat: " + alamatPeminjam04);
        System.out.println("NoHp: " + nohpPeminjam);
        System.out.println("Jenis mobil: " + jenismobilPeminjam04);
        System.out.println("Lama rental: " + lamarentalPeminjam04);
        System.out.println("Sopir: " + sopirPeminjam04);
      } else if (cetakPeminjam04.equals("t")) {
        System.out.println("Yasudah");
      } else {
        System.out.println("Maaf, input yang anda masukkan tidak valid.");
      }
      break;
    case 2:
      
      break;
    default:
      exit = true;
      break;
  }
} while (!exit);



  }
}
