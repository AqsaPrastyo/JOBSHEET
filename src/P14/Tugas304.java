package src.P14;

import java.util.Scanner;

public class Tugas304 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan untuk dicek apakah prima atau bukan: ");
        int n = scanner.nextInt();

        if (isPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    
    private static boolean isPrima(int k, int l) {
        
        if (l > k / 2) {
            return true;
        }
        if (k % l == 0) {
            return false;
        }
        return isPrima(k, l + 1);
    }
}
