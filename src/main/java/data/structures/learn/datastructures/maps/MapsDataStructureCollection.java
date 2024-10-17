package data.structures.learn.datastructures.maps;

// A map cannot contain duplicate keys.
// Each key can map to at most one value

import data.structures.learn.datastructures.queue.Person;

import java.util.HashMap;
import java.util.Map;

public class MapsDataStructureCollection {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex", 21));
        map.put(2, new Person("Maria", 32));
        map.put(3, new Person("Alex", 23));
        map.put(2, new Person("Anita", 19));// This overrides the values in key 2 on the map which in this case is Maria....
        map.put(4, new Person("Alice", 22));

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);

        // You could output this way...
        System.out.println();
        map.entrySet().forEach(System.out::println);

        // or you could use a lambda to output ....
        System.out.println();
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey()+ " " + x.getValue()));

        // You could also do....
        System.out.println();
        map.forEach(((key, person) -> {
            System.out.println(key + " - " + person);
        }));

        System.out.println(map.get(3));// it will be null if it is not present

        System.out.println(map.getOrDefault(3, new Person("default", 0)));// if key 3 is default and not available it auto default to "default" "0"

        System.out.println(map.values());
        System.out.println(map.keySet());// with sets there shouldn't be any duplicates in it.


    }
    // This is how to work with maps in Java ----in brief.

}
