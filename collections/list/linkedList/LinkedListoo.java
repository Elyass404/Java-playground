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
        System.out.println("the first element is " + firstElement); //15

        //To get the last element of the list, you use the method getLast();
        int lastElement = numbers.getLast();
        System.out.println("the last element is: " + lastElement); //784

        //To remove the first element of the linkedList, use the method removeFirst()
        numbers.removeFirst(); // now the first element which is 15 is removed 

        //To remove the last element of the linkedList, use the method removeLast()
        numbers.removeLast(); //now the last element which is 784 is removed 

        //The other method we saw in the array list are still usable here exactly like we saw in the array list

        //To add an element to the linkedList
        numbers.add(1533);

        //To get an element in the linkedList 
        int thirdElement = numbers.get(2); 
        System.out.println("the third element is: " + thirdElement); // result 1533

        //To change an existing element in the linkedList
        numbers.set(0, 31111); //change the element with index "0" to the value "31111"

        //To remove an element from a linked list 
        numbers.remove(1); // remove the element with the index 1 

        //To remove all the elements in the linked list at once
        // uncomment this >>> // numbers.clear();

        //To know the size of the linkedlist 
        int sizeOfLinkedList = numbers.size();
        System.out.println("the size of the linked list is: " + sizeOfLinkedList); 

        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 
        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 2
        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 3
        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 4
        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 5
        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 6
        //i did nothing this day i just didnt want to break the daily progress in the github daily commits 7

        

        System.out.println(numbers);



    }
}