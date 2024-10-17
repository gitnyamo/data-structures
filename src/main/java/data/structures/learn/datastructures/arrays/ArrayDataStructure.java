package data.structures.learn.datastructures.arrays;

import java.util.Arrays;

public class ArrayDataStructure {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1]= "blue";

        System.out.println(Arrays.toString(colors));//outputs: [purple, blue, null, null, null]

        System.out.println(colors[0]);// outputs: purple....This is accessing index... In this case accessing the 1st element of the array

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
    }
}
