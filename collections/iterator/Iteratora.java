//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
// It is called an "iterator" because "iterating" is the technical term for looping.
// To use an Iterator, you must import it from the java.util package.
package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Iteratora {

  public static void main(String[] args) {
    

    List<String> drinks = new ArrayList<>();

    drinks.add("juice");
    drinks.add("atay");
    drinks.add("coffee");
    drinks.add("soda");

    //this how we create the iterator, the type is depending on the list elements type
    Iterator<String> it = drinks.iterator();

    //to print the first element of the list collection
    System.out.println(it.next());

    while (it.hasNext()) {
      System.out.println("still have element"); // infinite loop be aware
    }

  }
}