public class GenericTypeMethod{


    public <Type> Type showValue(Type value){
        System.out.println(value);
        return value;
    }

    public static void main(String[] args){
        
        GenericTypeMethod object = new GenericTypeMethod();

        object.showValue(5);
        object.showValue("youcode");
    }
}