import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Instruction 1: Prompts the user for a string 
        System.out.print("Enter a String: ");
        String inputString = scanner.\n();

        // Instruction 2: Prompts the user for a character to search
        System.out.print("Enter a character to count: ");
        char targetChar = scanner.\n().charAt(0);

        // Instruction 3: Counts the appearing times of the character
        int count = 0;
        for (int i = 0;i < inputString.length();i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        // Instruction 4: Displays the output
        System.out.println("The character '" + targetChar + "' appears " + count + "time" + (count != 1 ? "s" : "") + "in the string.");

        scanner.close();
