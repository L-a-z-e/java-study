package exam03;

public class Sam11 {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 10;
        int j1 = 10;
        int j2 = 20;

        System.out.println(i1<i2);
        System.out.println(j1<j2);
        System.out.println(i1 < i2 && j1 < j2);
        System.out.println(i1 < i2 || j1 < j2);
        System.out.println(i1 < i2 ^ j1 < j2);
        System.out.println(!(i1<i2));
    }
    
}
