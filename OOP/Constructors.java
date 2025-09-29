public class Constructors{

    /*constructors are used to do somehting right after creating an object from a class, so whenever 
    you create an object from a class the constructor will work wihtout calling it (because it is a method just a special one)*/

    //NOTE: the constructor method should have the same name of its class
    //NOTE: constructors dont have a return type 
    //Usally the constructors are made to affect values to the attributes of the instantiated object (but you can do whatever you want to be executed right after the instanciation)

    int variable ;

    //How to create a constructor,
    public Constructors(int x){ // we can set how many parametres we want just like a simple method 
        variable = x;
        System.out.println("this will be executed directly after creating an instance ");
        System.out.println("the variable has taken the number x which is :"+ variable);

    }

    public static void main(String [] args){

        Constructors obj = new Constructors(5);
    }
}