package wrapperClasses;
//wrapper classes, are classes (obviously hahah) tha provide a way to use primitive data as objects, so we can be able to use pre existing methods with the variables, 


//hello this is just a test

public class WrapperClasses {
  
  public static void main(String[] args) {
    // here are the different wrapper classes 
    String str = "hello";
    Integer number =  15;
    Long longNumber= 112L;
    Double doubleNumber = 12.25;
    Float floatNumber = 1.21f ; 
    Character charac = 'A';
    System.out.println(str);
    System.out.println(number);
    System.out.println(doubleNumber);
    System.out.println(charac);
    System.out.println(longNumber);
    System.out.println(floatNumber);

    //since we are using object instead of normal variables, now we can access to methods that will help us during our pragramming

    System.out.println(number.intValue());//to give the int value of the object 
    System.out.println(number.doubleValue());//to give the double value of the object 
    System.out.println(floatNumber.byteValue()); // to give the byte value of the object
    System.out.println(number.toString()); //to transform the object to a string and manipulate it like it is a string from the start
    System.out.println(String.valueOf("nbvcvb")); // to know the value of the sobject after parsing it into a string
    System.out.println(Integer.valueOf("")); // to know th value of a number or a string number
    System.out.println(Integer.valueOf("1111", 8)); // here is the same, but the base (number system) you want to interpret the string in. 2 binary / 8 octa/ hexa etc..

  }
  
}
