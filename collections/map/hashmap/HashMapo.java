package collections.map.hashmap;

import java.util.HashMap;

//A HashMap stores items in key/value pairs, where each key maps to a specific value.
/*


It is part of the java.util package and implements the Map interface.

Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.

A HashMap can store many different combinations, such as:

String keys and Integer values
String keys and String values

*/

public class HashMapo {


  public static void main(String[] args) {
    
    HashMap<String, String> theMap = new HashMap<String, String>();

      theMap.put("fruitOne", "Apple");
      theMap.put("fruitTwo", "Banana");
      theMap.put("fruitThree", "Cherry");

      System.out.println(theMap);
  
    }
}
