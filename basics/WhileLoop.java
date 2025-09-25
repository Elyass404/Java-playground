public class WhileLoop{
    public static void main(String[] args){
        int count = 1;
        while(count <=10){
            System.out.println("iteration " + count);
            count ++;
        }

        int y = 0;
        do {
        System.out.println("iteration " + y);
            y ++;
        } while(y <=10 ); //it will be done once, even if the condition is false, then it will verify the codition, and if it is true it will repeat it an so on 

    }

    
}