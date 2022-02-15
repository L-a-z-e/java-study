package exam03;

public class Sam06 {
    public static void main(String[] args){
        int i1 = 10;
        long l1 = 20L;
        long l2 = 0x7fff_ffff_ffff_ffffL; // L 안붙이면 에러 -> int형으로 인식해서 l 붙여줘야함
        double d1 = 3.1d;
        double d2 = 3.1E2;
        double d3 = 0x1.1P3;
        char c1 = '가';
        String str1 = "문자열";

        System.out.println(d2);
        System.out.println(d3);
    }
}
