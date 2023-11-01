package src.P9;

import java.util.Scanner;

public class LinearSearch04 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);


 // yang awal 
// int[] arrayint = {34,18,26,48,72,20,56,63};
// int key = 20;
// int hasil = 0;


// for (int i = 0; i < arrayint.length; i++) {
//   if (arrayint[i] == key) {
//     hasil = i;
//     break;
//   }
// }
// System.out.println("Key ada dalam array pada posisi indeks ke- "+hasil);


  // Menjawab Pertanyaan
System.out.print("Masukkan jumlah elemen array : ");
  int n = input04.nextInt();

int[] arrayint = new int[n];
for (int i = 0; i < arrayint.length; i++) {
  System.out.print("Masukan elemen array ke-" + (i + 1)+ " : ");
  arrayint[i] = input04.nextInt();  
}

System.out.print("Masukan key yang ingin anda cari : ");
int key = input04.nextInt();

int hasil = -1;
for (int i = 0; i < arrayint.length; i++) {
  if (arrayint[i] == key) {
    hasil = i;
    break;
  }
}

 //Untuk menjawab pertanyaan no 2
// if (arrayint[hasil]== key) {
//   System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
// }else{
//   System.out.println("Key tidak ditemukan dalam array");
// }


 //Untuk menjawab pertanyaan no 3
if (hasil !=-1) {
  System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
} else {
  System.out.println("Key tidak ditemukan dalam array");
}









  }
}
