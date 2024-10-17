package data.structures.learn.datastructures.arrays;

import java.util.Arrays;

public class ArraysDataStructures2D {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                board[i][j] = '-';// note that we are filling the board with a default value of dash using single quated because it;s char data type.

            }
        }
        // Print Array
        System.out.println(Arrays.toString(board));// Do not use this to ouput a 2D Array
        System.out.println(Arrays.deepToString(board));// always use deepToString to output a 2D array.,,, /note it outputs the default dashes passed in
        // Below is an assumption of the 3D where we have each box filled with a dash as default value...
        System.out.println("___________________");
        System.out.println("|  -  |  -  |  -  |");
        System.out.println("___________________");
        System.out.println("|  -  |  -  |  -  |");
        System.out.println("___________________");
        System.out.println("|  -  |  -  |  -  |");
        System.out.println("___________________");
    }
}
