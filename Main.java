import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        char[] text = userInput.toCharArray();
        int counter = 0;
        
        for (char letter : text) {
            if (letter == 'a') {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}