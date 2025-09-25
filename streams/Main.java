import java.util.*;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) {
        List<Driver> drivers = new ArrayList<>();

        drivers.add(new Driver("Hamilton",8,"Mercedes"));
        drivers.add(new Driver("Schumacher",7,"Ferrari"));
        drivers.add(new Driver("Senna",3,"Mclaren "));

        //this to sort out the elements in the list depending on the condition that we put in the sort
        List<Driver> sortedDrivers  = drivers.stream()
        .sorted(Comparator.comparing(Driver :: getName).reversed()) //you can remove the reversed method to get the ascendent order
        .collect(Collectors.toList());
        
        System.out.println("-------- sorted drivers by titles --------");
        sortedDrivers.forEach(driver -> System.out.println(driver.titles));
        // sortedDrivers.forEach(System.out::println); //this prints the location of the elements in the memrory i think

        //this to filter out the elements of the list depending on a condition that we put in the filter 
        List<Driver> withEight = drivers.stream()
        .filter(driver -> driver.titles == 8)
        .collect(Collectors.toList());
        
        System.out.println("-------- Filtered drivers by most titles --------");
        withEight.forEach(driver -> System.out.println(driver.name));
        
        
    }
 
}
