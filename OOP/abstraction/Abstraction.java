//Abstraction is the concepts of hiding things and show only the important ones, without distressing others with the content of the of methods etc 

//To apply the abstraction you should use the keyword of "abstract" in the class and/or in the method

/*An abstract method, is a method that is made inside an abstract class, and  it has only the name (signature) without defining its body
and when another class is inheriting the abstract class it is obligatory for the subclass to redefine that abstact method (method without body in the parent abstract class)
or that would cause an error */

/* Important NOTE: To make an abstract method you should make its class abstract, you can not make an abstract method inside a normal class
but in the other hand you can make an abstract class without any abstract method if you want */

abstract class Car{
    protected String headLinghts = "LED";
    protected String engineType ;

    public abstract void showEngineType(); //this method should be redefined once another class inherites this abstract class

    public void showHeadLight(){
        System.out.println("the headlights in this is: " + this.headLinghts); // an abstract class can have also normal method that have body
    }
}

class Mercedes extends Car{

    public void showEngineType(){ // redefining the abstract method that exists in the abstract parent class
        this.engineType = "petrol";
        // we can do whatever we want this method to do; 
        System.out.println("the engine type of this car is: " + this.engineType);

    }

}

class Bmw extends Car{

    public void showEngineType(){ // redefining the abstract method that exists in the abstract parent class
        this.engineType = "Deisel";
        //we can do wahtever we want this method to do; 
        System.out.println("the engine type of this car is: " + this.engineType);

    }

}

class Abstraction{
    public static void main (String[] args){
        Car merc = new Mercedes();
        Car bmw = new Bmw();

        //now and even the two classes have the same method names, eachone of them is doing something different because we redefined them
        merc.showEngineType();
        bmw.showEngineType();


    }
}