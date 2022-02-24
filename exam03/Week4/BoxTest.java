package exam03.Week4;

public class BoxTest {
    
    public static void main(String[] args){
        Box<String> b1 = new Box<String>();
        b1.setBox(("홍길동"));

        String name = b1.getBox();
        System.out.println(name);

        Box<Integer> b2 = new Box<Integer>();
        b2.setBox(25);
        Integer age = b2.getBox();
        System.out.println(age);

        Box2<String> b3 = new Box2<String>();
        b3.setData("이름");
        String name2 = b3.getData();
        System.out.println(name2);

        Box2<String> b4 = new Box2<String>();
        b4.setLastData("성별");
        String gender = b4.getLastData();
        System.out.println(gender);

        Box3<String, Integer> b5 = new Box3<>();
        b5.setData("홍길동", 25);

        String name3 = b5.getName();
        Integer age3 = b5.getAge();
        System.out.println(name3 + age3);

        System.out.println(b5.getName());
        System.out.println(b5.getAge());




    


        
    }
}
