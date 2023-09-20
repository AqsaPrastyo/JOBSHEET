package src.P4;

import java.util.Scanner;

public class HargaBayar04 {
  
public static void main(String[] args) {
  
  Scanner input04 = new Scanner(System.in);

  int harga, jumlah;
  double dis = 0.1, total, bayar, jmlDis;

  System.out.print("Masukan harga barang yang dibeli: ");
  harga = input04.nextInt();
  System.out.print("Masukan jumlah barang yang dibeli: ");
  jumlah = input04.nextInt();
  
  total = harga*jumlah;

  jmlDis = total*dis;

  bayar = total - jmlDis;

System.out.println("Diskon yang anda dapatkan adalah: " +jmlDis);
System.out.println("Jumlah yang anda harus dibayar adalah: " +bayar);





  }

}
