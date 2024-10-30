package JavaTutorial.Arrays;

public class Examples {
    public static void main(String[] args) {
        
        ////////////////////////////
        // Average of different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age: ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);

        /////////////////////////
        // Finding the lowest age
        
        // Create lowest age int and give it an initial value that is first element of the array
        int lowestAge = ages[0];

        // Loop through the elements to find the lowest age
        for (int age : ages) {
            if (lowestAge > age) {
                // If there is a lower value,update the lowest age value
                lowestAge = age;
            }
        }
        // Print the lowest age
        System.out.println(lowestAge);
    }
}
