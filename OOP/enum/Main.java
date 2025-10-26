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
        //note: the values of the enum should always be in upper case, so if you are not sure if the input that will be inserted is an upper caseed, you should use the .toUpperCase() mehtod like done in the line below this(jsut to make sure)
        Enum value = Enum.valueOf(userInput.toUpperCase()); //or if you want to insert the String directly : Enum.valueOf("ENUMONE")
        
        Enum justAnEnumValue = Enum.ENUMTHREE ;// we can access the values of the enum we created and play with it 
        
        //if the value is not presented in the enum, an error will occur, and to handle that is better to do the try and catch so that the errror got handle as wanted
        Main obj = new Main(value);
        Main objTwo = new Main(justAnEnumValue);

        System.out.println(obj.attribute); //ENUMONE
        System.out.println(objTwo.attribute); //ENUMTHREE
    }
}