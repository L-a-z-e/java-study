package exam03.week3Test;

import java.util.Scanner;

public class Week3Test3 {

    public static void main(String[] args){

        Point[] points = new Point[10];
        for(int i=0 ; i < points.length ; i++){
            points[i]= new Point();
        }
        int minimumXY = 0;
        double myX;
        double myY;
        double tempX;
        double tempY;
        double[] distance = new double[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("내 좌표 X값을 입력해주세요.");
        myX = scanner.nextDouble();

        System.out.println("내 좌표 y값을 입력해주세요.");
        myY = scanner.nextDouble();

        for (int i = 0; i < points.length ; ){

            System.out.println((i+1)+"/10 번째 입력");
            System.out.println("임의의 좌표 x값을 입력해주세요.");
            tempX = scanner.nextDouble();
            System.out.println("임의의 좌표 y값을 입력해주세요.");
            tempY = scanner.nextDouble();
            

            for(int j = 0; j <= i ; j++){
                if(tempX == points[j].x){
                    if(tempY == points[j].y){
                        System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해주세요.");
                        i--;
                    }
                    
                }
                
            }
            points[i].x = tempX;
            points[i].y = tempY;
            // System.out.println(points[i].x+","+points[i].y); 확인용
            i++;

        }

        for (int i = 0 ; i < points.length ; i++){
            distance[i] = getDistance(myX,myY,points[i].x,points[i].y);
           //  System.out.println("거리는"+distance[i]); 확인용     
        }

        for (int i = 0 ; i < points.length ; i++){
            System.out.println("("+(int)points[i].x+","+(int)points[i].y+") =>"+distance[i]);
            double leastDistance = distance[0];
            if (leastDistance > distance[i]){
                minimumXY = i;
                leastDistance = distance[i];
            }
        }

        System.out.println("제일 가까운 좌표 :");
        System.out.println("("+(int)points[minimumXY].x+","+(int)points[minimumXY].y+") =>"+ distance[minimumXY]);


        scanner.close();



     
    }

    public static double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }
    

    


    
}

