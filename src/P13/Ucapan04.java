package src.P13;

import java.util.Scanner;

public class Ucapan04 {
  public static String PenerimaUcapan (){
Scanner sc04 = new Scanner(System.in);
System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan:");
String namaOrang =sc04.nextLine();
sc04.close();
return namaOrang;
  }
public static void main(String[] args) {
  String nama = PenerimaUcapan();
  System.out.println("Thank you " + nama +"\nMay the force be with you." );
}

}
