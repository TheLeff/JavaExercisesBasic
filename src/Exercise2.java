import java.util.Scanner;

public class Exercise2 {

//    2. Write a Java program to print the sum of two numbers. Go to the editor
//    Test Data:
//            74 + 36
//    Expected Output :
//            110

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write numbers");
        System.out.println(keyboard.nextInt() + keyboard.nextInt());
    }

}
