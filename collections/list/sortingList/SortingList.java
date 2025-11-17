import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

public static void main (String[] args){

List<String> carsList = new ArrayList<>();
carsList.add("Mercedes");
carsList.add("Dacia ostora");
carsList.add("BYD");
carsList.add("Audi");
carsList.add("Lacia");

//sort the elements of carsList alphabetacally 
Collections.sort(carsList);

// in order to create another variable that takes the reversed version of the carsList 
List<String> reversedList = new ArrayList<>(carsList);
//then reverse the copied  list 
Collections.sort(reversedList, Collections.reverseOrder());

System.out.println(carsList);
System.out.println(reversedList);

}

}