package exam03.week3_2;

public class 사각형 extends 도형 {

    int 길이;
    int 높이;

    
    public 사각형 (int x, int y, int 길이, int 높이){
        super(x,y);
        this.길이 = 길이;
        this.높이 = 높이;
    }

    @Override
    public void draw(){
        System.out.println("X,Y 좌표 : ("+x+","+y+")");
        System.out.println("넓이 = "+ 길이*높이);

    }
    
}
