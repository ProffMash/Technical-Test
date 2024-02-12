/* Question 5: Reverse Integer
Write a program that takes an integer as input and returns an integer with reversed digit ordering.
Examples:
For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19. */

import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        scanner.close();
        int output = reverse(input);

        System.out.println("The reversed integer is: " + output);
    }
    public static int reverse(int n) {
        int result = 0;
        while (n != 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        return result;
    }
}
