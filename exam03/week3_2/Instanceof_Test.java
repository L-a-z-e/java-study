package exam03.week3_2;

public class Instanceof_Test {
    public static void main(String[] args){
    Person man = new Person("홍길동",1111);
    Staff manStaff = new Staff("홍길동",1111,"campus",2222);
    

    System.out.println("man instanceof Person"+(man instanceof Person));
    System.out.println("man instanceof Staff"+(man instanceof Staff));
    System.out.println("manStaff instanceof Person"+ (manStaff instanceof Person));
    System.out.println("manStaff instanceof Staff"+ (manStaff instanceof Staff));
    }
    
}
