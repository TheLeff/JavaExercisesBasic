import java.util.Scanner;

public class Exercise19 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    19. Write a Java program to convert a decimal number to binary number. Go to the editor
//    Input Data:
//    Input a Decimal Number : 5
//    Expected Output
//
//    Binary number is: 101

    public static void main(String[] args) {
        System.out.println("Write number");
        Scanner keyboard = new Scanner(System.in);

        int Decimal = keyboard.nextInt();
        int Binary = 0;

        int counter = 1;

        printBinaryform(Decimal);

    }

    // I'd rather use a usual toBinaryString() but here is a https://stackoverflow.com/users/1648987/karol-s algorithm

    private static void printBinaryform(int number) {

        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number %2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}
