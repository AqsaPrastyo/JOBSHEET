package src.P11;

import java.util.Scanner;

public class TugasIndividu104 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Input tidak valid. N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                
                for (int j = N - i; j > 0; j--) {
                    System.out.print("  ");
                }

                
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                    
                    if (k < i) {
                    System.out.print(" ");
                }
                }

                
                System.out.println();
            }
        }

        scanner.close();
    }
}
