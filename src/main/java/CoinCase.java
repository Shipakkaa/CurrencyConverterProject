public class CoinCase implements Arraylist {

    public static void getCoinChoice(String choice) {

        Coin coin = null;
        double result;
        String coinChoice = choice;

        switch (coinChoice) {
            case "1":
                coin = CoinFactory.getCoinInstance(Coins.USD);
                System.out.println("Please Enter An Amount Of USD To Convert");
                double userAmount = ScanInput.AmountChoice();
                double usdOutcome = new USD().calculate(userAmount);
                System.out.println("Your Money Is:" + " " + usdOutcome);
                String usdString = String.valueOf(usdOutcome);
                Arraylist.actionList.add("Your Dollar List Is:"+ usdString);
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
                    System.out.println("Your All Action's Was:" + actionList);

                }
                else if (startOver.equals("Y") | startOver.equals("y")){
                    new Welcome().setCoinChoice();
                     choice = ScanInput.userCoinChoice();


                    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                        new Welcome().wrongChoice();
                        choice = ScanInput.userCoinChoice();
                    }
                    new CoinCase().getCoinChoice(choice);
                }



break;
            case "2":
                coin = CoinFactory.getCoinInstance(Coins.ILS);
                System.out.println("Please Enter An Amount Of ILS To Convert");
                userAmount = ScanInput.AmountChoice();
                double ilsOutcome = new ILS().calculate(userAmount);
                System.out.println("Your Money Is:" + " " + ilsOutcome);
                String ilsString = String.valueOf(ilsOutcome);
                Arraylist.actionList.add("Your Shekels List Is:" + ilsString);
                System.out.println("Start Over Y/N?");
                startOver = ScanInput.stopSystem();



                while (!startOver.equals("Y") && !startOver.equals("N") && !startOver.equals("y") && !startOver.equals("n")) {
                    System.out.println("Invalid Choice Please Try Again");
                    System.out.println("=============================");
                    System.out.println("Start Over Y/N?");
                    startOver = ScanInput.stopSystem();
                }
                if (startOver.equals("N") | startOver.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    System.out.println("Your All Action's Was:" + actionList);

                }
                else if (startOver.equals("Y") | startOver.equals("y")){
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
                coin = CoinFactory.getCoinInstance(Coins.EUR);
                System.out.println("Please Enter An Amount Of ILS To Convert To EUR");
                userAmount = ScanInput.AmountChoice();
                double eurOutCome = new EUR().calculate(userAmount);
                System.out.println("Your Money Is:" + " " + eurOutCome);
                String eurString = String.valueOf(eurOutCome);
                Arraylist.actionList.add("Your Euro List Is:" + eurString);
                System.out.println("Start Over Y/N?");
                startOver = ScanInput.stopSystem();



                while (!startOver.equals("Y") && !startOver.equals("N") && !startOver.equals("y") && !startOver.equals("n")) {
                    System.out.println("Invalid Choice Please Try Again");
                    System.out.println("=============================");
                    System.out.println("Start Over Y/N?");
                    startOver = ScanInput.stopSystem();
                }
                if (startOver.equals("N") | startOver.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    System.out.println("Your All Action's Was:" + actionList);

                }
                else if (startOver.equals("Y") | startOver.equals("y")){
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
