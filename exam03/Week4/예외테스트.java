package exam03.Week4;


public class 예외테스트 {


    public static void method1(int i, int j) throws Exception{
        if(j==0){
            throw new Exception("0으로 나눌 수 없습니다.");
        }

        int k = i / j;
        System.out.println(k);
    }
    public static void main(String[] args){

        try{
        method1(1, 0);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    
}
