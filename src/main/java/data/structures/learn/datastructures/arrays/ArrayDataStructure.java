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

        System.out.println(Arrays.toString(colors));// outputs: [purple, blue, green, null, null]


        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;

        System.out.println(Arrays.toString(numbers));

    }
}
