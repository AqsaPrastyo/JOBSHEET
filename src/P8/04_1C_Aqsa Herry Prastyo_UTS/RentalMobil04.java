package UTSPrakDaspro;

import java.util.Scanner;



public class RentalMobil04 {
  public static void main(String[] args) {
    Scanner herry04 = new Scanner(System.in);


    System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1C ===");
    System.out.println("Dibuat oleh : Aqsa Herry Prastyo");
    System.out.println("NIM : 2341720153");
    System.out.println("=============================================");

System.out.println("Pilih Menu: ");
System.out.println("1. Data Peminjam ");
System.out.println("2. Data Rental ");
System.out.print("Menu: ");
int menu = herry04.nextInt();


  
switch (menu) {
  case 1:


    
  
    System.out.println("=============================================");
    System.out.println("Data Peminjam");
    System.out.println("=============================================");
    System.out.print("Nama : ");
    String namaPeminjam04 = herry04.next();
    System.out.print("Alamat : ");
    String alamatPeminjam04 = herry04.next();
    System.out.print("NoHp : ");
    int nohpPeminjam04 = herry04.nextInt();
    System.out.print("Jenis mobil : (Avanza/Innova/Fortuner) : ");
    String jenismobilPeminjam04 = herry04.next();
    System.out.print("lama rental: ");
    int lamarentalPeminjam04 = herry04.nextInt();
    System.out.print("Apakah anda ingin menggunakan sopir? (y/t) : ");
    String sopirPeminjam04 = herry04.next();
    
   System.out.println("\n\n");

    System.out.print("Apakah anda ingin mencetak data peminjam? (y/t) : ");
String cetakPeminjam04 = herry04.next();
if (cetakPeminjam04.equals("y")) {
  System.out.println("Nama : " + namaPeminjam04);
  System.out.println("Alamat : " + alamatPeminjam04);
  System.out.println("NoHp : " + nohpPeminjam04);
  System.out.println("Jenis mobil : " + jenismobilPeminjam04);
  System.out.println("Perkiraan Lama rental : " + lamarentalPeminjam04);
  System.out.println("Jasa Sopir : " + sopirPeminjam04);
} else if (cetakPeminjam04.equals("t")) {
  System.out.println("Yasudah");
} else {
  System.out.println("Maaf, input yang anda masukkan tidak valid.");
}


System.out.print("kembali ke menu? (y/t) : ");
String kembaliMenu04 = herry04.next();







    break;
case 2:
    int Avanza, Innova, Fortuner, biayasopir, biayaMobil;

    Avanza = 250_000;
    Innova = 300_000;
    Fortuner = 350_000;
    biayasopir = 100_000;
    


String jenismobilPeminjam042 = "Avanza, Innova, Fortuner";





    
    System.out.println("=============================================");
    System.out.println("Perhitungan Biaya Rental");
    System.out.println("=============================================");
    System.out.print("Masukan lama rental : ");
    lamarentalPeminjam04 = herry04.nextInt();
    
    System.out.println("=============================================");
    System.out.println("Detai Pembayaran");
    System.out.println("=============================================");

    int totalbiayasopir = lamarentalPeminjam04 * biayasopir;
       


    System.out.println("Biaya sopir : " + totalbiayasopir);
    // System.out.println("Biaya mobil : " + biayaMobil);





  






    break;

  default:
    break;
}











  }
}
