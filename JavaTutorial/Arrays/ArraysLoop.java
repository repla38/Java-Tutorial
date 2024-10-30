package JavaTutorial.Arrays;

public class ArraysLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // For-Each
        for (String i : cars) {
            System.out.println(i);
        }
    }
}