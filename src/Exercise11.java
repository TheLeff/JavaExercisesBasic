import java.util.Scanner;

public class Exercise11 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    11. Write a Java program to print the area and perimeter of a circle. Go to the editor
//    Test Data:
//    Radius = 7.5
//    Expected Output
//    Perimeter is = 47.12388980384689
//    Area is = 176.71458676442586

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write number");
        float Number = keyboard.nextFloat();
        System.out.println("Perimeter is = " + Number * 6.2830);
        System.out.println("Area is = " + Number*Number*3.1415);
    }
}
