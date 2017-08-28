import java.util.Scanner;

public class Exercise5 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//    Test Data:
//    Input first number: 25
//    Input second number: 5
//    Expected Output :
//            25 x 5 = 125


    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println(keyboard.nextInt() * keyboard.nextInt());


    }

}
