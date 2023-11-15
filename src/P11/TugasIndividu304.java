package src.P11;

import java.util.Scanner;

public class TugasIndividu304 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"}; 
        String[][] daftarAtlet = new String[cabangOlahraga.length][5];

        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.println("Masukkan data atlet untuk " + cabangOlahraga[i]);
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                daftarAtlet[i][j] = scanner.nextLine();
            }
            System.out.println();
        }
        
        for (int i = 0; i < daftarAtlet.length; i++) {
            for (int j = 0; j < daftarAtlet[i].length - 1; j++) {
                for (int k = j + 1; k < daftarAtlet[i].length; k++) {
                    if (daftarAtlet[i][j].compareTo(daftarAtlet[i][k]) > 0) {
                        
                        String temp = daftarAtlet[i][j];
                        daftarAtlet[i][j] = daftarAtlet[i][k];
                        daftarAtlet[i][k] = temp;
                    }
                }
            }
        }

        
        System.out.println("Daftar Atlet Porseni 2024:");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.println("Cabang Olahraga " + cabangOlahraga[i] + ":");
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.println("Nama atlet ke-" + (j + 1) + ": " + daftarAtlet[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    } 
}
