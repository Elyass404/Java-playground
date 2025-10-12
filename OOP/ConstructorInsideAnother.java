public class ConstructorInsideAnother{

    private int modelYear;
    private String nameCar;

    public ConstructorInsideAnother(String nameCar){ //a single parametre constructor, calling a double parametre constructor
        this(2025, nameCar);


        //So what we did here, is when we want to create an object with just one argument but we should create the object 
        //with two, we call the constructor with 2 arguments inside the single argument constructor, providing the first agument 
        // by our selves, 
        //NOTE: this is just an example of where we can use this way, take the idea and use it whenever you need it
    }

    public ConstructorInsideAnother(int modelYear, String nameCar ){
        this.modelYear = modelYear;
        this.nameCar = nameCar;
    }

    public void printInfo (){
        System.out.println(this.nameCar + " "+ this.modelYear);
    }

    public static void main(String[] args){

        ConstructorInsideAnother obj = new ConstructorInsideAnother("Mercedes"); // since we have just one argument, then the constructor with one param will work, then that constructor will call the double params constructor, and give the year 2025 and the passed name argument
        ConstructorInsideAnother obj2 = new ConstructorInsideAnother(1995, "Mercedes");//since we passed 2 args, then the double params constructor will work normally, no constructor inside another.

        obj.printInfo();
        obj2.printInfo();
    }
}