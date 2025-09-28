public class StaticMethods {

    //here we will see what is the static methods and what they are used for and when

    /* Static methods (which use the keyword static) are used when we want to use the method without making and object
    for example inside this class there is a code that does the same thing and we want to use it multiple times 
    we can simply make a static method that we can call whenever we want without make an object and then calling it with dot "." way
    because if we made it public (without static) we should first make an object and then call the method through the object ( obj.method() )*/

    //we are using the static keyword
    public static void methodStatic(){
        System.out.println("this is a Static method !");
    }

    //we are not using a static method here 
    public void methodPublic(){
        System.out.println("this is a Public method !");

    }

    public static void main(String[] args) {

        methodStatic(); //will execute the static method without being obliged to make an object from this class 
        
        // this method call (you can uncomment it) bellow will give an error (we should first make an object from this class)
        //methodPublic();

        StaticMethods object = new StaticMethods(); //making an object from this class (staticMethods) to call the non static method
        object.methodPublic(); // now it will be called because we made an object, and from it we called the public non static method


    }
}