package assignment2;

import assignment2.InvalidAgeException;
import assignment2.User;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    private int age;

    public User(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age cannot be negative");
        } else if (age > 100) {
            throw new InvalidAgeException("Age cannot be greater than 100");
        } else {
            this.age = age;
            System.out.println("Valid age");
        }
    }
}

public class Ass9 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter your age:");
            return;
        }

        try {
            int age = Integer.parseInt(args[0]);

            User user = new User(age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Enter valid age");
        }
    }
}
