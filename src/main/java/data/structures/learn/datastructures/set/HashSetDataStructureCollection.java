package data.structures.learn.datastructures.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDataStructureCollection {
// Hashset is unordered... If you need order in a set use TreeSet
    public static void main(String[] args) {
        Set<Ball> uniqueBalls = new HashSet<>();
        uniqueBalls.add(new Ball("blue"));
        uniqueBalls.add(new Ball("red"));
        uniqueBalls.add(new Ball("pink"));
        uniqueBalls.add(new Ball("maroon"));
        uniqueBalls.add(new Ball("blue"));
        uniqueBalls.remove(new Ball("red"));

        System.out.println(uniqueBalls.size());
        System.out.println();
        uniqueBalls.forEach(System.out::println);// To print uniquely you need to override the equal method in the Ball class.. also override toString method in the Ball class.

    }
}
