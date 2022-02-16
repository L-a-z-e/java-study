package exam03;
// 1주차 과제 1번
public class Test01_01 {
    public static void main(String[] args){
        // 조건1 - 이름의 char를 유니코드로 형변환하지 말고,유니코드값의 Character.MIN_VALUE 부터 Character.MAX_VALUE 까지를 반복하면서 코드값을 비교할 것
        char startValue = Character.MIN_VALUE;
        char endValue = Character.MAX_VALUE;
        char[] name = {'문','선','일'};

        // 조건2 - 반복문은 한번만 사용할 것
        for(int i=0; i < name.length ; i++){
            for (int j = startValue; j <= endValue ; j++){
                if(name[i]==j){
                    System.out.printf("0x%X ",(int)j);
                    break; 
                    // 조건3 - 반복문을 사용할때,이름의 코드값을 모두 찾았으면,더이상 반복문을 실행하지 않고 종료할 것
                }
            }
        }
    }       
}