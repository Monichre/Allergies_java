
import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombosTest {

  // @Test
  // public void CoinCombos_CheckIfReturnValueIsAnInteger_true() {
  //   CoinCombos coinCombosTest = new CoinCombos();
  //   Integer expected = coinCombosTest.changeConverter(3);
  //   assertEquals(true, expected instanceof Integer);
  // }

  @Test
  public void CoinCombos_ReturnValueModulo25_true() {
    CoinCombos coinCombosTest = new CoinCombos();
    String testString = "Quarters: 1 Dimes: 0 Nickels: 0 Pennies: 0";
    assertEquals(testString, coinCombosTest.changeConverter(25));
  }

  // @Test
  // public void CoinCombos_ReturnValueModulo25_true() {
  //   CoinCombos coinCombosTest = new CoinCombos();
  //   Integer testNum =0;
  //   assertEquals(testNum, coinCombosTest.changeConverter(25));
  // }

}
