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


        int[] numbers = {100, 200};// use this example when you know the elements your array is going to have

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[1]);// accessing the 2nd element of the array.... outputs works upto here with no exception

        numbers[2] = 300;// assigning this to the array, and calling it will give you an ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(numbers));// Calling this gives you exception since the array was initially assigned oly to 2 elements.. Array are fixed
    }
}
