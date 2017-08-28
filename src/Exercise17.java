import java.util.Scanner;

public class Exercise17 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    17. Write a Java program to add two binary numbers. Go to the editor
//    Input Data:
//    Input first binary number: 10
//    Input second binary number: 11
//    Expected Output
//
//    Sum of two binary numbers: 101

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write numbers");
        System.out.println(Integer.toBinaryString((Integer.parseInt(keyboard.nextLine(), 2) + Integer.parseInt(keyboard.nextLine(), 2))));
    }
}
