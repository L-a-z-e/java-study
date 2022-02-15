package exam03;

public class Sam04 {
    public static void main(String[] args){
        int iMax = 0x7f_ff_ff_ff;
        int Overflow = iMax + 1;
        int Underflow = Overflow - 1 ;

        System.out.println(iMax);
        System.out.println(Overflow);
        System.out.println(Underflow);

        // -2^31 ~ 2^31 -1 범위
    }
}
