package src.P7;

import java.util.Scanner;

public class DoWhileCuti04 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

    int jatahCuti, jmlHari;
    String konfirmasi;

    System.out.print("Jatah Cuti: ");
jatahCuti = input04.nextInt();

do {
  System.out.print("Apakah anda ingi megambil cuti (y/n)? ");
  konfirmasi = input04.next();
if (konfirmasi.equalsIgnoreCase("y")) {
  System.out.print("Jumlah hari: ");
  jmlHari = input04.nextInt();

  if (jmlHari <= jatahCuti) {
      jatahCuti -= jmlHari;
      System.out.println("Sisa jatah cuti: " + jatahCuti);
  } else {
    System.out.println("Sisa jatah cuti anda tidak mencukupi");
  
    }

  }else {
    break;
  }


} while (jatahCuti > 0);



  }
}
