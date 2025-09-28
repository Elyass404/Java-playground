public class Main {




    public static void main(String[] args) {
        // we created an instance of the class "Secondclass"
        SecondClass secondClassObj = new SecondClass();

        //We can make multiple objects from the same class 
        SecondClass secondClassObj2 = new SecondClass();


        //now we will call the method in the instance to use it in here
        int result = secondClassObj.ShowVariable();
        int result2 = secondClassObj2.ShowVariable();

        System.out.println(result);
        System.out.println(result2);
    }
}