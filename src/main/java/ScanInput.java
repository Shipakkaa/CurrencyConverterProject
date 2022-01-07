import java.util.ArrayList;
import java.util.Scanner;

public class ScanInput {
   public static String userCoinChoice(){
       Scanner coinChoice = new Scanner(System.in);
       return coinChoice.next();
   }
   public static double AmountChoice(){
       Scanner AmountChoice = new Scanner(System.in);
       return AmountChoice.nextDouble();
   }
   public static String stopSystem(){
       Scanner startAgain = new Scanner(System.in);
       return startAgain.next();

   }
   public static String wrong(String w){
       Scanner wrongChoice = new Scanner(System.in);
       return wrongChoice.next();
   }
}
