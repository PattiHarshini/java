package assignment2;

import java.util.*;
public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a value:");
            int a = sc.nextInt();

            System.out.print("Enter b value:");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result of a/b: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integer values");

        } finally {
            sc.close();
        }
    }
}
