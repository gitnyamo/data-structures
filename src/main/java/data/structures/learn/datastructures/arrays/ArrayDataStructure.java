package data.structures.learn.datastructures.arrays;

import java.util.Arrays;

public class ArrayDataStructure {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1]= "blue";

        System.out.println(Arrays.toString(colors));//outputs: [purple, blue, null, null, null]

        System.out.println(colors[0]);

        colors[2] = "green";

        System.out.println(Arrays.toString(colors));


        int[] numbers = {100, 200};

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[1]);


        //loop through using for loop
        System.out.println();
        System.out.println();
        System.out.println("Loop through using for loop");
        System.out.println();

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // loop through in reverse using for loop

        System.out.println();
        System.out.println("Loop through in reverse using for loop");
        System.out.println();

        for (int i = colors.length -1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        // check the length of your array
        System.out.println();
        System.out.println("What is the length of the colors array?");
        System.out.println(colors.length);// accessing the length of colors array


        //loop through using enhanced for loop
        System.out.println();
        System.out.println("Loop through using enhanced for loop instead of regular traditional for loop");
        System.out.println();

        for (String color : colors){
            System.out.println(color);
        }
        // loop through using stream method reference
        System.out.println();
        System.out.println("Using stream method reference to loop through elements");
        System.out.println();

        Arrays.stream(colors).forEach(System.out::println);


    }




}
