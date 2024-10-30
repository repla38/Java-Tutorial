package JavaTutorial.ForLoop;

public class Exercises {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int number = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
