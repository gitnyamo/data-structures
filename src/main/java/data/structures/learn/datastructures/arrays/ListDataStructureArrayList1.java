package data.structures.learn.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
// Note: ArrayList is backed by Array... They internally use Array

public class ListDataStructureArrayList1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();// To work with a certain type make sure you pass it.
        colors.add("Purple");
        colors.add("blue");
        colors.add("yellow");


        System.out.println(colors.size());// outputs: 3
        System.out.println(colors.contains("yellow"));// outputs: true
        System.out.println(colors.contains("pink"));// outputs: false
        System.out.println();
        System.out.println("Below is the array output of a list");
        System.out.println(colors);// outputs: [Purple, blue, yellow]
        System.out.println();

        System.out.println(" different ways to Loop through the colors: ");
        System.out.println();

        // 1st way to loop in a list...looking or looping through the arraylist
        //loop using for each... regular.
        System.out.println("Regular for each");
        for (String color : colors) {// for each color print in a new line the color.
            System.out.println(color);/* outputs: Purple
                                                  blue
                                                  yellow
 */

        }
        //2nd way you can loop through a lit using the stream foreach....
        System.out.println("loop using for each stream...");
        colors.forEach(System.out::println);

        //3rd way (to loop through a list using the get() and passing the counter to get the list using indices
        System.out.println();
        System.out.println("Loop using traditional get()");
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));// use dot get index then pass i inside to get the list.
        }
        // Note: All the 3 above ways gives the same results.... just choose one that is  more efficient for future scalability
        // and considering your use case too.

        //Note: If you want to do an immutable list... do it as below
       List<String> colorUnModified = List.of(
               "blue",
               "yellow"
       );

        colorUnModified.add("pink");// Note: adding this or any addition will throw an error and wont work error type: .UnsupportedOperationException

        System.out.println("");
        System.out.println(colorUnModified);
        System.out.println(colorUnModified.size());
    }



}
