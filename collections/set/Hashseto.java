import java.util.HashSet; //import the hashset

public class Hashseto{

public static void main (String[] args){

HashSet<String> theSet = new HashSet<String>();

theSet.add("element one");
theSet.add("element two");
theSet.add("element three");
theSet.add("element four");

//to check if the set is containing an element 
System.out.println(theSet.contains("element one")); //true

//to remove an element from the set
theSet.remove("element two"); //it removes the element from the set

//to check the size of the set
int size = theSet.size();
System.out.println(size);  

//to remove all the elements from the set at once,
//theSet.clear(); // uncomment this line in order to execute the method     

System.out.println(theSet);
}



}