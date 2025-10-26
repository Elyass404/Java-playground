/*But first what is the anonymous class, anonymous class is a class without a name, and it is used when created at the same time, how??
 when instantiating from a class, instead of just writing new class(); after that new class() we open the curly braces and define the class and what is inside it.
 NOTE : you will understand when applying the the example below*/

 /*Why do we need an anonymous class. When e want to override a method in a class wihtout created a dedicated subclass that extends the parent class and do all that mess
 so we create an objec from a class , and instead of just creating new class() and stop, we open the curly braces and redefine the methods we want or what ever we want to do */

 /*NOTE: WE can also create an anonymous class from an interface */


class AnonymousClass{ //this is not the anonymous class, this is just a  normal class we will see the anonymous in the main method

 public void methodUno(){
    System.out.println("hello world!");
 }

 public static void main(String[] args){

    AnonymousClass objNormal = new AnonymousClass();
    AnonymousClass objWithAnounymousClass = new AnonymousClass() { //now we are creating an anonymous class 

        public void methodUno(){
            System.out.println("hello Anonymous! "); // we overrided the method without creating a dedicatd subclass form the parent class
        }
    } ; // <-- sooooooo important to add the semicolumn in the end of the definition oof the anonymous class


    // now when we call the methodUno from the objNormal, we will get the redefined return not the return from the original class
    objNormal.methodUno();
    objWithAnounymousClass.methodUno();
 }

}