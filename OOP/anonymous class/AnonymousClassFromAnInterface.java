interface SimpleInterface{
    void methodOne();
}

class AnonymousClassFromAnInterface{

    public static void main(String [] args){

        SimpleInterface obj = new SimpleInterface(){ //here an anonymous class will implement the interface directly
            public void methodOne() {
                System.out.println("This method is from an anonymous class from an interface! ");
            }
        } ; //<--- again this is important (to finish the definition of the anonymous class with a semicolumn)

        obj.methodOne();
    }
}