package data.structures.learn.datastructures.queue;

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
        queues();

    }

    public static void queues() {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alnitak", 21));// Note that Alnitak is the first one nad will be the first to be removed.
        queue.add(new Person("Angela", 36));
        queue.add(new Person("Alice", 27));

        System.out.println(queue.peek());// outputs: Person[name=Alnitak, age=21].... gp of the stackive the element at the to
        System.out.println(queue);// outputs: [Person[name=Alnitak, age=21], Person[name=Angela, age=36], Person[name=Alice, age=27]]
        System.out.println(queue.size());// outputs: 3 before poll()...
        System.out.println(queue.poll());// outputs: Person[name=Alnitak, age=21]... removes element at the top of the stack
        System.out.println(queue.size());// outputs: 2 after poll() methods
        System.out.println(queue.isEmpty());// outputs: false... because it has got elements

    }



    // Now we have a queue for people...

    // This is how you can use a queue implementation


    //


}
