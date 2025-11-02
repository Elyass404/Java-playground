/*LinkedList: as we saw in the ArrayList, LinkedList also has the same methods as well like the ones in the array list , because both 
are under the interface of the List, but both work are built differently, you can search of the building differences between them both
if you want to get morre details. but here we will disscuss which one should we use and when */

/*When to use that and this: 
So, the as we said before, both are the same(kind of) and you can add,get, set,...etc  data using the same methods, but LinkedList has
additional method that can help us manipulate the data inside the collection, like get first and add first , or last etc , so it is more flexible 
when it comes to playing with the data inside the collection, we will see  the application of linked list below*/

/* The different additional method of the LinkedList: */
/* addFirst() */
/* addLast() */
/* removeFirst() */
/* removeLast() */
/* getFirst() */
/* getLast() */

import java.util.List;
import java.util.LinkedList;

public class LinkedListoo {

    public static void main(String [] args){
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        
        numbers.add(31); //By default this is the first element in the linked list, normal thing
        numbers.add(152);

        //To add an element to the first position after you already added elements in the list use addFirst
        numbers.addFirst(15);// now this is the element that will be the first one in the list

        //To add an element in to the last position in the list you use the method addLast()
        numbers.addLast(784);

        //To get the first element of the list , you use the method getFirst()
        int firstElement = numbers.getFirst();
        System.out.println(firstElement);

        System.out.println(numbers);



    }
}