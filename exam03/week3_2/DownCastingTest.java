package exam03.week3_2;

public class DownCastingTest {

    public static void main(String[] args){

        Person man = new Person("홍길동",1111); // Person 클래스 super class
        System.out.println("이름 : "+ man.name + "주민번호 : "+ man.number); // 이름, 주민번호 
        System.out.println("-----");

        Staff manStaff = new Staff("김", 1234, "campus", 5678); // Staff 클래스 sub class
        System.out.println(manStaff.name + manStaff.schoolname + manStaff.getNumber() +manStaff.number); // manStaff 멤버 변수 출력
        System.out.println("------"); // 줄바꿈
        Person manStaffDownCasting = manStaff; // manStaff 라는 Staff 클래스 업캐스팅 하위 클래스는 상위 클래스형 변수에 대입 가능
        System.out.println(manStaffDownCasting.name+manStaffDownCasting.number); // 이름, 주민번호만 남는 상태
        System.out.println("------");

        manStaff = (Staff)manStaffDownCasting;
        Staff manStaff1 = (Staff)manStaffDownCasting;
        System.out.println(manStaff1.name + manStaff1.schoolname + manStaff1.getNumber() +manStaff1.number); 
        System.out.println(manStaff.name + manStaff.schoolname + manStaff.getNumber() +manStaff.number); 


        Person man1 = new Person("오류",1122);
        Staff errorMan1 = (Staff)man1;
        

        // Staff staff1 = man; 형변환이 없어서 컴파일 오류
        //Staff staff1 = (Staff) man;
        // System.out.println(staff1.name+staff1.getNumber()+staff1.number);
        // System.out.println("------");
        //System.out.println(staff1.name);
/*
        // System.out.println("학교명 : " + staff2.schoolname); java.lang.ClassCastException:

        Staff staffman = new Staff("홍길동", 1111, "schoolname", 2222);
        System.out.println("-----------");
        System.out.println(staffman.name + staffman.schoolname);

        Person personMan = staffman;

        System.out.println("----------");
        System.out.println(personMan.name);
*/

    }
    
}
