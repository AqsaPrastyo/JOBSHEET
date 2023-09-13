package src.P3;
import java.util.Scanner;

public class Segitiga04 {
    public static void main(String[] args) {
  
        Scanner  sc = new Scanner(System.in);

      // Input panjang alas Segitiga
        System.out.print("Masukkan panjang alas: ");
        int alas = sc.nextInt();
        // Input tinggi Segitiga
        System.out.print("Masukkan tinggi: ");
        int tinggi = sc.nextInt();
        // Rumus luas Segitiga
        float luas = alas * tinggi / 2;
        // Menampilkan hasil luas garasi
        System.out.println("Luas Segitiga " + luas + " meter persegi");  
      
       // Segitiga Done
    }
}
