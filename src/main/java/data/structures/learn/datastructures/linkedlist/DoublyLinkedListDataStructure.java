package data.structures.learn.datastructures.linkedlist;

import data.structures.learn.datastructures.queue.Person;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * */
public class DoublyLinkedListDataStructure {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 24));
        linkedList.add(new Person("Alenne", 25));
        linkedList.add(new Person("Anita", 23));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());// iterates and prints all objects..i.e using hasNext() prints true and never stops...
            /* outputs:
            * Person[name=Alex, age=24]
              Person[name=Alenne, age=25]
              Person[name=Anita, age=23]
              *
              * use hasNext() only to condition then do an action of ....next()

            * */
        }

        // If you want the reverse... do the following

        System.out.println();
        System.out.println(" Print backward from last to first");

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());// be careful not to use hasPrevious because it will print true none stop..

            //outputs:
            /*
            *Person[name=Anita, age=23]
             Person[name=Alenne, age=25]
             Person[name=Alex, age=24]
            *
            * */
        }

    }
}

// Note that using linkedlist can be very costly because internally it uses doubly linkedlist and consumes a lot of memory
