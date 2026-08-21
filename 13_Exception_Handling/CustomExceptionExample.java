class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void checkVotingAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to vote.");
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkVotingAge(16);
        } catch (InvalidAgeException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}