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

Collections.sort(carsList);

// create a copy and sort the copy in reverse order (Collections.sort returns void)
List<String> reversedList = new ArrayList<>(carsList);
Collections.sort(reversedList, Collections.reverseOrder());

System.out.println(carsList);
System.out.println(reversedList);

}

}