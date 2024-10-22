package JavaTutorial.Strings;

public class Concatenation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        //  Concat
        System.out.println(firstName.concat(lastName));     //  Outputs "JohnDoe"
    }
}
