package exam03.Week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.event.SwingPropertyChangeSupport;

public class 날짜테스트 {

    public static void main(String[] args){
        Date today = new Date();
        System.out.println(today);

        Date today1 = Calendar.getInstance().getTime();
        System.out.println(today1);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss");
        System.out.println(simpleDateFormat.format(today1));
    }

    
    
}
