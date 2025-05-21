package assignment_2;

import java.util.*;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer as a string:");
        String s = sc.nextLine();

        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("The input is not a valid integer.");
        } finally {
            sc.close();
        }
    }
}
