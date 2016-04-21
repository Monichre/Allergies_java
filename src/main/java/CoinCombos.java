import java.util.HashMap;
import java.util.ArrayList;


public class CoinCombos {

  public static String changeConverter(Integer num){
    HashMap<String, Integer> wallet = new HashMap<String, Integer>();


    Integer numberOfQuarters = 0;
    Integer numberOfDimes = 0;
    Integer numberOfNickels = 0;
    Integer numberOfPennies = 0;

    while(num > 0){
      if(num >= 25){
        Integer quarterOutput = num/25;
        numberOfQuarters += quarterOutput;
        num = num - (quarterOutput * 25);

      }
      if(num >= 10){
        Integer dimeOutput = num/10;
        numberOfDimes += dimeOutput;
        num = num - (dimeOutput * 10);

      }
      if(num >= 5){
        Integer nickelOutput = num/5;
        numberOfNickels += nickelOutput;
        num = num - (nickelOutput * 5);

      }
      if(num >= 1){
        Integer pennyOutput = num/1;
        numberOfPennies += pennyOutput;
        num = num - (pennyOutput * 1);

      }
    }
    wallet.put("quarters", numberOfQuarters);
    wallet.put("dimes", numberOfDimes);
    wallet.put("nickels", numberOfNickels);
    wallet.put("pennies", numberOfPennies);

    String amount = String.format("Quarters: %s Dimes: %s Nickels: %s Pennies: %s", numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies);




    return amount;

  }

}
