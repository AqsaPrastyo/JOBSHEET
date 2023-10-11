package src.P4;

import java.util.Scanner;

public class HargaBayar04 {
  
public static void main(String[] args) {
  
  Scanner input04 = new Scanner(System.in);

  String merkBuku;
  int harga, jumlah, jumlah_halaman;
  double dis, total, bayar, jmlDis;

  System.out.print("Merk buku yang dibeli: ");
  merkBuku = input04.nextLine();
  System.out.print("Masukan harga barang yang dibeli: ");
  harga = input04.nextInt();
  System.out.print("Masukan jumlah barang yang dibeli: ");
  jumlah = input04.nextInt();
  System.out.print("Jumlah halaman buku: ");
  jumlah_halaman = input04.nextInt();
  System.out.print("Masukan Diskon yang didapat: ");
  dis = input04.nextDouble();
  
  total = harga*jumlah;

  jmlDis = total*dis;

  bayar = total - jmlDis;

System.out.println("Merk Buku: " + merkBuku);
System.out.println("Jumlah Halaman Buku: " + jumlah_halaman);
System.out.println("Diskon yang anda dapatkan adalah: " +jmlDis);
System.out.println("Jumlah yang anda harus dibayar adalah: " +bayar);




input04.close();
  }

}
