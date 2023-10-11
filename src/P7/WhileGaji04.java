package src.P7;

import java.util.Scanner;

public class WhileGaji04 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    
double jmlKaryawan, jmlJamLembur, gajiLembur, totalGajiLembur;
String jabatan;

gajiLembur = 0;
totalGajiLembur =0;

System.out.print("Masukan jumlah karyawan: ");
jmlKaryawan = input04.nextDouble();

int i = 0;

while (i < jmlKaryawan) {

System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
jabatan = input04.next();
System.out.print("Masukkan jumlah jam lembur: ");
jmlJamLembur = input04.nextDouble();
i++;

if (jabatan.equalsIgnoreCase("direktur")) { 
  continue;
} else if (jabatan.equalsIgnoreCase("manajer")) {
gajiLembur = jmlJamLembur * 100000;
} else if (jabatan.equalsIgnoreCase("karyawan")) { 
  gajiLembur = jmlJamLembur * 75000; }
totalGajiLembur += gajiLembur;
}
System.out.println("Total gaji lembur: " + totalGajiLembur);





input04.close();
  }
}
