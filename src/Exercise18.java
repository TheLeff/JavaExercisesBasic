import java.util.Scanner;

public class Exercise18 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    18. Write a Java program to multiply two binary numbers. Go to the editor
//    Input Data:
//    Input the first binary number: 10
//    Input the second binary number: 11
//    Expected Output
//
//    Product of two binary numbers: 110

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write numbers");
        System.out.println(Integer.toBinaryString((Integer.parseInt(keyboard.nextLine(), 2) * Integer.parseInt(keyboard.nextLine(), 2))));
    }
}
