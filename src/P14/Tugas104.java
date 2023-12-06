package src.P14;
import java.util.Scanner;
public class Tugas104 {
  static void deretDescIteratif(int n) {
    for (int i = n; i >= 0; i--) {
        System.out.print(i + " ");
    }
}


static void deretDescRekursif(int n) {
    if (n >= 0) {
        System.out.print(n + " ");
        deretDescRekursif(n - 1);
    }
}
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.println("Deret descending secara iteratif:");
        deretDescIteratif(n);
        System.out.println();
        System.out.println("Deret descending secara rekursif:");
        deretDescRekursif(n);
    }
}

