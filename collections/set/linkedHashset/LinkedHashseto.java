//for the LinkedHashset it is a collection that stores Unique elements (so without repeatition) and also
//remembers the order that the elements entered into the the list, without doing automatic sorting


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashseto{

    public static void main (String[] args){

        Set<String> hashSet = new LinkedHashSet<>();

        hashSet.add("element one");
        hashSet.add("element two");
        hashSet.add("element three");
        hashSet.add("element three"); //we inserted a ducplicated element in the hashset collection 

        System.out.println(hashSet);
    }
}