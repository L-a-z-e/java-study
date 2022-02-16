package exam03;

public class Sam16 {

    public static void main(String[] args){

        int age = 15;
        String item = "";
        //성인인지 확인
        if (age > 19){
            item = "아이템1";
        }
        else if(age > 14){
            item = "아이템3";
        }
        else {
            item = "아이템2";
        }

        System.out.println(item);
        System.out.println("Item:"+item);
    }
    
}
