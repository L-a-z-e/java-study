package exam03.week2;

public class Student_Test {
    public static void main(String[] args){
        Student studyingStudent = new Student(); // 기본 생성자
        studyingStudent.name = "아무개";

        System.out.println(studyingStudent.name);


        Student studyingStudent2 = new Student("홍길동");
        System.out.println(studyingStudent2.name);
    }
    
}
