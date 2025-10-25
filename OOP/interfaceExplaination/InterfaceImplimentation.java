class InterfaceImplimentation implements Interface{

    public String fname = "ilyass";
    public String lname = "developer";
    public int number = 3100;

    public void methodOne(){
        System.out.println("this is the first method implimented!");
    }

    public int methodTwo(int number){
        return number; 
    }

    public String methodThree(String fname, String lname){
        String fullName = fname +" "+ lname; 

        return fullName;
    }

    public static void main (String[] args){
        InterfaceImplimentation obj = new InterfaceImplimentation();

        obj.methodOne();
        System.out.println(obj.methodTwo(obj.number));
        System.out.println(obj.methodThree(obj.fname, obj.lname));

    }
}