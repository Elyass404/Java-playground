//Packages is just a fansy name of folder or directory, it is used to organize the class,and files in genral 
    // so we can put related classes with eachother in one package, and then access them if we want to use them 

    //the are two diffirent packages, built in packages (java APIs), which are prewritten java packages(includign helpul classes to use by us developers)
    //and our own packages, which we create to morganize our classes inside the project,

    //NOTE: if we want to use a class inside a package or even the whole papckage, we use the keyword "import" then followed by the name of the package, then the name of the class like shown bellow
   
    import java.util.Scanner; //java.util : is the package, and Scanner: is the class we want to use (it includes methods that can help us)
    import java.util.* ;//this means import the whole package, with all the classes included in it

    //this is an example of importing our own class inside our own created package (same same), but you should use the keyword package int the class file, and name that package (like name space in php if you can relate) so java can recognize what class in what package you are talking about
    //in the top of the file Singleton.java  you should find "package patterns", and make sure to write the package name in lowercase to avoid conflict with the classes naming
    import Patterns.Singleton;


    //now we can use the calsses and their method easy.
    //for the java classes , just get documented about how to use them , and you are good to go.

class Packages{

    //lets use the scanner class from the package java.util

    public static void main(String[] args){

        //create an object of class Scanner
        Scanner scnr = new Scanner(System.in);

        System.out.println("Helllow, enter your name");

        //we will use the nextLine method that reads the next line 
        String name = scnr.nextLine();

        System.out.println(name);

        //And this is it, how to imports classes from a  package and use it in the current class
    }
    
}