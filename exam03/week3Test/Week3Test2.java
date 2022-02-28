package exam03.week3Test;

import java.util.Scanner;

class Point {
     double x = 0;
     double y = 0;

    Point initPoint(double x, double y){
         x = this.x;
         y = this.y;

         return this;
         

     } 

} // 포인트 배열 저장하기 위해 클래스 선언

public class Week3Test2 {



    public void minimumDistance(double distance[]){

        for(int i=0;i<distance.length;i++){
            int minimum = 0;
            if (distance[i] < distance[minimum]){
                minimum = i;
            }
        }
    }

    public double calculateDistance(double x, double y,Point point){
        return Math.sqrt(Math.pow((x-point.x),2)+Math.pow((y-point.y),2));
    }




    public static void main(String[] args){

        double myX; // 나의 좌표 X
        double myY; // 나의 좌표 Y
        double distance[];
        Point point[] = new Point[10]; 

     
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("내 좌표 X값을 입력해주세요"); //나의 좌표 값 입력 X
        myX = scanner.nextDouble();
       
        System.out.println("내 좌표 Y값을 입력해주세요"); //나의 좌표 값 입력 Y
        myY = scanner.nextDouble();


        for (int i=0 ; i<10 ; i++){
            double tempX;
            double tempY;
            
            System.out.println((i+1) +"/10 번째 입력");
            System.out.println("임의의 좌표 x 값을 입력해주세요");
            tempX = scanner.nextDouble();
            System.out.println("임의의 좌표 y 값을 입력해주세요");
            tempY = scanner.nextDouble();
          
            for (int j = 0 ; j < i ; j++){
                if(point[j].x == tempX){
                    if(point[j].y == tempY){
                        System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해주세요.");
                        i--;
                        continue;
                    }
                }
            }
        
            try{
                point[i].initPoint(tempX, tempY);
            }catch(Exception e){
                e.printStackTrace();
            }



                // point[i].x = tempX;
               // point[i].y = tempY;
        }

        for (int i = 0 ; i < point.length ; i++)
        {
            System.out.println(point[i].x+","+point[i].y);
        }

        

        scanner.close();





    }

    
}
