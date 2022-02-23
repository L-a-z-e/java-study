package exam03.Week4;


import java.util.Calendar;
import java.util.Date;

public class Sample04 {

    public static void main(String[] args){
      

        Object obj1 = new Object();
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));

        String str1 =  "홍길동";
        System.out.println(str1.toString());

        Date dt1 = Calendar.getInstance().getTime();
        System.out.println(dt1.toString());


    }
}
