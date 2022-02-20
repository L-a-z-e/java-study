package exam03.week2;

public class Student2 {

    public String name;
    public int age;
    public String major;
    public String gender;

    public Student2(){};
    public Student2(String name){
        this.name = name;
    }

    public Student2(String name, int age){
        this(name);
        this.age = age;
    }

    public Student2(String name, int age, String gender){
        this(name,age);
        this.gender = gender;
    }

    public Student2(String name, int age, String gender, String major){
        this(name,age,gender);
        this.major = major;
    }
    
}
