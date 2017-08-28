import java.util.Scanner;

public class Exercise1 {

//    http://www.w3resource.com/java-exercises/basic/index.php

//    1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
//    Expected Output :
//    Hello
//    Alexandra Abramov

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name");
        System.out.println("Hello" + System.lineSeparator() + keyboard.nextLine());

    }
}
