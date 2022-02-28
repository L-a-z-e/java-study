package exam03.week3_2;

public class Fruit_Test {

    public static void checkFruit(Fruit check){

        if (check instanceof Fruit){
            System.out.println("과일입니다.");
            if (check instanceof Apple){
                System.out.println("사과입니다.");
            }else if (check instanceof Banana){
                System.out.println("바나나입니다.");
            
        }else{
            System.out.println("과일이 아닙니다.");
        }
        }
        

    }

    public static void main(String[] args){

        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Apple();
        Fruit fruit3 = new Banana();

        checkFruit(fruit1);
        checkFruit(fruit2);
        checkFruit(fruit3);


        // Fish fish1 = new Fish();
        // checkFruit(fish1); 상속관계가 없으므로 에러


        
        
    }
    
}
