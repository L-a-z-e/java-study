package exam03.week2;

public class 신용카드{
    public long 카드번호;
    public String 카드소유주;

    public long 카드사용누적금액;
    public long 누적포인트;

    public void 카드사용(long 카드사용금액){

        카드사용누적금액 += 카드사용금액;

    }

    //카드사용

    public void 카드비용지급(long 지급금액){
        카드사용누적금액 -= 지급금액;
        long 적립포인트 = 지급금액 / 1000;
        포인트적립(적립포인트);
    }
    //카드 비용 지급

    private void 포인트적립(long 포인트금액){
        누적포인트 += 포인트금액;

    }

    //포인트 적립
}