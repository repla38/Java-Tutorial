package JavaTutorial.TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // int myInt = 9;
        // double myDouble = myInt; // Automatic casting: int to double

        // System.out.println(myInt);      //  Outputs 9
        // System.out.println(myDouble);   //  Outputs 9.9

        double myDouble = 9.78d;
        int myInt = (int) myDouble; //  Manual casting: double to int

        System.out.println(myDouble);   //  Outputs 9.78
        System.out.println(myInt);      //  Outputs 9

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}
