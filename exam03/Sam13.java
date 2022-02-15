package exam03;

public class Sam13 {
    public static void main(String[] args){
        int i1 = 0b0000_0000_0000_0000_0000_0000_0001_0100;

        int i2 = i1 >> 1;
        int i3 = i1 >> 2;
        int i4 = i1 >> 3;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
    
}
