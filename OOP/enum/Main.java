class Main{

    public Enum attribute ;

    public Main(Enum value){
        this.attribute = value;
    }

    public static void main (String[] args){

        /*There is cases when you want the user input to be given to an attribute, but the simple String or number input can be handled as enum 
        so you should take that input and turn it into an enum type that attribute with the type Enum can take the value inserted by the user, 
         and to do that you should use the built in function ".valueOf" this stick with the name of the enum you created, Example: Enum.valueOf() 
        or Types.valueOf(), and inside you put the String value you want to give the type of enum*/

        String userInput  = "ENUMONE";
        Enum value = Enum.valueOf(userInput); //or if you want to insert the String directly : Enum.valueOf("ENUMONE")
        
        //if the value is not presented in the enum, an error will occur, and to handle that is better to do the try and catch so that the errror got handle as wanted
        Main obj = new Main(value);

        System.out.println(obj.attribute);
    }
}