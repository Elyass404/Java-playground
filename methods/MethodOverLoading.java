public class MethodOverLoading{


    /*if we have a method that does the same thing but can handle different cases depending on
    number of parametres and/or the type of the parametres, we can make two (or more) methods with the same
    exacte name but with different number or/and type of type of parametres that the methods take*/

    //Java will automatically know what method to use, depending on the number of parametres passed and also on the type passed

    public static void printName(String fullName){
        System.out.println("Hello, "+fullName);
    }

    public static void printName(int numberName){
        System.out.println("Hello, "+numberName);
    }


    public static void printName(String firstName, String lastName){
        System.out.println("Hello, "+firstName +" " +lastName);
    }
    

    public static void main(String[] args){

        printName("Ilyass Devs"); //here it will call the first method because we passed one argument with string type
        printName("Ilyass Devs"); //here, even we passed only one argument like the first one, but java detects that it is and integer so it will call the second method
        printName(152486); //here it will call the second method because we passed two argument with type of String 

        /*Keynote: so if one method method can do one thing but with different arguments (different types or/and arguments)
        we make multiple methods with the same name but different parametres(quantity or/and types) instead of making multiple
        methods with different names that we can forget or get lost between */

    }
}