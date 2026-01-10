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
    
    //to know the size of a linked hash map  we use the size() method
    System.out.println(carTypes.size());

    //to loop through the linked hashmap, we can use the foreach loop 
    for(String type : carTypes.keySet()){
      System.out.println(carTypes.get(type));
    }

    //to loop through the linkedhashmap but to show both the keys and values 

    for(String type: carTypes.keySet()){
      System.out.println("key: "+ type + "value: "+ carTypes.get(type));
      
    }



  }
  
}
