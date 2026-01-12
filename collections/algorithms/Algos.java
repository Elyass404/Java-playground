package collections.algorithms;

import java.util.*;

public class Algos {
  

  public static void main(String[] args) {
    
    //To use the java provided algorithms for collections, we should first make a certain collection to play with 
    List<String> cars = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();

    //add elements to the cars list
    cars.add("Ford");
    cars.add("Mercedes");
    cars.add("BMW");
    cars.add("Dacia the lengend");
    cars.add("Maseratti");

    //add elements to the numbers list 
    numbers.add(25);
    numbers.add(85);
    numbers.add(125);
    numbers.add(12);
    numbers.add(1);

    //to search in certain collection, we can use the Collection.binarySearch().NOTE: the collection should be sorted first using sort() method

    Collections.sort(cars); //sorted first
    
    //now lets search for Mercedes and print it
    String myCar = cars.get(Collections.binarySearch(cars, "Mercedes")); // here the binary search get the index of the element we are looking for that is why i used it inside the get method
    System.out.println("my dream car is: "+ myCar);

    //now and as we saw before, to sort a collection, we can use sort() method, this time we will use it with the numbers list
    Collections.sort(numbers);
    System.out.println(numbers); //will be sorted from min to max (even with string , from A to Z)

    //NOTE: we can also reverse the sorting by using the Collections.reverseOrder() inside the sort() method
    Collections.sort(cars, Collections.reverseOrder());
    System.out.println(cars); //[Mercedes, Maseratti, Ford, Dacia the lengend, BMW]
    




  }
}
