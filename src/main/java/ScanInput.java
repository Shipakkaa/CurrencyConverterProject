import java.util.ArrayList;
import java.util.Scanner;

public class ScanInput {
   public static String userCoinChoice(){     ////Scanner - User Coin Choice
       Scanner coinChoice = new Scanner(System.in);
       return coinChoice.next();
   }
   public static double AmountChoice(){   ////Scanner - User Amount Of Money Enter
       Scanner AmountChoice = new Scanner(System.in);
       return AmountChoice.nextDouble();
   }
   public static String stopSystem(){ ///Scanner - User Answer For Starting Over
       Scanner startAgain = new Scanner(System.in);
       return startAgain.next();

   }

}
