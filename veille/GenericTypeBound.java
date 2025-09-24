public class GenericTypeBound<Type extends Number>{

    protected Type value ;

    public GenericTypeBound(Type value){
        this.value = value;
    }

    public void youcode(){
        System.out.println("your value is: "+ value);
    }
    public static void main(String[] args) {
        GenericTypeBound<Integer> intInstance = new GenericTypeBound<>(20);
        GenericTypeBound<Double> doubleInstance = new GenericTypeBound<>(15.25);
        GenericTypeBound<String> StringInstance = new GenericTypeBound<>("youcode school");
        
        System.out.println("Instances created successfully.");
        intInstance.youcode();

        
    }
}