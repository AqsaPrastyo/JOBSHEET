package src.P13;

import java.util.Scanner;

public class Percobaan604 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    int p,l,t,L,vol;
    System.out.print("Masukan Panjang: ");
    p = input04.nextInt();
    System.out.print("Masukan Lebar: ");
    l = input04.nextInt();
    System.out.print("Masukan Tinggi: ");
    t = input04.nextInt();

    L =hitungLuas(p, l);
    System.out.println("Luas Persegi panjang adalah: " +L);

    vol = p*l*t;
    System.out.println("Volume balok adalah: " +vol);




  }
static int hitungLuas (int pjg, int lb){
int Luas= pjg*lb;
return Luas;
}
static int hitungVolume (int tinggi, int a, int b){
int Volume = hitungLuas(a, b) * tinggi;
return Volume;
}






}
