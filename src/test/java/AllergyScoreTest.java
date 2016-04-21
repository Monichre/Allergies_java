import java.util.HashMap;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Set;
import java.util.*;

public class AllergyScoreTest {


@Test
public void AllergyScore_returnsArray() {
   AllergyScore testAllergy = new AllergyScore();
   ArrayList<String> testArray = testAllergy.allergyItems(3);

   assertEquals(true, testArray instanceof ArrayList);
 }


 @Test
 public void AllergyScore_returnsASingleAllergy() {
    // AllergyScore testAllergy = new AllergyScore();
    ArrayList<String> testAllergyArray = new ArrayList<String>();
    Integer[] testSet = {16, 32, 64, 128, 1, 2, 4, 8};


    assertEquals(testSet, AllergyScore.allergySet(300));
  }

}
