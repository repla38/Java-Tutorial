package JavaTutorial.IfElse;

public class ShortHandIfElse {
    public static void main(String[] args) {
        
        /*   
        Syntax ->  variable = (condition) ? expressionTrue :  expressionFalse;
        */  
        
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int timeShortHand = 20;
        String result = (timeShortHand < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
