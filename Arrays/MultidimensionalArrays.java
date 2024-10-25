package JavaTutorial.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}};

        // Print one value
        System.out.println(myNumbers[1][2]); // Outputs 7

        // Change an element
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        // For loop through the mutidimensional array and print its elements
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        for (int [] row: myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
