class InterfaceImplimentation implements Interfae{

    public String fname = "ilyass";
    public String fname = "developer";
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
}