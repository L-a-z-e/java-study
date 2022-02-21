package exam03.week3_2;

public class Officejob extends Staff {

    public String Department;

    public Officejob(String name, long number, String schoolname, long staffnumber, String Department){
        super(name,number,schoolname,staffnumber);
        this.Department = Department;
    }
    
}
