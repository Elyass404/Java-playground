
class SubClass extends ParentClass{

    public SubClass(int doors){
        super(doors); //here we are calling the parent class's constructor so we can set the attributes, and the subclass will take them and use them (inherite them like pre defined attributes)
    }

    public static void main(String[] args){

        SubClass subclass = new SubClass(4);

        subclass.showFullInfo();
    }
}