package exam03.week2;

public class Student2_Test {

    public static void main(String[] args){
        Student2 newbie1 = new Student2();
        Student2 newbie2 = new Student2("홍홍홍");
        Student2 newbie3 = new Student2("홍홍홍",20);
        Student2 newbie4 = new Student2("홍홍홍",20,"남");
        Student2 newbie5 = new Student2("홍홍홍",20,"남","컴퓨터공학과");
         
        System.out.println(newbie1);
        System.out.println(newbie2.name+newbie2.age+newbie2.gender+newbie2.major);
        System.out.println(newbie3.name+newbie3.age+newbie3.gender+newbie3.major);
        System.out.println(newbie4.name+newbie4.age+newbie4.gender+newbie4.major);
        System.out.println(newbie5.name+newbie5.age+newbie5.gender+newbie5.major);
    }
    
}
