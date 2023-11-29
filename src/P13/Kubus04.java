package src.P13;

public class Kubus04 {
  
public static void main(String[] args) {
  int p = 5, l = 5, t = 5;
  
  System.out.println(hitungLuas(p, l));
  System.out.println(hitungVolume(p, l, t));
    System.out.println(hitungLuasPermukaan(p, l));
}



  
  public static int hitungLuas(int p, int l){
    int luas = p*l;
    return luas;
    
  }
  public static int hitungVolume(int p, int l, int t){
    int vol = t * hitungLuas(p, l);
    return vol;
  }
  public static int hitungLuasPermukaan(int p, int l){
    int LuasPermukaan = 6 * hitungLuas(p, l);
    return LuasPermukaan ;
  }
}
