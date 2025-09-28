public class Main {




    public static void main(String[] args) {
        // we created an instance of the class "Secondclass"
        SecondClass secondClassObj = new SecondClass();

        //We can make multiple objects from the same class 
        SecondClass secondClassObj2 = new SecondClass();


        //now we will call the method in the instance to use it in here
        int result = secondClassObj.ShowVariableByTwo();
        int result2 = secondClassObj2.ShowVariableByTwo();

        //we can also access the attributes of an object directly without using a method that returns them by using the dot "." way
        System.out.println(secondClassObj.variable); //will show the 31

        //and we can change the attributes also (lets change the 31 to 41 in the secondClassObj2), but without changing the other objects  attribute, because each object we instanciate will have those attributes to his own even if they are from the same class and having the same values
        secondClassObj2.variable = 41;
        System.out.println(secondClassObj2.variable); //channged to 41
        int newValOfVariable = secondClassObj2.ShowVariableByTwo(); 
        System.out.println(newValOfVariable); // will show 82 because the variable set before in the obj is changed and will affect all the methods inside it that uses the variable)

        //we added an attribute in the SecondClass with the keywor "final" so it is never changed, we can access it using the dot '.' but never changed
        System.out.println("constant attribute: " +secondClassObj.constant); 
        //secondClassObj.constant = 8555.25; //will give an error because the "constant" attribute uses "final" keyword

        System.out.println(result); //will show 62
        System.out.println(result2); //will show 62
    }
}