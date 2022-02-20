package exam03.week2;

public class Circle {

    //원 넓이 , 둘레
    
    double radius;
    double pi=3.14;

    public Circle(double radius){

        this.radius = radius;


    }

    public double getArea(){
        double Area = radius * radius * pi;
        return Area;
    }

    public double getPerimeter(){
        return 2*pi*radius;
    }
    
}
