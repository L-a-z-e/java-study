package exam03.week2;

public class Student {

    public String name ;

    public Student(){
        System.out.println("기본생성자 호출");
    }

    public Student(String name){
        System.out.println("이름 매개변수로 받는 생성자 호출");
        this.name = name;
    }
    
}
