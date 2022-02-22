package exam03.week3_2;

public class OverridingTest {

    public static void main(String[] args){
        Person man = new Person("홍길동",1111);
        Person woman = new Person("박하은",2222);

        man.printInformation();
        woman.printInformation();

        Staff manStaff = new Staff("아무개",3333,"campus",4444);
        manStaff.printInformation();

        Officejob manOfficejob = new Officejob("이순신",5555,"campus",6666,"경영");

        System.out.println("-------");
        Person[] personList = {man, woman, manStaff, manOfficejob};

        for (int i = 0 ; i < personList.length ; i++){
            personList[i].printInformation();
        }
    }
    
}
