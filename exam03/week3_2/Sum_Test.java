package exam03.week3_2;

public class Sum_Test {

    public static void main(String[] args){

        Sum sum1 = new Sum();

        System.out.println(sum1.add(1, 2));
        System.out.println(sum1.add(1, 2, 3));
        System.out.println(sum1.add(new int[] {10,20,30,40,50}, 5));
    }
    
}
