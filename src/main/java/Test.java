import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
        public static void main(String[] args) {


            System.out.println("Welcome To Currency Converter" + "\n" + "=============================");
            System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
            Scanner input = new Scanner(System.in);
            String choice = input.next();     /// Add Exception
            while (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Invalid Choice Please Try Again");
                System.out.println("=============================");
                System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
                choice = input.next();
            }

            switch (choice) {
                case "1":
                    try {


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
                            System.out.println("Your All Action's Was:" + usdOutcomeList);

                            FileWriter writer = new FileWriter("Convert Money.txt");
                            writer.write(usdOutcomeList + System.lineSeparator());
                            writer.close();


                            break;
                        }

                        while (!usdInput.equals("Y") && !usdInput.equals("N") && !usdInput.equals("y") && !usdInput.equals("n")) {
                            System.out.println("Invalid Choice Please Try Again");
                            System.out.println("=============================");
                            System.out.println("Start Over Y/N?");
                            usdInput = input.next();
                            if (usdInput.equals("N") | usdInput.equals("n")) {
                                System.out.println("Thanks For Using Our Currency Converter");
                                System.out.println("Your All Action's Was:" + usdOutcomeList);
                                FileWriter writer = new FileWriter("Convert Money.txt");
                                writer.write(usdOutcomeList + System.lineSeparator());
                                writer.close();
                                break;

                            }
                        }


                        if (usdInput.equals("Y") | usdInput.equals("y")) {
                            System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
                            choice = input.next();     /// Add Exception
                            while (!choice.equals("1") && !choice.equals("2")) {
                                System.out.println("Invalid Choice Please Try Again");
                                System.out.println("=============================");
                                System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
                                choice = input.next();
                            }
                        }
                                if (choice.equals("1")) {
                                    System.out.println("=============================");
                                    System.out.println("Please Enter An Amount Of USD To Convert");
                                    usdAmount = input.nextDouble();
                                    usdOutcome = new USD().calculate(usdAmount);
                                    System.out.println(usdOutcome);
                                    usdOutcomeList.add(usdOutcome);
                                    System.out.println("Start Over Y/N?");
                                    usdInput = input.next();
                                    choice = "6";

                                }


while (usdInput.equals("y") | usdInput.equals("Y")) {
    System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
    choice = input.next();     /// Add Exception
    while (!choice.equals("1") && !choice.equals("2")) {
        System.out.println("Invalid Choice Please Try Again");
        System.out.println("=============================");
        System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars");
        choice = input.next();
    }
    System.out.println("=============================");
    System.out.println("Please Enter An Amount Of USD To Convert");
    usdAmount = input.nextDouble();
    usdOutcome = new USD().calculate(usdAmount);
    System.out.println(usdOutcome);
    usdOutcomeList.add(usdOutcome);
    System.out.println("Start Over Y/N?");
    usdInput = input.next();

}
                        if (choice.equals("1")) {
                            System.out.println("=============================");
                            System.out.println("Please Enter An Amount Of USD To Convert");
                            usdAmount = input.nextDouble();
                            usdOutcome = new USD().calculate(usdAmount);
                            System.out.println(usdOutcome);
                            usdOutcomeList.add(usdOutcome);
                            System.out.println("Start Over Y/N?");
                            usdInput = input.next();

                        }

                            if (usdInput.equals("N") | usdInput.equals("n")) {
                                System.out.println("Thanks For Using Our Currency Converter");
                                System.out.println("Your All Action's Was:" + usdOutcomeList);
                                FileWriter writer = new FileWriter("Convert Money.txt");
                                writer.write(usdOutcomeList + System.lineSeparator());
                                writer.close();
                                break;
                            }

                            while (!usdInput.equals("Y") && !usdInput.equals("N") && !usdInput.equals("y") && !usdInput.equals("n")) {
                                System.out.println("Invalid Choice Please Try Again");
                                System.out.println("=============================");
                                System.out.println("Start Over Y/N?");
                                usdInput = input.next();
                                if (usdInput.equals("N") | usdInput.equals("n")) {
                                    System.out.println("Thanks For Using Our Currency Converter");
                                    System.out.println("Your All Action's Was:" + usdOutcomeList);

                                    FileWriter writer = new FileWriter("Convert Money.txt");
                                    writer.write(usdOutcomeList + System.lineSeparator());
                                    writer.close();
                                    break;
                                }

                            }


                    }catch (InputMismatchException | IOException e) {
                        System.out.println("Wrong Choice Please Start Again");
                    }

                    break;
//                ===============================================================================
                case "2":
                    try {
                        System.out.println("Please Enter An Amount Of ILS To Convert");
                        double ilsAmount = input.nextDouble();
                        double ilsOutcome = new ILS().calculate(ilsAmount);
                        System.out.println(ilsOutcome);
                        ArrayList<Double> ilsOutcomeList = new ArrayList<>();
                        ilsOutcomeList.add(ilsOutcome);
                        System.out.println("Start Over Y/N?");
                        String ilsInput = input.next();

                        if (ilsInput.equals("N") | ilsInput.equals("n")){
                            System.out.println("Thanks For Using Our Currency Converter");
                            System.out.println("Your All Action's Was:" + ilsOutcomeList );
                            FileWriter writer = new FileWriter("Convert Money.txt");
                            writer.write(ilsOutcomeList + System.lineSeparator());
                            writer.close();
                            break;
                        }



                        while (!ilsInput.equals("Y") && !ilsInput.equals("N")&& !ilsInput.equals("y") && !ilsInput.equals("n") ) {
                            System.out.println("Invalid Choice Please Try Again");
                            System.out.println("=============================");
                            System.out.println("Start Over Y/N?");
                            ilsInput = input.next();
                            if (ilsInput.equals("N") | ilsInput.equals("n")) {
                                System.out.println("Thanks For Using Our Currency Converter");
                                System.out.println("Your All Action's Was:" + ilsOutcomeList );
                                FileWriter writer = new FileWriter("Convert Money.txt");
                                writer.write(ilsOutcomeList + System.lineSeparator());
                                writer.close();
                                break;
                            }
                        }


                        while (ilsInput.equals("Y") | ilsInput.equals("y")) {
                            System.out.println("=============================");
                            System.out.println("Please Enter An Amount Of ILS To Convert");
                            ilsAmount = input.nextDouble();
                            ilsOutcome = new ILS().calculate(ilsAmount);
                            System.out.println(ilsOutcome);
                            ilsOutcomeList.add(ilsOutcome);

                            System.out.println("Start Over Y/N?");
                            ilsInput = input.next();


                            if (ilsInput.equals("N") | ilsInput.equals("n")) {
                                System.out.println("Thanks For Using Our Currency Converter");
                                System.out.println("Your All Action's Was:" + ilsOutcomeList );
                                FileWriter writer = new FileWriter("Convert Money.txt");
                                writer.write(ilsOutcomeList + System.lineSeparator());
                                writer.close();
                                break;
                            }
                            while (!ilsInput.equals("Y") && !ilsInput.equals("N")&& !ilsInput.equals("y") && !ilsInput.equals("n") ) {
                                System.out.println("Invalid Choice Please Try Again");
                                System.out.println("=============================");
                                System.out.println("Start Over Y/N?");
                                ilsInput = input.next();
                                if (ilsInput.equals("N") | ilsInput.equals("n")) {
                                    System.out.println("Thanks For Using Our Currency Converter");
                                    System.out.println("Your All Action's Was:" + ilsOutcomeList );
                                    FileWriter writer = new FileWriter("Convert Money.txt");
                                    writer.write(ilsOutcomeList + System.lineSeparator());
                                    writer.close();
                                    break;
                                }
                            }

                        }
                    }catch (InputMismatchException | IOException e){
                        System.out.println("Wrong Choice Please Start Again");
                    }
            }

        }
    }

