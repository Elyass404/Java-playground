public class Main{

    // L'ets make a void method (a method that does not return anything, it just executes the code)
    public static void checkAge(String fname, int age){ // we made it static so we can call the function throughout the class without instanciating an object from a class (this concept is for OOP)
        if(age < 18){
            System.out.println("Hey "+fname + ", We are so sorry, but you are underaged!");
        }else{
            System.out.println("Hey "+fname + ", We are so happy to see you here!");

        }
    }

    //Now let's make a method with a retun type (a method that executes the code and return something that have the same type of return that we specified)
    public static int sum(int x, int y){
        int majmo3 = x + y;
        return majmo3; // so the method at the end will return that variable (which have the same return type we specified for the method)
        
        //or we can write the return directly without putting it in a variable as shown in the line bellow 
        //return x +y ;
    }
    public static void main(String[] args){
        
        checkAge("Hassan",17); //expected message: We are so sorry, but you are underaged!
        checkAge("Youssef",20); //expected message: Hey "+fname + ", We are so happy to see you here!

        int resultOfSum = sum(5,10); 
        System.out.println(resultOfSum); // expected result : 15
        
    }
}