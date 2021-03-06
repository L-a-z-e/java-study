package exam03.Week4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args){

    
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashSet.add("4");
        hashSet.add("2");
        hashSet.add("1");
        hashSet.add("3");
        hashSet.add("4");

        Iterator<String> hashSetIterator = hashSet.iterator();
        while(hashSetIterator.hasNext()){
            System.out.println(hashSetIterator.next());
        }

        System.out.println("------");
        linkedHashSet.add("4");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("2");

        Iterator<String> linkedHashSetIterator = linkedHashSet.iterator();
        while(linkedHashSetIterator.hasNext()){
            System.out.println(linkedHashSetIterator.next());
        }

        System.out.println("--------");

        treeSet.add("4");
        treeSet.add("3");
        treeSet.add("1");
        treeSet.add("2");

        Iterator<String> treeSetIterator = treeSet.iterator();
        while(treeSetIterator.hasNext()){
            System.out.println(treeSetIterator.next());
        }


    }

    
    
}
