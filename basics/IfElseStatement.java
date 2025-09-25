public class IfElseStatement {
    public static void main(String[] args) {
        int myAge = 17 ;
        int votingAge = 18;

        if (myAge < votingAge){
            System.out.println("We appreciate that, but you are still berhouch to Vote!");
        } else if(myAge >= votingAge){
            System.out.println("Welcome to decide the future of your Country!");
        }

        //there is a shorthand for the if statement which called the tenanry operator 
        String decide = (myAge >= votingAge ) ? "welcome to vote" : "still berhouch!";
        System.out.print(decide + "\n");

        //nested if statment, is an if inside an if before it, and we only enter to the second "if" , if the first "if" is true
        int num1 = 7; // you can change this to something bigger than the num 2 and you wont reach the nested if
        int num2 = 71;

        if(num1 < num2){
            if (15<num2){
                System.out.println("you reached the nested if");
            } // you can do how many else if... else you want 
        }else{
            System.out.println("you cant reach the nested if! sorry");
        }
    }
}