import java.util.Scanner;

public class Exercise12 {

//    12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
//    Click me to see the solution

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write numbers");
        System.out.println((keyboard.nextInt()+keyboard.nextInt()+keyboard.nextInt())/3);
    }
}
