package src.P13;

import java.util.Scanner;

public class UcapanTerimakasih04 {
  public static String PenerimaUcapan (){
Scanner sc04 = new Scanner(System.in);
System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan:");
String namaOrang =sc04.nextLine();
sc04.close();
return namaOrang;
  }
  public static void UcapanTerimakasih(){
    String nama = PenerimaUcapan();
    System.out.println("Thank you "+ nama + " for being the best teacher in the world. \n" + 
    "You inspired in me a love for learnng and made me feel like i  could ask anything.");

  }
  public static void main(String[] args) {
    UcapanTerimakasih();
  }
}
