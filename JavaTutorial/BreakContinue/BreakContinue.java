package JavaTutorial.BreakContinue;

public class BreakContinue {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }         
    }
}
