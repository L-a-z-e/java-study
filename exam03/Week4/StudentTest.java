package exam03.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    public static void main(String[] args){

        List<Student> students = new ArrayList<>();

        students.add(new Student(2, "홍길동2"));
        students.add(new Student(1, "홍길동1"));
        students.add(new Student(3, "홍길동3"));
        students.add(new Student(5, "홍길동5"));
        students.add(new Student(4, "홍길동4"));

        for(Student student : students){
            System.out.println(student.toString());
        }

        Collections.sort(students);
        for(Student student : students){
            System.out.println(student.toString());
        }


    }
    
}
