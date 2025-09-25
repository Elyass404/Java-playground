public class ForLoop{
    public static void main(String[] args){
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("Loop N°: "+ i);
        }

        for (int j = 1; j<4; j++){
            for(int z = 1; z < 4; z++){
                System.out.println("this is series: "+ j +" and iteration : " + z);
            }
        }


    }
}