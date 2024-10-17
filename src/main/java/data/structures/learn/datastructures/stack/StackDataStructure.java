package data.structures.learn.datastructures.stack;

import java.util.List;
import java.util.Stack;

/** Stack Data Structure
 *
 * The Stack class represents a last-in-first-out (LIFO) stack of objects.
 * It extends class `Vector` with five operations that allow a vector to be treated as a stack.
 * The usual 'push' and 'pop' operations are provided,
 * as well as 'peek' at the top item on the stack, a method
 * to test for whether the stack is empty,and a method to search the stack for an item
 * and discover how far it is from the top.
 *
 * */
public class StackDataStructure {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println(stack);

        System.out.println("peek");
        System.out.println(stack.peek());
        System.out.println(stack.size());// This outputs: 5
        System.out.println(stack.pop());
        System.out.println(stack.size());// This outputs: 4 after the pop() has occurred.
        System.out.println(stack.isEmpty());// outputs: false


        // Note, you can use the List and implement stack.. i.e
        List<Integer> listStack = new Stack<>();// showing stack implements list interce... You just change push() to add() for elements
        listStack.add(9);
        listStack.add(10);

        System.out.println(listStack.size());
        System.out.println(listStack);
    }

    //Note: Stack extends Vector and Vector implements Lists.  the size of a vector can grow or shrink... Vector is synchronized.
    // Need to use something that is not synchronized, then go for ArrayList for the non synchronized.







}
