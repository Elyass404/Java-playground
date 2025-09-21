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
        System.out.print(decide);
    }
}