package src.P3;

/**
 * Bank04
 */
import java.util.Scanner;
public class Bank04 {

  public static void main(String[] args) {
    
    Scanner  bk = new Scanner(System.in);

    int jm_tabungan_awal, lama_menabung;
    double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

    System.out.print("Masukan jumlah tabungan awal anda (Rp.): ");
    jm_tabungan_awal = bk.nextInt();
    System.out.print("Masukkan lama menabung anda: ");
    lama_menabung = bk.nextInt();

    bunga = lama_menabung*prosentase_bunga*jm_tabungan_awal;

    jml_tabungan_akhir = bunga+jm_tabungan_awal;
    System.out.println("Bunga adalah " +bunga);
    System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

    //Bank04 Done


  }
}