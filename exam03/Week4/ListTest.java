package exam03.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("B");


        for(String str : arrayList){
            System.out.println(str);
        }
        System.out.println("-----");
        Collections.sort(arrayList);
        for(String str : arrayList){
            System.out.println(str);
        }

        System.out.println("--------");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("B");

        for(String str : linkedList){
            System.out.println(str);
        }

    }
    
}
