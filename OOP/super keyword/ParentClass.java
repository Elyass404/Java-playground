/*The super keyword is a word that is used to reffer to the attributes or the methods of the super class (parent class)
from the sublclass(s) that inherit from the parent class, 
More simply to use the methods and the attributes of the parent class with ease and removing the confusion (like when we use the "this" keyword) */

/*We can use the "super" keywod with Attributes, Methods, and even Constructors */


class SuperClass{
protected int number = 5;

protected SuperClass(){
    System.out.println("Now you are using the the parent's constructor!");
}

protected void showMessage(){
    System.out.println("This the is the parent's method ");
}

}

class SubClass extends SuperClass{
    private int number = 10;

    public SubClass(){
        super();// this will use the super class constructor
        System.out.println("the Parent's number is: "+ super.number); // this will use the super class number attribute
        System.out.println("the Child's number is: "+ this.number);// this will use the subclass number attribute
        System.out.println("And now you are accessing the second fourth line in the subclass constructor");
    }

    public void showMessage(){
        System.out.println("And now this is the child's method!");

    }
    public void executeMessages (){
        super.showMessage();// this will use the super class method called showMessage
        this.showMessage(); //this will use the subclass method called showMessage
    }
}

class ParentClass{
    public static void main(String[] args) {
    
    SubClass obj = new SubClass();

    obj.executeMessages();
}
}