package data.structures.learn.datastructures.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * FIFO (First in First Out)
 * A collection designed for holding elements prior to processing.
 *  - Head-- Take elements from the head
 *  - Tail-- insert items from the tail
 *
 *  Example of a queue is when you sent printing items work into the printer... Printer is a first in first out.
 *
 * */
public class QueueDataStructure {

    public static void main(String[] args) {
        Queue<Person> farmer = new LinkedList<>();
        farmer.add(new Person("Alnitak", 21));// Note that Alnitak is the first one nad will be the first to be removed.
        farmer.add(new Person("Angela", 36));
        farmer.add(new Person("Alice", 27));

        System.out.println(farmer.peek());// outputs: Person[name=Alnitak, age=21].... gp of the stackive the element at the to
        System.out.println(farmer);// outputs: [Person[name=Alnitak, age=21], Person[name=Angela, age=36], Person[name=Alice, age=27]]
        System.out.println(farmer.size());// outputs: 3 before poll()...
        System.out.println(farmer.poll());// outputs: Person[name=Alnitak, age=21]... removes element at the top of the stack
        System.out.println(farmer.size());// outputs: 2 after poll() methods
        System.out.println(farmer.isEmpty());// outputs: false... because it has got elements
    }


    // Now we have a queue for people...

    // This is how you can use a queue implementation

}
