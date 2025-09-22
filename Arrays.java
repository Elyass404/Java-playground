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

        //to loop through an array, we can use the .length keyword to specify the condition of the for loop
        for (int i = 0 ; i < clockNums.length ; i++){
            System.out.println(clockNums[i]);
            }

        //you can also loop using the for each syntaxe: 
        for(String type : musicTypes){
            System.out.println(type);
        }

        //exercice in the arrays and looping through it: find the lowes age among the ages

        int[] ages = {14,25,62,37,12,2,52};
        int youngest = ages[0];

        for (int age : ages){
            if (age < youngest ){
                youngest = age;
            }
        }
        System.out.println("The youngest Age in the array is: " + youngest);//result is 2






        }
    }
