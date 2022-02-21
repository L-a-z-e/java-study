package exam03.week3_2;

public class StaffTest {

    public static void main(String[] args){
        Staff 홍길동 = new Staff("홍길동",1111,"초등학교",2222);

        System.out.println("이름: "+홍길동.name);
        System.out.println("주민번호: "+홍길동.getNumber());
        System.out.println("학교명 : "+홍길동.schoolname);
        System.out.println("교원번호 :"+홍길동.number); // number 가 동일함 교원번호가 주민번호에 들어가는 현상
        
        Person person1 = 홍길동;
        System.out.println(person1.name);
        System.out.println(person1.number);

    }
    
}
