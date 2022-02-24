package exam03.Week4;

public class GetMethodTest {

    public static void main(String[] args){

        String[] names = {"자바","파이썬","씨쁠쁠","씨샵","자바스크립트"};
        Double[] scores = {100D,98D,95D,90D,150D};

        GetMethod getMethod = new GetMethod();
        getMethod.print(names);
        getMethod.print(scores);

        getMethod.firstStringPrint(names[2]);
        // getMethod.firstStringPrint(scores[1]);
    }
    
}
