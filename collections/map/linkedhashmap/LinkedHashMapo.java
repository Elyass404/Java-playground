package collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapo {

  public static void main(String[] args) {
    Map<String, String> carTypes = new LinkedHashMap<>();

    carTypes.put("carOne", "SUV");
    carTypes.put("carTwo", "Sedan");
    carTypes.put("carThree", "Coupe");


    //to get an element from the linked hashmap, we use the get(key) method
    System.out.println(carTypes.get("carOne"));


    //to remove an element from the linked hashmap, we use the remove() method, with the key as the parametre
    carTypes.remove("carThree");

    //to remove all elements at once, we use the method clear()
    //carTypes.clear(); // uncomment this line to see the effect



  }
  
}
