class SecondClass extends AbstarctMethod{

    //NOTE: if you inherite a class that has an abstract method, you are obliged to redefine that method
    
    public void showSomething(){ //now we fill the method with whatever logic we want 
        System.out.println("here is something! ");
    }

    public static void main(String[] args){
        SecondClass obj = new SecondClass();

        obj.showSomething();
    }
}