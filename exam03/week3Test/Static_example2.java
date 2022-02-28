package exam03.week3Test;


public class Static_example2 {
    public static int count = 0;
    Static_example2(){
        Static_example2.count++; // count++ 적으면 should be accessed in a static way 경고
        System.out.println(count);

    }

    public static void main(String[] args){
        Static_example2 c1 = new Static_example2();
        Static_example2 c2 = new Static_example2();
    }

    
    
}
