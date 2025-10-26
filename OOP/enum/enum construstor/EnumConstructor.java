enum Cars{
    SUV("this is an suv"), //values inside the parentheses are the values of the enum constants, they can be strings or numbers, so if we declare them they are the values, other ways, the name of the constants them selves are the values
    SEDAN("this is a sedan"),
    PICKUP("this is a pickup");

    String description;

    private Cars(String description){
        this.description = description; 
    }

    public String getDescription(){
        return this.description;
    }
}

class EnumConstructor{

    public static void main(String [] args){

     Cars car = Cars.SEDAN; //so when we give some a constant from an enum, we diretly trigger the constructor in that enum 

        System.out.println(car.getDescription());
    }
}