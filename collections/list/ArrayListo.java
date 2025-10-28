import java.util.ArrayList; // Import the ArrayList class

//array list, is a class that impliments the List interface, and it play kind of the same role as the normal
//array we kno, but there is a difference. While in normal array we can not change the size of the array, and it is quite limiting 
//the array list is more dynamic ,and give us the ability to add new elements to it.

//NOTE: An ArrayList keeps elements in the same order you add them, so the first item you add will be at index 0, the next at index 1, and so on.

//NOTE: you can use methods like add(), get(), set(), and remove() to manage your list of elements.

class ArrayListo{


    public static void main (String[] args){

        //To create an array list you should create a new object from the array list, and define which type will you store
        ArrayList<String> phones = new ArrayList <String>();

        //To add elements inside that array list, you use add(), and make sure it is the same type you defined
        phones.add("Apple");
        phones.add("Samsung");
        phones.add("Oppo");
        phones.add("OnePlus");

        //To get some element from the array list, you use get(), and remember that the first starts from 0 index
        String phoneOne = phones.get(0);
        String phoneTwo = phones.get(1);

        //To remove an element from an array list, you use remove(), and then give the index of the element
        phones.remove(2); //it will remove the oppo from the index 2
        System.out.println(phones.get(2));// since the oppo removed now the index 2 is OnePlus (it took its place)


        System.out.println(phoneOne);
        System.out.println(phoneTwo);
    }
}