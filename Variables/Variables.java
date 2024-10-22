package JavaTutorial.Variables;

public class Variables {
    static public void main(String[] args) {
        //  Syntax
        //  type variableName = value;

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        myNum = 20; //  myNum is now 20
        System.out.println(myNum);

        //  final keyword prevents overwriting
        final int myNum1 = 15;
        System.out.println(myNum1);

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    }
}
