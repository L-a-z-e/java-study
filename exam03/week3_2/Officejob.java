package exam03.week3_2;

public class Officejob extends Staff {

    public String Department;

    public Officejob(String name, long number, String schoolname, long staffnumber, String Department){
        super(name,number,schoolname,staffnumber);
        this.Department = Department;
    }

    @Override
    public void printInformation(){
        System.out.println("이름 :" +name);
        System.out.println("주민번호 :"+ getNumber());
        System.out.println("학교명 :"+schoolname);
        System.out.println("사원번호 :"+number);
        System.out.println("부서 :"+Department);
    }    


    }
    

