package src.P9;

import java.util.Scanner;

public class Tugas104 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
double rata2, total = 0;

System.out.print("Masukan jumlah Mahasiswa: ");
int n = input04.nextInt();
//arraynya
int[] arrayNilai = new int[n];
for (int i = 0; i < arrayNilai.length; i++) {
  System.out.print("Masukan nilai mahasiswa ke-" + (i + 1)+ " : ");
  arrayNilai[i] = input04.nextInt();
}

int nilaiTertinggi = arrayNilai[0];
int nilaiTerendah = arrayNilai[0];
// Buat cari nilai max dan min
for (int i = 0; i < arrayNilai.length; i++) {
  if (arrayNilai[i] > nilaiTertinggi) {
    nilaiTertinggi = arrayNilai[i];
  }else if (arrayNilai[i] < nilaiTerendah) {
    nilaiTerendah = arrayNilai[i];
  }
}
//Buat ngeloop total
   for (int i = 0; i < arrayNilai.length; i++) {
    total += arrayNilai[i];
  }
// Outputnya Gess
    rata2 = total/arrayNilai.length;
  System.out.println("Rata-rata nilai: " +rata2);
  System.out.println("Nilai tertinggi: " + nilaiTertinggi);
  System.out.println("Nilai terendah: " + nilaiTerendah);

















  }
}
