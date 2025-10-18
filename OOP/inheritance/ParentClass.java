
class ParentClass{ //lets pretend that this class is called vehicule, and we are creating a blueprint for a vehicule

    /*Inheriatnce is the concept of giving attributes and methods to other classes without recreating the same things in each class
    so, we can create a class (parent class) that has the things that other classes (sub classes) would have or share, and simply each time we create a class that 
    has the same things the parent class has, we use the keyword "extends" and we use those 'attributes' or 'methods' without writing /defining them again

    NOTE: we can give the values directly to the attributes or give the body to the methods from the parent class so the subclasses can have them ready to use, or 
    just giving the names of the attributes (without values), and just names to the methods without body(with abstract methods, we will see them later ) (just signatures), untill we inherite them in the subclasses
    then we can give the values to the attributes and the bodies to the methods, or eeeeeven override them (we will see this concept later)
     */


    protected String brandName = "Mercedes"; //now when inheriting this class (parent class), the subclass will have automatically the attribute of brand name and it will have the value of Mercedes
    protected int doorsNumber; //now when inheriting this class (parentClass), the subclass will have automatically the attribute of doors number without defining it there, but without any value.

    //constructor 
    protected ParentClass(int doors){
        this.doorsNumber = doors;
    }


    protected void showNameOfBrand(){
        System.out.println("The brand name is: " + this.brandName);
    }

    protected void showFullInfo(){
        System.out.println("The brand name is: " + this.brandName + " and the doors number is: "+this.doorsNumber);
    }


}