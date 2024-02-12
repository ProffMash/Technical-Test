/* Question 3: Power of Two
Write a program that takes an integer as input and returns true if the input is a power of two.
Examples:
8=> returns true
6=> returns false*/

import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();
        boolean result=isPower(num);
        System.out.println(num + " => " + result);
    }
    private static boolean isPower(int n){
        return  (n > 0) && (n & (n - 1)) == 0;
    }
}