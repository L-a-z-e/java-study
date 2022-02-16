package exam03;

import java.util.Scanner;

public class Sam18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int month;
        int day=0;

        month = scanner.nextInt();

        switch (month){
            case 1:
                day = 31;
                break;

            case 2:
                day = 28;
                break;
            
            case 3:
                day = 31;
                break;    
            
            case 4:
                day = 30;
                break;

            default:
                System.out.println("4이하로 입력하세요.");
        
            }
        System.out.println(month+"월의 일 수는"+day+"일 입니다.");
        
    }
    
}
