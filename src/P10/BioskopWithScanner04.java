package src.P10;

import java.util.Scanner;

public class BioskopWithScanner04 {
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);
    
    String penonton [][] = new String[4][2];

// while (true) {
//   System.out.print("Masukan nama: ");
// String nama = sc04.next();
//   System.out.print("Masukan baris: ");
// int baris = sc04.nextInt();
//   System.out.print("Masukan kolom: ");
// int kolom = sc04.nextInt();

// penonton[baris-1][kolom-1] = nama;

// System.out.print("Input penonton lainnya? (y/n): ");
// String next = sc04.next();

// if (next.equalsIgnoreCase("n")) {
//   break;
// }

// }

// untuk menjawab no 2
int pilihMenu;
do {
  System.out.println("\n\n=========================Pilih Menu=========================");
  System.out.println(
      "1. Input Data Penonton\n2. Tampilkan daftar penonton\n3. Keluar");
  System.out.println("============================================================");
  System.out.print("Pilih Menu : ");
   pilihMenu = sc04.nextInt();
switch (pilihMenu) {
  case 1:
    while (true) {
  System.out.print("Masukan nama: ");
String nama = sc04.nextLine();
nama = sc04.nextLine();
  System.out.print("Masukan baris: ");
int baris = sc04.nextInt();
  System.out.print("Masukan kolom: ");
int kolom = sc04.nextInt();

if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
  
    if (penonton[baris - 1][kolom - 1] == null) {
  penonton[baris - 1][kolom - 1] = nama;
} else {
  System.out.println("Kursi sudah terisi oleh penonton lainnya. Silakan masukkan baris dan kolom kembali.");
}

 }else {
  System.out.println("Nomor baris/kolom tidak tersedia!");
}




System.out.print("Input penonton lainnya? (y/n): ");
String next = sc04.next();


if (next.equalsIgnoreCase("n")) {
  break;
}

}
    break;

 case 2:
 while (true) {
  



 for (int i = 0; i < penonton.length; i++) {
        for (int j = 0; j < penonton[j].length; j++) {
          if (penonton != null) {
            penonton[i][j] = "****";
          System.out.println("Baris: " + (i + 1) + ", Kolom: " + (j + 1) + ", Nama: " + penonton[i][j]);  
          }
          
        }
}



    break;
}
    break;

 case 3:
    System.out.println("Anda keluar dari program");
    break;

  default:
  System.out.println("Tidak valid bang");
    break;
}




} while (pilihMenu != 3);











    
  }
}
