package exam03;

public class Sam08 {
    public static void main(String[] args){
        int i1 = 12 / 4;
        int i2 = 12 / 5;
        int i3 = 12 % 4 ;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = 10;
        ++i4;
        System.out.println(i4);
        i4++;
        System.out.println(i4);
        System.out.println("-----");
        System.out.println(++i4);
        System.out.println(i4++); // 문장을 수행한 이후에 증가하는지, 수행하기 전에 증가하는지에 따라 전위 후위 나뉨
        System.out.println(i4);
    }
    
}
