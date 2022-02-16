package exam03;

import java.util.Scanner;

public class Sam20 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        int i = 1;

        while(i < 10){
            System.out.println(dan + " x " + i + "=" + dan*i);
            i++;

        }

        do {
            System.out.println("한번은 수행");
            i++;
        }while (i<10);


    }
    
}
