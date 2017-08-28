import java.util.Scanner;

public class Exercise20 {

//    20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
//    Input Data:
//    Input a decimal number: 15
//    Expected Output
//
//    Hexadecimal number is : F



    /*
    Okay, I can write a manual code, but it's going to be bad and
    there is no way I'll be ignoring libraries in the real work
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(Integer.toHexString(keyboard.nextInt()));
    }

}
