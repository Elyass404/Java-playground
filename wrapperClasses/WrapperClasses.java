package wrapperClasses;
//wrapper classes, are classes (obviously hahah) tha provide a way to use primitive data as objects, so we can be able to use pre existing methods with the variables, 

public class WrapperClasses {
  
  public static void main(String[] args) {
    // here are the different wrapper classes 
    Integer number =  15;
    Long longNumber= 112L;
    Double doubleNumber = 12.25;
    Float floatNumber = 1.21f ; 
    Character charac = 'A';
    System.out.println(number);
    System.out.println(doubleNumber);
    System.out.println(charac);
    System.out.println(longNumber);
    System.out.println(floatNumber);

    //since we are using object instead of normal variables, now we can access to methods that will help us during our pragramming

    System.out.println(number.intValue());//to transfor the object to an int 
    System.out.println(number.doubleValue());//to transform the int to a double 
    System.out.println(floatNumber.byteValue()); // to transform the object to a byte value


  }
}
