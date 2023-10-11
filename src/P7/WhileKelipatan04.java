package src.P7;

import java.util.Scanner;

public class WhileKelipatan04 {
  public static void main(String[] args) {
    Scanner inpput04 = new Scanner(System.in);

int counter = 0;
int total = 0; 

System.out.print("Masukan kelipatan (1-9) : ");
int kelipatan = inpput04.nextInt();

int i = 0;
while (i <= 50 ) {
  if (i % kelipatan == 0) {
    total += i;
    counter++;
  }
  i++;
}

System.out.printf("Banyaknya bilangan %d dari 1sampai 50 adalah %d\n", kelipatan, counter);
System.out.printf("Total bilangan kelipatan %d dari 1sampai 50 adalah %d\n", kelipatan, total);





    
  }
}
