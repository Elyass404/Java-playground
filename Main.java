public class Main{


    public static void main (String[] args){

        var hello = "hello"; 

        //var helloo ; //this will cause an error, because the var when used you should assigna value to the variable; 
       
        // ArrayList<String> list = new ArrayList<String>();

        //type casting
        //1- wedening casting : from a smaller type to a large type
        int intNumber = 15;
        double doubleNumber = intNumber; 

        System.out.println(doubleNumber);

        //2- narrowing casting 
        double doublonNumber2 = 15.42;
        int intNumber2 = (int) doublonNumber2;
        System.out.println(intNumber2);



    


        User user = new User();
        user.numbers();


    }
}