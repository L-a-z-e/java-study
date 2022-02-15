package exam03;

public class Sam07 {

    public static void main(String[] args){

        char c1 = ' '; //공백
        char c2 = '\0'; // Null
        char c3 = '\u0000'; // Null

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c1 == c3); // 공백과 Null 은 다름
        

    }
    
}
