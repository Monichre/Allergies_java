import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.*;


public class AllergyScore {

  static HashMap<Integer, String> allergenMap = new HashMap<Integer, String>();
//
// // ********************** ALLERGY ITEMS HASHMAP CREATION****************//
  // public static ArrayList<String> allergyItems(Integer num){
  //   allergenMap.put(1, "eggs");
  //   allergenMap.put(2, "peanuts");
  //   allergenMap.put(4, "shellfish");
  //   allergenMap.put(8, "strawberries");
  //   allergenMap.put(16, "tomatoes");
  //   allergenMap.put(32, "chocolate");
  //   allergenMap.put(64, "pollen");
  //   allergenMap.put(128, "cats");
  //
  //   ArrayList<String> allergyArray = new ArrayList<String>();
  //   for(Integer key : allergenMap.keySet()){
  //     if(key == num){
  //       allergyArray.add(allergenMap.get(key));
  //     }
  //   }
  //   return allergyArray;
  // }
// ********************** ALLERGY ITEMS KEYSET CREATION****************//
  public static String allergySet(Integer num){

    // HashMap<Integer, String> allergenMap = new HashMap<Integer, String>();
    allergenMap.put(1, "eggs");
    allergenMap.put(2, "peanuts");
    allergenMap.put(4, "shellfish");
    allergenMap.put(8, "strawberries");
    allergenMap.put(16, "tomatoes");
    allergenMap.put(32, "chocolate");
    allergenMap.put(64, "pollen");
    allergenMap.put(128, "cats");

    Set<Integer> allergyKeys = allergenMap.keySet();
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    for(Integer key : allergyKeys){
      intArray.add(key);
    }
    Integer[] outArray = intArray.toArray(new Integer[intArray.size()]);
    Arrays.sort(outArray, Collections.reverseOrder());


     ArrayList<String> allergy = new ArrayList<String>();

     for(Integer i = 0; i < outArray.length; i++){
       if(i == 0 && num >= outArray[i]){
         allergy.add(allergenMap.get(outArray[i]));
         num = num - outArray[i];
         i--;
       }
       else if (num >= outArray[i] && num < outArray[i-1]){
         allergy.add(allergenMap.get(outArray[i]));
         num = num - outArray[i];
       }//end of if
     }//end of for

     System.out.println(allergy);
     return allergy.toString();
  }



}
