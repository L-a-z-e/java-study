package exam03.week3_2;

public class Sum {

    public int add(int value1, int value2 ){
        return value1 + value2;
    }

    public int add(int value1, int value2, int value3){
        return value1 + value2 + value3;
    }

    public long add(int[] value, int numberOfValue){
        int sum = 0;
        for (int i=0; i<numberOfValue ; i++){
            sum += value[i];
        }

        return sum;

    }
    
}
