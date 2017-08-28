import java.util.Scanner;

public class Exercise13 {

//    13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//    Test Data:
//    Width = 5.5 Height = 8.5
//
//    Expected Output
//    Area is 5.6 * 8.5 = 47.60
//    Perimeter is 2 * (5.6 + 8.5) = 47.60

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write numbers");
        float Width = keyboard.nextFloat();
        float Height = keyboard.nextFloat();

        System.out.println("Area is " + Width + " * " + Height + " = " + Width*Height);
        System.out.println("Perimeter is 2 * (" + Width + " + " + Height + ") = " + Width*Height);
    }
}
