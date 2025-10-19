/*Polymorphism, is the concept that give us many forms, so one method can play different things in different classes (the same method(s) name or signature) that are all inherite the same  class 
making it more clear, so the parent class can have a method that does something and it works, but when a class inherits it, that subclass does something different with that method, so we create a method 
with the same name as the one in the parent one, but we redefine its body to suit the thing that the subclass can do, now i will give an example in theory and we will do the example in practice in below
soooo, there are animals , and those animals share different things, like mouthes , legs etc , and they all (kind of) make sounds, which is the commun thing, but the sound they make are different
some "meows", some say "how how " etc, here we it comes polymorphism in play*/


/*Below we have a class called Animal, and it has a mehtod called animal sound, so any animal that inherits that parent class "Animal" without any changes (redefinition) will have the same functioning of that
parent method, but when a class inherits that class and make a method with a name that already exists in the parent class, and with different functioning (different body), when we call the method of the subclass
we will get the functioning of themethod that defined in the subclass not the one in the parent class */

 /*below, instead of making many class eachone in his file, we made them all here to notice the difference without the need of traveling and changing the files  */

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound"); //if a subclass inherits this class, it will get the functioning of this method 'animalSound' 
  }
}

class Pig extends Animal {
  public void animalSound() { // the "Pig" inherits the Animal class, but redefined the method 'animalSound', so now when we call the method 'animalSound' of the pig we will get the functioning we defined here not in the Animal class
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

//now here is the place we will execute our code , which is the class that has the same name as the file
class Polymorphism {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound(); //Result: The animal makes a sound
    myPig.animalSound();//Result: the pig syas: we we
    myDog.animalSound();//Result: the dog says: bow wow
  }
}
