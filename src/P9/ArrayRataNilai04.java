package src.P9;

import java.util.Scanner;

public class ArrayRataNilai04 {
  public static void main(String[] args) {
  Scanner sc04 = new Scanner(System.in);

  System.out.print("Masukkan jumlah mahasiswa : ");
  int n = sc04.nextInt();

int[] nilaiMhs = new int[n];

    double rata2, total = 0;
    int banyakLulus = 0;
    int banyakTidakLulus = 0;
    double rata2Lulus = 0;
    double rata2TidakLulus = 0;

for (int i = 0; i < nilaiMhs.length; i++) {
  System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
  nilaiMhs[i] = sc04.nextInt(); 

  if (nilaiMhs[i] > 70) {
    banyakLulus++;
    rata2Lulus += nilaiMhs[i];
  } else {
    banyakTidakLulus++;
    rata2TidakLulus += nilaiMhs[i];
  }
}


for (int i = 0; i < nilaiMhs.length; i++) {
  total += nilaiMhs[i];
}

rata2 = total/nilaiMhs.length;
// System.out.println("Rata-rata nilai : "+rata2);
// System.out.println("Banyak mahasiswa yang lulus : "+banyakLulus);
System.out.println("Rata-rata nilai lulus : "+rata2Lulus/banyakLulus);
// System.out.println("Banyak mahasiswa yang tidak lulus : "+banyakTidakLulus);
System.out.println("Rata-rata nilai tidak lulus : "+rata2TidakLulus/banyakTidakLulus);



 }
}
