package exam03;

public class Sam19 {

    public static void main(String[] args){

        for (int i = 1; i < 10; i++){
            if( i== 4){
                continue;
            }

            if (i == 9){
                break;
            }
            System.out.println("2 x "+i + " = " + 2*i);
        }

       /* for (int i = 1; i < 10; i++){
            for(int j = 1 ; j < 10 ; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        } */
    }
    
}
