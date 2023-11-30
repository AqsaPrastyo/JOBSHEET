package src.P13;
import java.util.Scanner;
public class NilaiTugas {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas]; 
        inputNilaiMahasiswa(nilaiTugas);   
        tampilkanNilaiMahasiswa(nilaiTugas); 
        int hariTertinggi = cariHariTertinggi(nilaiTugas); 
        System.out.println("Nilai tertinggi pada hari ke-" + hariTertinggi);

        tampilkanMahasiswaTertinggi(nilaiTugas); 
    }

    
    public static void inputNilaiMahasiswa(int[][] nilaiTugas) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("Masukkan nilai tugas untuk Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }
    }

    
    public static void tampilkanNilaiMahasiswa(int[][] nilaiTugas) {
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu " + (j + 1) + " = " + nilaiTugas[i][j] + ", ");
            }
            System.out.println();
        }
    }

    
    public static int cariHariTertinggi(int[][] nilaiTugas) {
        int hariTertinggi = 1;
        int nilaiTertinggi = nilaiTugas[0][0];

        for (int j = 1; j < nilaiTugas[0].length; j++) {
            int nilaiMingguIni = 0;
            for (int i = 0; i < nilaiTugas.length; i++) {
                nilaiMingguIni += nilaiTugas[i][j];
            }

            if (nilaiMingguIni > nilaiTertinggi) {
                nilaiTertinggi = nilaiMingguIni;
                hariTertinggi = j + 1;
            }
        }

        return hariTertinggi;
    }

   
    public static void tampilkanMahasiswaTertinggi(int[][] nilaiTugas) {
        int nilaiTertinggi = 0;
        int mahasiswaTertinggi = 0;

        for (int i = 0; i < nilaiTugas.length; i++) {
            int nilaiTotal = 0;
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                nilaiTotal += nilaiTugas[i][j];
            }

            if (nilaiTotal > nilaiTertinggi) {
                nilaiTertinggi = nilaiTotal;
                mahasiswaTertinggi = i + 1;
            }
        }

        System.out.println("Mahasiswa " + mahasiswaTertinggi + " memiliki nilai tertinggi yaitu " + nilaiTertinggi);

        
        System.out.print("Keterangan nilai dari minggu ke-");
        for (int j = 0; j < nilaiTugas[mahasiswaTertinggi - 1].length; j++) {
            System.out.print((j + 1) + ": " + nilaiTugas[mahasiswaTertinggi - 1][j] + ", ");
        }
    }
}


