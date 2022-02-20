package exam03.week2;

public class juice {

    private static int amount;
    private int manufactureDate = 10; /// 명시적초기화

    static{
        // manufactureDate = 23; error static 변수가 아니어서
        System.out.println("클래스 초기화 블럭");
        amount = 30;
        System.out.println("용량:"+amount);
    }

    {   
        System.out.println("인스턴스 초기화 블럭");
        amount = 40;
        manufactureDate = 21;
        System.out.println("용량:"+amount);
        System.out.println("제조일자:"+manufactureDate);
    }

    public juice(){
        System.out.println("생성자 호출");
        amount = 50;
        manufactureDate = 20;
        System.out.println("용량:"+amount);
        System.out.println("제조일자:"+manufactureDate);
    }
    
}
