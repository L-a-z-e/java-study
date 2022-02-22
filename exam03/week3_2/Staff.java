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
    
    @Override
    public void printInformation(){
        System.out.println("이름 :" +name);
        System.out.println("주민번호 :"+super.number);
        System.out.println("학교명 :"+schoolname);
        System.out.println("사원번호 :"+number);
    }


    
}
