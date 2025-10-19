abstract class Car{
    protected String headLinghts = "LED";
    protected String engineType ;

    public abstract void showEngineType();

    public void showHeadLight(){
        System.out.println("the headlights in this is: " + this.headLinghts);
    }
}

class Mercedes extends Car{

    public void showEngineType(){
        this.engineType = "petrol";
        System.out.println("the engine type of this car is: " + this.engineType);

    }

}

class Bmw extends Car{

    public void showEngineType(){
        this.engineType = "Deisel";
        System.out.println("the engine type of this car is: " + this.engineType);

    }

}

class Abstraction{
    public static void main (String[] args){
        Car merc = new Mercedes();
        Car bmw = new Bmw();

        merc.showEngineType();
        bmw.showEngineType();


    }
}