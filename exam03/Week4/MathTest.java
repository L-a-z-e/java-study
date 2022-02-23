package exam03.Week4;

public class MathTest {
    
    public static void main(String[] args){
        double d1 = 12.426;
        System.out.println(d1);
        System.out.println(Math.round(d1));
        System.out.println(Math.ceil(d1));
        System.out.println(Math.floor(d1));

        System.out.println("-------");
        System.out.println(MathPlus.round(d1, 2));
        System.out.println(MathPlus.ceil(d1,2));
        System.out.println(MathPlus.floor(d1,2));

        System.out.println("-------");
        double x1 = 0;
        double x2 = 3;
        double y1 = 0;
        double y2 = 4;
        System.out.println(MathPlus.distance(x1, y1, x2, y2));
    }
}
