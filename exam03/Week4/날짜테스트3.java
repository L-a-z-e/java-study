package exam03.Week4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class 날짜테스트3 {

    public static void main(String[] args){

        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Calendar.getInstance().getTime();

        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        System.out.println(date1);
        System.out.println(localDateTime1);
        
    }
    
}
