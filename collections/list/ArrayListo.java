import java.util.ArrayList; // Import the ArrayList class

//array list, is a class that impliments the List interface, and it play kind of the same role as the normal
//array we kno, but there is a difference. While in normal array we can not change the size of the array, and it is quite limiting 
//the array list is more dynamic ,and give us the ability to add new elements to it.

//NOTE: An ArrayList keeps elements in the same order you add them, so the first item you add will be at index 0, the next at index 1, and so on.

//NOTE: you can use methods like add(), get(), set(), and remove() to manage your list of elements.

class ArrayListo{



    public static void main (String[] args){

    ArrayList<String> arrayList = new ArrayList <String>();

    arrayList.add("helllo");

        System.out.println(arrayList.get(0));
    }
}