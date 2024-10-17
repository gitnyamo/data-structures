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
        System.out.println(Arrays.deepToString(board)); //outputs: [[-, -, -], [-, -, -], [-, -, -]]
        // The code right below is just the same as the one above, just constructed in a a little bit different way
        char[][] boardTwo = new char[][] {
                new char[] {'0','-','-'},
                new char[] {'0','-','-'},
                new char[] {'0','-','-'}
        };
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));// use deepToString() for a 2D array to output correctly instead of toString()
        //outputs: [[0, -, -], [0, -, -], [0, -, -]]
        System.out.println(Arrays.deepToString(boardTwo));//outputs: [[0, -, -], [0, -, -], [0, -, -]]



    }
}
