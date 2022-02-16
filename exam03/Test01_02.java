package exam03;

import java.util.Scanner;

public class Test01_02 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int selectMenu;

        do{
            System.out.println("시작화면");
            System.out.println(" ");
            System.out.println("[메뉴선택]");
            System.out.println("1.회원 관리");
            System.out.println("2.과목 관리");
            System.out.println("3.수강 관리");
            System.out.println("4.결제 관리");
            System.out.println("5.종료");
            selectMenu = scanner.nextInt();
            
            switch(selectMenu){
                case 1:
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                break;
                
                case 2:
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                break;

                case 3:
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                break;

                case 4:
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                break;

                case 5:
                System.out.println("프로그램을 종료합니다.");
                break;

                default:
                System.out.println("Error, 1~5까지만 입력바람");

            }
        }while(selectMenu != 5);
        

        



    }
    
}