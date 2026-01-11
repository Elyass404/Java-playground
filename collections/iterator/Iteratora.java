

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

    Iterator<String> it = drinks.iterator();

    System.out.println(it.next());

  }
}