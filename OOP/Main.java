public class Main {




    public static void main(String[] args) {
        // we created an instance of the class "Secondclass"
        SecondClass secondClass = new SecondClass();

        //now we will call the method in the instance to use it in here
        int result = secondClass.ShowVariable();
        
        System.out.println(result);
    }
}