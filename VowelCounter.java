/* Question 6: Count Vowels
Write a program that counts the number of vowels in a sentence.
eg " Hello World " => returns 2 */

import java.util.Scanner;
public class VowelCounter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = 0;
        for (char ch : sentence.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }
        System.out.println(sentence + " => " + vowelCount);
    }
}
