import java.util.Scanner;

public class Exercise15 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    15. Write a Java program to swap two variables. Go to the editor
//    Click me to see the solution

//    x = x+y;
//    y=x-y;
//    x=x-y;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write numbers");
        int FirstNumber = keyboard.nextInt();
        int SecondNumber = keyboard.nextInt();
        FirstNumber = FirstNumber + SecondNumber;
        SecondNumber = FirstNumber - SecondNumber;
        FirstNumber = FirstNumber - SecondNumber;
        System.out.println(FirstNumber + " " + SecondNumber);
    }
}
