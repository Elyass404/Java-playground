public class Singleton{

private int x ;
private static Singleton instance = null;

private Singleton(int x){
    this.x = x;
    System.out.println("Congratulations you have created an instance" + this.x);
}

public static Singleton getInstance(int x){
    if (instance == null ){
        instance = new Singleton(x);
        
    }

    return instance;
}

public void getValue(){
    System.out.println("the value: " + this.x);

}

public static void main(String[] args){
    Singleton instanceOne = Singleton.getInstance(15);
    Singleton instanceTwo = Singleton.getInstance(20); //even i wanted to create another instance with the value of 20 i will not be created , because there is one object has been created

    instanceOne.getValue();
    instanceTwo.getValue();
}

}

//just a comment
