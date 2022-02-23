package exam03.Week4;

public class 스트링버퍼테스트 {

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();
        sb.append("홍길동");
        sb.append(System.lineSeparator());
        sb.append("학생");
        sb.append(System.lineSeparator());
        sb.append(20).append(30);

        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("이순신");
        sb2.append("장군").append(80);

        System.out.println(sb2);

        String name = "홍길동";
        String dept = "학생";
        int age = 20;

        StringPlus sp = new StringPlus();
        sp.append(String.format("이름 : %s", name));
        System.out.println(sp.toString());
        sp.appendLine(dept).appendFormat("이름 : %s", name);;
      
        System.out.println(sp.toString());
    
    }
    
}
