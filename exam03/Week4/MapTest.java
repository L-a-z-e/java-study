package exam03.Week4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import javax.sound.sampled.SourceDataLine;

public class MapTest {

    public static void main(String[] args){

        HashMap<String, Object> hashMap = new HashMap<>();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Object> treeMap = new TreeMap<>();

        hashMap.put("B", "B-value");
        hashMap.put("D", "D-value");
        hashMap.put("A", "A-value");
        hashMap.put("C", "C-value");
        hashMap.put("D", "DD-value");

        for (String key : hashMap.keySet()){

            System.out.println(key + " : " + hashMap.get(key));

        }

        linkedHashMap.put("B", "B-value");
        linkedHashMap.put("D", "D-value");
        linkedHashMap.put("A", "A-value");
        linkedHashMap.put("C", "C-value");
        linkedHashMap.put("D", "DD-value");

        for (String key : linkedHashMap.keySet()){
            System.out.println(key + ":" + linkedHashMap.get(key));
        }

        treeMap.put("B", "B-value");
        treeMap.put("D", "D-value");
        treeMap.put("A", "A-value");
        treeMap.put("C", "C-value");
        treeMap.put("D", "DD-value");

        for (String key : treeMap.keySet()){
            System.out.println(key + ":" + treeMap.get(key));
        }





    }
    
}
