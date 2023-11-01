package UTSPrakDaspro;
import java.util.Scanner;
public class SoalBonus04 {
public static void main(String[] args) {
  Scanner herrry04 = new Scanner(System.in);

    int n = 53 * 2;
    if (n < 5) {
      n += 5;
    }
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        System.out.print("*");
      } else {
        System.out.print("#");
      }
    }
  }
}









