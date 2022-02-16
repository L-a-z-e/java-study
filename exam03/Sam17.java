package exam03;

import java.util.Scanner;

public class Sam17 {
    public static void main(String[] args){

    
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = 0;

        if (month == 1){
            day = 31;
        } else if (month == 2){
            day = 28;
        } else if (month == 3){
            day = 31;
        } else if (month == 4){
            day = 30;
        } else if (month == 5){
            day = 31;
        } else if (month == 6){
            day = 30;
        } else if (month == 7){
            day = 31;
        } else if (month == 8){
            day = 31;
        } else if (month == 9){
            day = 30;
        } else if (month == 10){
            day = 31;
        } else if (month == 11){
            day = 30;
        } else if (month == 12){
            day = 31;
        } else {
            System.out.println("12 이하를 입력하세요");
        }

        System.out.println(month +"월의 날짜는 "+day +"일 입니다.");

    }
    
}
