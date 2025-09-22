public class Arrays{
    public static void main(String[] args){
        String [] musicTypes = {"pop","jaz", "RNB","rap","blues"}; // simply making a string array 
        int [] clockNums = {1,2,3,4,5,6,7,9,10,11,12}; // simply making an int array 
        String [] carTypes = new String[5] ; //to specify the amount of elements that array can hold

        System.out.println(musicTypes[2]);

        //to change the value of an element in an array
        musicTypes[1]= "hello"; 
        System.out.println(musicTypes[1]);

        //to print the length of an array
        System.out.println(clockNums.length);

    }
}