 interface Interface{

    //an interface is like an abstaract class, like we saw before, you cant instanciate from it and it has methods
    //that should be redefined by the the child class (we call them implimanting classes because they implement the interface)
    //but the deffirence here is that the interfaces would never ever have bodies in their declared mehtods

    void methodOne();
    int methodTwo(int number); // this method accepts one argument 
    String methodThree(String fname , String lname); // this method accepts two arguments
}