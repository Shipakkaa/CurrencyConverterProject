public class Welcome {


String choice = null;

  public void setWelcome(){
      System.out.println("Welcome To Currency Converter" + "\n" + "=============================");

  }
    public void setCoinChoice() {
        System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars" + "\n" + "3.Shekels To Euro");

    }
    public void wrongChoice(){
    System.out.println("Invalid Choice Please Try Again");
    System.out.println("=============================");
    System.out.println("Please Choose An Option" + "\n" + "1.Dollars To Shekels" + "\n" + "2.Shekels To Dollars" + "\n" + "3.Shekels To Euro");

}
}
