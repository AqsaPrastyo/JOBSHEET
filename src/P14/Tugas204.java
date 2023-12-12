package src.P14;

import java.util.Scanner;

public class Tugas204 {
   public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
      int i, n = 1, hasil;

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc04.nextInt();

        System.out.print("Hasil Penjumalahan 1-" + bilangan + ": ");
        for (i = 1; i <= bilangan; i++) {
          System.out.print(i + " + ");
        }
        System.out.print(" = ");
          hasil = jumlahRekursif(n, bilangan);
          System.out.println(hasil);
        sc04.close();
    }

    
    public static int jumlahRekursif(int n, int bilangan) {
        if (n == bilangan) {
            return bilangan;
        } else {
            return n + jumlahRekursif(n + 1, bilangan);
        }
    }
}
