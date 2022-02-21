package exam03.week3_2;

public class Person {

    public String name;
    public long number; // 주민번호

    public Person(){
        
    }
  
    public Person(String name, long number){
        this.name = name;
        this.number = number;
    }

    public long getNumber(){
        return number;
    }
}
