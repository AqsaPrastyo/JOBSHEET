package src.P7;
import java.util.Scanner;

public class ForKelipatan04 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

int  counter = 0;
int total = 0;

System.out.print("Masukan kelipatan (1-9) : ");
int kelipatan = input04.nextInt();



for(int i = 1; i <= 50; i++) {
  if (i % kelipatan == 0) {
    total += i;
    counter++;
  }
  
}
double rata2 = total / counter;

System.out.printf("Banyaknya bilangan %d dari 1sampai 50 adalah %d\n", kelipatan, counter);
System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
System.out.printf("Rata -rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata2);





    
  }
}
