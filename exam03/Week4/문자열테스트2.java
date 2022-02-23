package exam03.Week4;

public class 문자열테스트2 {

    public static void main(String[] args){

        String name = "홍길동";
        int age = 24;
        double weight = 80.1;

        System.out.println("이름 : " + name + " 나이 : " + age + " 몸무게 : "+ weight);
    
    
        String display = String.format("이름 : %s, 나이 : %d, 몸무게 : %.2f", name, age, weight);
        System.out.println(display);
    
    }
    
}
