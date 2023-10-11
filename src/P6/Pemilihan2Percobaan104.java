package src.P6;

import java.util.Scanner;

public class Pemilihan2Percobaan104 {
  public static void main(String[] args) {
    
Scanner input04 = new Scanner(System.in);

System.out.print("Masukan tahun: ");
int tahun = input04.nextInt();

if (tahun % 4 == 0) {
  if (tahun % 100 == 0) {
    if (tahun % 400 == 0) {
      System.out.println("Tahun kabisat");
    } else {
      System.out.println("Bukan tahun kabisat");
    }
  } else{
    System.out.println("Tahun kabisat");
  }
} else {
  System.out.println("Bukan tahun kabisat");
}








input04.close(); 
  }
}
