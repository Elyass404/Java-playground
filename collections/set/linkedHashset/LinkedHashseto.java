//for the LinkedHashset it is a collection that stores Unique elements (so without repeatition) and also
//remembers the order that the elements entered into the the list, without doing automatic sorting


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashseto{

    public static void main (String[] args){

        Set<String> hashSet = new LinkedHashSet<>();

        hashSet.add("element one");
        hashSet.add("element two");
        hashSet.add("element two point five");
        hashSet.add("element three");
        //we inserted a ducplicated element in the hashset collection 
        hashSet.add("element three"); //this element will not be inserted and will not be shown if we tried to print the collection
        
        //show(print) the collection(linkedHashSet)
        System.out.println(hashSet);

        //in order to verify if something (element) exist in the collection, we use .contains
        System.out.println(hashSet.contains("element one")); // Result : true

        //to remove an element in the linked hash set, we use the .remove method
        hashSet.remove("element two point five"); // this should remove the element two point five
        System.out.println(hashSet); //lets verify

        //to remove all the elemnents from the collection, we should use .clear() method
        //hashSet.clear();//Uncomment this line to see the result
        System.out.println(hashSet); //lets verify

        //to know the size of the coll
    }
}