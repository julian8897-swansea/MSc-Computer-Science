import java.util.Scanner;

class TimeToDouble {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
         
          final double TARGET = 1000.0;
         
          System.out.print("Enter amount: ");
         
          double initialAmount = in.nextInt();
          final double INTEREST_RATE = 0.05;
          int i = 0;
 
          double currentAmount = initialAmount;
          while (currentAmount < TARGET) {
               currentAmount += currentAmount * 0.05;
               i++;
          }
 
          System.out.println("It takes " + i +
               " years at " +
               INTEREST_RATE*100 +
              "% interest to grow " +
               initialAmount + " to " + TARGET);
    }
}