import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CurrencyConverter {
    public static void main(String[] args) throws IOException {



        new Welcome().setWelcome(); // Welcome Message
        new Welcome().setCoinChoice(); //Coin Choice Select
        String choice = ScanInput.userCoinChoice(); //Call Scanner For Coin Choice


        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {   ///Input Error
            new Welcome().wrongChoice();
            choice = ScanInput.userCoinChoice();  //Enter Again Coin Choice
        }
        new CoinCase().getCoinChoice(choice);  // Coin Switch Case

        FileWriter writer = new FileWriter("Convert Money.txt");
        writer.write(Arraylist.actionList + System.lineSeparator());
        writer.close();

        Desktop desktop = Desktop.getDesktop();
        File file = new File("C:\\Users\\Omer Brosh\\IdeaProjects\\Currency Converter\\Convert Money.txt");
        if(file.exists())         //checks file exists or not
            desktop.open(file);
    }
}





