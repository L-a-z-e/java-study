package exam03.Week4;

public class MathPlus {

    public static double round(double d, int i) {
        return ((double)Math.round(d * Math.pow(10,i)))/Math.pow(10,i);
    }

    public static double ceil(double d, int i) {
        return ((double)Math.ceil(d * Math.pow(10,i)))/Math.pow(10,i);
    }

    public static double floor(double d, int i) {
        return ((double)Math.floor(d * Math.pow(10,i)))/Math.pow(10,i);
    }


    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }


    
}
