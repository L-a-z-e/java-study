package exam03.week3_2;

public class Staff extends Person {


    public String schoolname;
    public long number; // 사원번호
    
    public Staff(){
        
    }

    public Staff(String name, long number, String schoolname, long staffnumber){
        super(name, number);
        this.schoolname = schoolname;
        this.number = staffnumber;

    }


    
}
