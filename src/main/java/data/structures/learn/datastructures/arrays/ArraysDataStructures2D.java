package data.structures.learn.datastructures.arrays;

import java.util.Arrays;

public class ArraysDataStructures2D {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                board[i][j] = '-';// default value as dash... outputs: [[-, -, -], [-, -, -], [-, -, -]] when called

            }
        }
        // Print Array

        System.out.println(Arrays.deepToString(board));// use deepToString() for a 2D array to output correctly instead of toString()
        //outputs: [[-, -, -], [-, -, -], [-, -, -]]


    }
}
