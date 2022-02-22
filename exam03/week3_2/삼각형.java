package exam03.week3_2;

public class 삼각형 extends 도형 {

    int 길이;
    int 높이;

    public 삼각형(int x, int y, int 길이, int 높이){
        super(x,y);
        this.길이 = 길이;
        this.높이 = 높이;

    }

    @Override
    public void draw(){

        System.out.println("좌표값 : ("+x+","+y+")");
        System.out.println("길이 : " + 길이 + " 높이 :"+ 높이);
        System.out.println("넓이 :" + 길이*높이/2);

    }
    
}
