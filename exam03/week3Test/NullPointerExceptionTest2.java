package exam03.week3Test;

class MyClass {
    int num = 100;
    public static MyClass initMyClass(){
        return null;
    }

    public void print(String s){
        System.out.println(s.toUpperCase());
    }
}
public class NullPointerExceptionTest2 {
    public static void main (String[] args){

        MyClass t = MyClass.initMyClass();
        int number = t.num;
        System.out.println(number);
        t.num = 10;

        t.print("NullPointerExceptionTest");
       
    
}

}

