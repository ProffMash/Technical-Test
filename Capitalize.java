/* Question 4: Capitalize Words
Write a program that accepts a string as input, capitalizes the first letter of each word in the string, and then returns the result string.
Examples:
"hi"=> returns "Hi"
"i love programming"=> returns "I Love Programming"*/

import java.util.Scanner;
public class Capitalize{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        String output = capitalizeWords(input);
        System.out.println(input + " => " + output);
    }
    private static String capitalizeWords(String input){
        StringBuilder output = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()){
            if (Character.isWhitespace(c)){
                capitalizeNext = true;
                output.append(c); // Append the whitespace
            } 
            else if (capitalizeNext){
                output.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } 
            else{
                output.append(Character.toLowerCase(c));
            }
        }
        return output.toString();
    }
}
