public class GenericTypeInterface implements InterfaceTest<Double>{

public void showNumber(Double num) {
        System.out.println("The number is: " + num);
    }

    public Double ConvertNumber(int num) { 
        System.out.println("Integer: " + num);
        return (double) num; 
    }

    public static void main(String[] args){
        GenericTypeInterface  object = new GenericTypeInterface();

        object.showNumber(12.5);
        Double converted = object.ConvertNumber(42);
        System.out.println("Converted: " + converted);

    }
}
