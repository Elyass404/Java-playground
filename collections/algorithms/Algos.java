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

    //looping through a list or collection can be done using the the foreach loop or the iterator interface we saw before
    //1. using the foreach 
    for(String c : cars){
      System.out.println(c);
    }

    //2. using the iterator interface 
    Iterator<String> itera = cars.iterator();
    while(itera.hasNext()){
      System.out.println(itera.next());
    }

    //to find the max or the min of a certain collection we can use Collections.min() and Collection.max
    int theMinOfNumbers = Collections.min(numbers);
    int theMaxOfNumbers = Collections.max(numbers);

    System.out.println("The minimum of numbers is : " + theMinOfNumbers + " And the max of the numbers: " + theMaxOfNumbers );

    //to shuffle the elements randomly inside the collection 
    Collections.shuffle(cars);
    System.out.println(cars);
    //now they will be shuffled in another way 
    Collections.shuffle(cars);
    System.out.println(cars);

    //to cound how many times did an element inside a collection has repeated, we use Collection.frequency()
    int timeOfMercedes = Collections.frequency(cars, "Mercedes");
    System.out.println(timeOfMercedes);

    
  }
}
