package assignment2;

import java.util.*;

public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the student's name:");
            String name = sc.nextLine();

            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Student name cannot be null");
            }

            System.out.print("Enter the student's score:");
            String scoreInput = sc.nextLine();

            int score = Integer.parseInt(scoreInput);

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100");
            }

            System.out.println("The score has been successfully recorded");

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("The score is not a valid integer");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}
