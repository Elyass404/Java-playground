package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

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
    
    //we can use another way to declare a HashMap
    //Map<String, String> theMapOne = new HashMap<>(); //uncomment this line to see the effect


    HashMap<String, String> theMap = new HashMap<String, String>();


      //we put element to the map by the method put()
      theMap.put("fruitOne", "Apple");
      theMap.put("fruitTwo", "Banana");
      theMap.put("fruitThree", "Cherry");

      //if we want to get elements from the map, we use the method get(), here we call the key not the index like List & Set
      System.out.println(theMap.get("fruiteTwo")); //Banana

      //to remove an element from the map, we use the method remove(), and here also we use the keys not the indexes
      theMap.remove("fruitOne"); //the value "Apple" will be removed

      //to remove all the elements from the map at once, we use the method clear()
      //theMap.clear(); //uncomnment this line to see the effect

      //in order to know the size of the map, we use the method size()
      Integer size = theMap.size();
      System.out.println(size); 

      //to loop through the map, we can use the for each loop 
    int counter = 0;
    for(String key: theMap.keySet()) {
    
      System.out.println("key number" + counter + ":" + key + ", value: " + theMap.get(key));
      counter ++;
    }




      System.out.println(theMap);
  
    }
}
