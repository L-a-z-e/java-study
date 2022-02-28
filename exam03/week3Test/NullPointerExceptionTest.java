package exam03.week3Test;


class MyClass {
    public static final int num = 0;
    public static int numField;

    public static MyClass initT(){
        
        return null;

    }

    public void print(String s){
        System.out.println(s.toLowerCase());
    }
}
public class NullPointerExceptionTest {

    public static void main(String[] args){
        MyClass t = MyClass.initT();
        t.print("NullPointerExceptionTest");
    }

    
}


