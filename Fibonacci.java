/* Question 2: Fibonacci Sequence
Write a program to generate the Fibonacci sequence up to 100.*/

public class Fibonacci{
    public static void main(String[] args){
        int num1=0, num2=1, num3;
        System.out.print("Fibonacci Sequence up to 100: ");
        System.out.print(num1 + " " + num2);

        while ((num3 = num1 + num2) <=100){ 
            System.out.print(" " + num3 );
            num1=num2;  //num1 value is set to the current value of num2
            num2=num3;  //num2 value is set to the current value of num3
        }
    }
}