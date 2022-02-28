package exam03.week3Test;

class Number{
    static int num = 0; // 클래스 필드
    int num2 = 0; // 인스턴스 필드
    
}

class Name{
    static void print(){
        System.out.println("print1"); //클래스 메소드
    }
    void print2(){
        System.out.println("print2"); //인스턴스 메소드
    }
}
public class Static_example {

    public static void main(String[] args){

        Number number1 = new Number();
        Number number2 = new Number();

        Number.num++;
        number1.num2++;
        Number.num++;
        number2.num2++;
        System.out.println(Number.num); // number1.num -> should be accessed in a static way 경고
        System.out.println(number1.num2);
        System.out.println(Number.num); // number2.num -> should be accessed in a static way 경고
        System.out.println(number2.num2);

        Name.print();
        // Name.print2(); Non Static Method, 인스턴스 생성해야 호출가능

        Name name = new Name();
        name.print2();

    }

    
    
}
