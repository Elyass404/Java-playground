 interface Interface{

    //an interface is like an abstaract class, like we saw before, you cant instanciate from it and it has methods
    //that should be redefined by the the child class (we call them implimanting classes because they implement the interface)
    //but the deffirence here is that the interfaces would never ever have bodies in their declared mehtods

    //because the interface plays like a contract that a developer should respect, so he should redefine all the methods from the implimented
    //interface or that will cause error, and with that the developer doesnt miss any method

    void methodOne();
    int methodTwo(int number); // this method accepts one argument 
    String methodThree(String fname , String lname); // this method accepts two arguments
}