package exam03.Week4;

public class Sample02 {

    public static boolean isHongGilDong(String str){
        if (str.equals("홍길동")){

            return true;
        }else{
            return false;
        }
    }

    public static boolean isHongGilDong2(String str){
        if("홍길동".equals(str)){
            return true;
        }else{
            return false;

        }
    }


    public static boolean isHongGilDong3(String str){
        if(str != null && str.equals("홍길동")){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){

        String str1 = "홍길동";
        String str2 = "이순신";
        String str3 = null;

        if (str1 == str2){

        }

        if (str1.equals(str2)){

        }

        if (str2.equals(str1)){

        }

        System.out.println(isHongGilDong(str1));
        System.out.println(isHongGilDong(str2));
        System.out.println(("홍길동".equals(str3))); 
        System.out.println("--------");
        //sysout(isHongGilDong(str3)) NullPointerExecption
        // str 인스턴스가 존재할때만 비교가능하기에 null이면 NullPointerException 발생
        System.out.println(isHongGilDong2(str1));
        System.out.println(isHongGilDong2(str2));
        System.out.println(isHongGilDong2(str3));
        System.out.println("--------");
        System.out.println(isHongGilDong3(str1));
        System.out.println(isHongGilDong3(str2));
        System.out.println(isHongGilDong3(str3));
    }
    
}
