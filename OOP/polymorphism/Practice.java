class SportCars{
    public void carSound(){
        System.out.println("normal Vrom Vrom");
    }
}

class Mercedes extends SportCars{
    public void carSound(){
        System.out.println("Vroooooooom pack pack");
    }
}

class Bmw extends SportCars{
    public void carSound(){
        System.out.println("Ratatatat taaack");
    }
}

class Practice{
    public static void main(String [] args){
        SportCars car1 = new SportCars();
        /*Since the classes of the  object we want create has inherited the parent class, we can either put the parent class as the the type of the object, or give them the sub classses as types 
        but the best practice to do the polymorphism is that you give the name of the parent class as the type to the object, but creating the object from their classes(the subclass) */
        
       /*SportCars */ Mercedes car2 = new Mercedes();
        /*SportCars */ Bmw car3 = new Bmw();

        car1.carSound();
        car2.carSound();
        car3.carSound();
    }
}