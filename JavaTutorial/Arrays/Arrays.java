package JavaTutorial.Arrays;

public class Arrays {
    public static void main(String[] args) {
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(myNum[0]);

        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs OPel instead of Volvo

        System.out.println(cars.length);
        // Outputs 4
    }
}
