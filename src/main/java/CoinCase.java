import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class CoinCase implements Arraylist {    ///// Switch Case For Coin Class

    public static void getCoinChoice(String choice) {

        Coin coin = null;

        String coinChoice = choice;

            switch (coinChoice) {

                case "1":

try {
    coin = CoinFactory.getCoinInstance(Coins.USD);
    System.out.println("Please Enter An Amount Of USD To Convert To ILS");
    double userAmount = ScanInput.AmountChoice();    /// Get The User Amount With Scanner
    double usdOutcome = new USD().calculate(userAmount);   ///Calculate The User Amount
    System.out.println("Your Money Is:" + " " + usdOutcome);  ///Say How Much Money The User Have After Calculate
    String usdString = String.valueOf(usdOutcome);   ///Change User Amount From Double To String
    Arraylist.actionList.add("You Convert Now:" + " " + userAmount+" " +"USD" + " " +"To:" + usdString+" " +"ILS" + "\n" );   /////Enter All User Actions To ArrayList
    System.out.println("Start Over Y/N?");
    String startOver = ScanInput.stopSystem();   /// Get Answer From User Is Starting Again


    while (!startOver.equals("Y") && !startOver.equals("N") && !startOver.equals("y") && !startOver.equals("n")) {   ////If User Is Enter Wrong Letter
        System.out.println("Invalid Choice Please Try Again");
        System.out.println("=============================");
        System.out.println("Start Over Y/N?");
        startOver = ScanInput.stopSystem();
    }
    if (startOver.equals("N") | startOver.equals("n")) {   ///If The User Want To Finish
        System.out.println("Thanks For Using Our Currency Converter");
        System.out.println("Your All Action's Was:"+ "  " + actionList);   ///Showing Arraylist On Screen

    } else if (startOver.equals("Y") | startOver.equals("y")) {   ///If User Want To Proceed
        new Welcome().setCoinChoice();   ///Show Welcome Message
        choice = ScanInput.userCoinChoice();  ///Get Coin Choice From User By Scanner


        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {  ////If User Enter Wrong Coin Choice
            new Welcome().wrongChoice();
            choice = ScanInput.userCoinChoice();
        }
        new CoinCase().getCoinChoice(choice);   ///Stating All The Switch Case Coins From Start
    }
}catch (InputMismatchException e){   ////If User Enter For Amount Somthing That Is Not A Double
    System.out.println("Not A Good Choice Please Try Again :)" );
    new Welcome().setCoinChoice();   /// Welcome Message
    choice = ScanInput.userCoinChoice(); ///Get Coin Choice From User
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) { /// If User Enter Wrong Choice
        new Welcome().wrongChoice();
        choice = ScanInput.userCoinChoice(); ///Get Coin Choice From User
    }
    new CoinCase().getCoinChoice(choice);   ///Stating All The Switch Case Coins From Start
}

                    break;
                case "2":    /// EveryThing Is Same Like Case 1
                    try{
                    coin = CoinFactory.getCoinInstance(Coins.ILS);
                    System.out.println("Please Enter An Amount Of ILS To Convert To USD");
                   double userAmount = ScanInput.AmountChoice();
                    double ilsOutcome = new ILS().calculate(userAmount);
                    System.out.println("Your Money Is:" + " " + ilsOutcome);
                    String ilsString = String.valueOf(ilsOutcome);
                    Arraylist.actionList.add("You Convert Now:" + " " + userAmount+" " +"ILS" + " " +"To:" + ilsString+" " +"USD" + "\n" );
                    System.out.println("Start Over Y/N?");
                  String  startOver = ScanInput.stopSystem();


                    while (!startOver.equals("Y") && !startOver.equals("N") && !startOver.equals("y") && !startOver.equals("n")) {
                        System.out.println("Invalid Choice Please Try Again");
                        System.out.println("=============================");
                        System.out.println("Start Over Y/N?");
                        startOver = ScanInput.stopSystem();
                    }
                    if (startOver.equals("N") | startOver.equals("n")) {
                        System.out.println("Thanks For Using Our Currency Converter");
                        System.out.println("Your All Action's Was:"+ "  " + actionList );


                    } else if (startOver.equals("Y") | startOver.equals("y")) {
                        new Welcome().setCoinChoice();
                        choice = ScanInput.userCoinChoice();


                        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                            new Welcome().wrongChoice();
                            choice = ScanInput.userCoinChoice();
                        }
                        new CoinCase().getCoinChoice(choice);
                    }
                    }catch (InputMismatchException e) {
                        System.out.println("Not A Good Choice Please Try Again :)");
                        new Welcome().setCoinChoice();
                        choice = ScanInput.userCoinChoice();
                        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                            new Welcome().wrongChoice();
                            choice = ScanInput.userCoinChoice();
                        }
                        new CoinCase().getCoinChoice(choice);
                    }
                    break;

                case "3":
                    try {
                        coin = CoinFactory.getCoinInstance(Coins.EUR);
                        System.out.println("Please Enter An Amount Of ILS To Convert To EUR");
                        double userAmount = ScanInput.AmountChoice();
                        double eurOutCome = new EUR().calculate(userAmount);
                        System.out.println("Your Money Is:" + " " + eurOutCome);
                        String eurString = String.valueOf(eurOutCome);
                        Arraylist.actionList.add("You Convert Now:" + " " + userAmount+" " +"ILS" + " " +"To:" + eurString+" " +"EUR" + "\n" );
                        System.out.println("Start Over Y/N?");
                        String startOver = ScanInput.stopSystem();


                        while (!startOver.equals("Y") && !startOver.equals("N") && !startOver.equals("y") && !startOver.equals("n")) {
                            System.out.println("Invalid Choice Please Try Again");
                            System.out.println("=============================");
                            System.out.println("Start Over Y/N?");
                            startOver = ScanInput.stopSystem();
                        }
                        if (startOver.equals("N") | startOver.equals("n")) {
                            System.out.println("Thanks For Using Our Currency Converter");
                            System.out.println("Your All Action's Was:"+ "   " + actionList);

                        } else if (startOver.equals("Y") | startOver.equals("y")) {
                            new Welcome().setCoinChoice();
                            choice = ScanInput.userCoinChoice();


                            while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                                new Welcome().wrongChoice();
                                choice = ScanInput.userCoinChoice();
                            }
                            new CoinCase().getCoinChoice(choice);
                        }
                    }catch (InputMismatchException e) {
                        System.out.println("Not A Good Choice Please Try Again :)");
                        new Welcome().setCoinChoice();
                        choice = ScanInput.userCoinChoice();
                        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                            new Welcome().wrongChoice();
                            choice = ScanInput.userCoinChoice();
                        }
                        new CoinCase().getCoinChoice(choice);
                    }
                    break;


        }
    }
    @Override
    public void Array() {


    }
}
