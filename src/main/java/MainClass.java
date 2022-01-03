import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Currency Converter" + "\n" + "=============================");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
        String answerInput = input.next();     /// Add Exception
        while (!answerInput.equals("1") && !answerInput.equals("2")) {
            System.out.println("Invalid Choice Please Try Again");
            System.out.println("=============================");
            System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
            answerInput = input.next();
        }


        switch (answerInput) {
            case "1":


                System.out.println("Please Enter An Amount Of USD To Convert");
                double usdAmount = input.nextDouble();
                double usdOutcome = new USD().calculate(usdAmount);
                System.out.println(usdOutcome);
                ArrayList<Double> usdOutcomeList = new ArrayList<>();
                usdOutcomeList.add(usdOutcome);
                System.out.println("Start Over Y/N?");
                String usdInput = input.next();

                if (usdInput.equals("N") | usdInput.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    break;
                }

                while (!usdInput.equals("Y") && !usdInput.equals("N") && !usdInput.equals("y") && !usdInput.equals("n")) {
                    System.out.println("Invalid Choice Please Try Again");
                    System.out.println("=============================");
                    System.out.println("Start Over Y/N?");
                    usdInput = input.next();
                    if (usdInput.equals("N") | usdInput.equals("n")) {
                        System.out.println("Thanks For Using Our Currency Converter");
                        break;

                    }
                }


                while (usdInput.equals("Y") | usdInput.equals("y")) {
                    System.out.println("=============================");
                    System.out.println("Please Enter An Amount Of USD To Convert");
                    usdAmount = input.nextDouble();
                    usdOutcome = new USD().calculate(usdAmount);
                    System.out.println(usdOutcome);
                    usdOutcomeList.add(usdOutcome);
                    System.out.println("Start Over Y/N?");
                    usdInput = input.next();

                    if (usdInput.equals("N") | usdInput.equals("n")) {
                        System.out.println("Thanks For Using Our Currency Converter");
                        break;
                    }

                    while (!usdInput.equals("Y") && !usdInput.equals("N") && !usdInput.equals("y") && !usdInput.equals("n")) {
                        System.out.println("Invalid Choice Please Try Again");
                        System.out.println("=============================");
                        System.out.println("Start Over Y/N?");
                        usdInput = input.next();
                        if (usdInput.equals("N") | usdInput.equals("n")) {
                            System.out.println("Thanks For Using Our Currency Converter");
                            break;
                        }

                    }

                }
                break;
//                ===============================================================================
            case "2":
                System.out.println("Please Enter An Amount To Convert");
                double ilsAmount = input.nextDouble();
                double ilsOutcome = new ILS().calculate(ilsAmount);
                System.out.println(ilsOutcome);
                ArrayList<Double> ilsOutcomeList = new ArrayList<>();
                ilsOutcomeList.add(ilsOutcome);
                System.out.println("Start Over Y/N?");
                String ilsInput = input.next();

                if (ilsInput.equals("N") | ilsInput.equals("n")){
                    System.out.println("Thanks For Using Our Currency Converter");
                }



            while (!ilsInput.equals("Y") && !ilsInput.equals("N")&& !ilsInput.equals("y") && !ilsInput.equals("n") ) {
                System.out.println("Invalid Choice Please Try Again");
                System.out.println("=============================");
                System.out.println("Start Over Y/N?");
                ilsInput = input.next();
                if (ilsInput.equals("N") | ilsInput.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    break;
                }
                }


                while (ilsInput.equals("Y") | ilsInput.equals("y")) {
                    System.out.println("=============================");
                    System.out.println("Please Enter An Amount Of USD To Convert");
                    ilsAmount = input.nextDouble();
                    ilsOutcome = new ILS().calculate(ilsAmount);
                    System.out.println(ilsOutcome);
                    ilsOutcomeList.add(ilsOutcome);

                    System.out.println("Start Over Y/N?");
                    ilsInput = input.next();


                    if (ilsInput.equals("N") | ilsInput.equals("n")) {
                        System.out.println("Thanks For Using Our Currency Converter");
                    }
                    while (!ilsInput.equals("Y") && !ilsInput.equals("N")&& !ilsInput.equals("y") && !ilsInput.equals("n") ) {
                        System.out.println("Invalid Choice Please Try Again");
                        System.out.println("=============================");
                        System.out.println("Start Over Y/N?");
                        ilsInput = input.next();
                        if (ilsInput.equals("N") | ilsInput.equals("n")) {
                            System.out.println("Thanks For Using Our Currency Converter");
                            break;
                        }
                    }

                }
            }
        }
    }
