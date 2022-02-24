package exam03.Week4;

public class Student implements Comparable<Student>{


    private int number;
    private String name;

    public Student (int number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return o.number - this.number;
    }
    
    @Override
    public String toString(){
        return String.format("학번 : %d, 이름 : %s", number,name);
    }
}
