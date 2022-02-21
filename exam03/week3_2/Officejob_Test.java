package exam03.week3_2;

public class Officejob_Test {

    public static void main(String[] args){

        Person man = new Person("홍길동",1111);
        System.out.println("이름 :"+ man.name + "주민번호 :"+man.number);

        Staff staff1 = new Staff("박하은",2222,"초등학교",3333);
        Person woman = staff1; // 교직원을 사람으로 업캐스팅

        System.out.println("이름 :"+woman.name+"주민번호 :"+woman.number);
        // System.out.println("학교명 :"+woman.schoolname); 하위 클래스 멤버 참조 불가
        System.out.println(staff1.schoolname);

        Officejob goodOffice = new Officejob("김김김", 3333, "중학교", 4444, "경영지원");
        Person person2 = goodOffice;
        Staff staff2 = goodOffice;

        System.out.println("----------");
        System.out.println("이름 : " + person2.name + "주민번호:"+person2.number);
        System.out.println("학교명: "+staff2.schoolname + "교원번호 :"+staff2.number+staff2.getNumber());
        System.out.println("부서 :"+goodOffice.Department);



    }
    
}
