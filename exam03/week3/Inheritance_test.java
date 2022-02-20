package exam03.week3;

public class Inheritance_test {

    public static void main(String[] args){

        Person person1 = new Person();
        person1.name = "홍길동";

        Staff staff1 = new Staff();
        staff1.name = "아무개";

        System.out.println(staff1.name);
   }
    
}
