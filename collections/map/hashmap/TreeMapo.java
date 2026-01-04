package collections.map.hashmap;
import java.util.Map;
import java.util.TreeMap;

//A TreeMap stores items in key/value pairs in a sorted order based on the keys. so it does care about the sorting of the keys

public class TreeMapo {

  public static void main(String[] args) {
  
    Map<String, String> treeMap = new TreeMap<>();

    //to add elemetns to the TreeMap we use the method put()
    
    treeMap.put("carOne", "Mercedes");
    treeMap.put("carTwo", "BMW");
    treeMap.put("carThree", "Dacia");
    treeMap.put("carFour", "Audi");
    treeMap.put("carFour", "Audi"); //this will not be added because the key "carThree" already exists, so the value will be updated to "Audi"

    //to get an elemement from the treeMap collection we use the method get(), with the name of the key not the index
    System.out.println(treeMap.get("carThree"));

    //to remove an element from the treeMap, we use the remove method with the name of the key
    treeMap.remove("cartwo");

    

    System.out.println(treeMap);

  }
  
}
