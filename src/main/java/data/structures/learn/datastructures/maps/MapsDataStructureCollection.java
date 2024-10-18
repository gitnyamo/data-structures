package data.structures.learn.datastructures.maps;

// A map cannot contain duplicate keys.
// Each key can map to at most one value

import data.structures.learn.datastructures.queue.Person;

import java.util.HashMap;
import java.util.Map;

public class MapsDataStructureCollection {

    public static void main(String[] args) {
        maps();
        diamondMaps();

    }

    public static void diamondMaps() {
        Map<Person, Diamond> diamondMap = getPersonDiamondMap();

        System.out.println();
        System.out.println("****************************");
        System.out.println("Diamonds");
        System.out.println("*****************************");

        diamondMap.entrySet().forEach(System.out::println);

        System.out.println(diamondMap.get(new Person("Mark", 38)));// if you do not use override hashcode, this will print null even though the name of that key exists...
        // Take note that override toString() in pojo and hashcode in pojo classes is really important especially when working with collections coding... reduces amount of time used o code


    }

    private static Map<Person, Diamond> getPersonDiamondMap() {
        Map<Person,  Diamond> diamondMap = new HashMap<>();
        diamondMap.put(new Person("Arica", 37), new Diamond("Treated Diamonds", "South Africa"));
        diamondMap.put(new Person("Anita", 21), new Diamond("Emerald Diamond", " Ghana"));
        diamondMap.put(new Person("Olekuye", 29), new Diamond("Oval Diamond", "Algeria"));
        diamondMap.put(new Person("Kisha", 35), new Diamond("Heart Diamond", "South Arabia" ));
        diamondMap.put(new Person("Mark", 38), new Diamond("VS1", "USA"));
        return diamondMap;
    }

    public static void maps() {

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
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        // You could also do....
        System.out.println();
        map.forEach(((key, person) -> {
            System.out.println(key + " - " + person);
        }));


        System.out.println(map.get(3));// it will be null if it is not present

        System.out.println(map.getOrDefault(3, new Person("default", 0)));// if key 3 is default and not available it auto default to "default" "0"

        System.out.println(map.values());
        System.out.println(map.keySet());// with sets there shouldn't be any duplicates in it.


        // This is how to work with maps in Java ----in brief.

    /*Something you should know when working with map


    *

    hashcode means mapping an object to its integer value.....

    *With maps lookups are really very fast because of the hashcode.
    Internally it uses hash function -> hashcode which generates the key numbers mapping.. no matter how many
     times you call it once generated it will produce the same key assigned internally by hashcode for a given function call or map.

    * */

    }
}