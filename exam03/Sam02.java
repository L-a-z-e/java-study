package exam03;

public class Sam02 {
    public static void main(String[] args) {
        int i1 = 0b0000_0000_0000_0000_0000_1100_0000_0000;
        int i2 = 0b1000_0000_0000_0000_0000_1100_0000_0000;
        
        System.out.println(i1);
        System.out.println(i2);
        // 보수 구하기
        int j1 = 0b0000_0000_0000_0000_0000_0000_0000_1100;
        int j1_1 = 0b1111_1111_1111_1111_1111_1111_1111_0011; // i1에 대한 1의보수
        int j2 = 0b1111_1111_1111_1111_1111_1111_1111_0100; // i1에 대한 2의 보수 = 1의보수 + 1
        int j3 = 0b0000_0000_0000_0000_0000_0000_0000_0000;

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        
    }    
}
