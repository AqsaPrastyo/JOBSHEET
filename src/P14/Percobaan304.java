package src.P14;

import java.util.Scanner;

public class Percobaan304 {
 
 static double hitungLaba (double saldo, int tahun){
if (tahun == 0) {
  return (saldo);
}else{
  return (1.11 * hitungLaba(saldo, tahun - 1));
}
 }
 public static void main(String[] args) {
  Scanner sc04 = new Scanner(System.in);
System.out.println("Jumlah saldo awal: ");
double saldoAwal = sc04.nextDouble();
System.out.println("Lama investasi (tahun) : ");
int tahun = sc04.nextInt();

System.out.println("Jumlah saldo setelah " + tahun + " tahun : ");
System.out.println(hitungLaba(saldoAwal, tahun));
 }
 
}
