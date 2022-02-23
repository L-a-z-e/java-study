package exam03.Week4;

public class 문자열테스트 {

    public static void printMethod(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args){

        System.out.println("TEST!");

        String url = "https://Naver.com/";

        final String naverUrl = "https://naver.com/";

        int urlLength = url.length();
        System.out.println("문자열 길이: "+urlLength);

        for (int i = 0; i< url.length() ; i++){
            System.out.println(url.charAt(i));
        }

        for (char c1 : url.toCharArray()){

            printMethod(c1);
        }

        printMethod(url.contains("http"));
        printMethod(url.indexOf("http"));
        printMethod(url.lastIndexOf(".com"));

        printMethod(url.toLowerCase());
        printMethod(url.toUpperCase());
        printMethod(url.trim());

        printMethod(url.equals(naverUrl));
        printMethod(url.equalsIgnoreCase(naverUrl));

        String url1 = "http://www.naver.com/news/tv/sbs";

        String[] url1List = url1.replaceAll("http://www.naver.com", "").split("/");

        for ( String str : url1List ){
            printMethod(str);

        }

        printMethod(url1.concat("/index.html"));
        // mariadb, mysql 문자열 조합일때 concat 쓰는데 java에서는 단독으로 잘 안씀

        printMethod(url.substring(8,13));

        String v1 = "88";
        String v2 = String.valueOf(12);
        int n1 = Integer.valueOf(v1);
        printMethod(n1);
        printMethod(v2);


        String str2 = "홍길동";
        String str3 = "이순신";

        printMethod(str2.compareTo(str3));
        printMethod(str3.compareTo(str2));




    }
    
}
