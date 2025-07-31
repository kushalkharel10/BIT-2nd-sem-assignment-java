import java.util.Scanner;

// Custom exception for invalid grades
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter student name: ");
            String name = formatName(scanner.nextLine());
            
            System.out.print("Enter student grade (0-100): ");
            int grade = validateGrade(scanner.nextLine());
            
            System.out.println("\n--- Student Report ---");
            System.out.println("Formatted Name: " + name);
            System.out.println("Letter Grade: " + getLetterGrade(grade));
            
        } catch (InvalidGradeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter a valid number");
        } finally {
            scanner.close();
            System.out.println("Program terminated gracefully.");
        }
    }
    
    // Formats name to uppercase and trims whitespace
    private static String formatName(String rawName) {
        return rawName.trim().toUpperCase();
    }
    
    // Validates grade input (0-100)
    private static int validateGrade(String input) throws InvalidGradeException {
        try {
            int grade = Integer.parseInt(input);
            if (grade < 0 || grade > 100) {
                throw new InvalidGradeException("Grade must be 0-100");
            }
            return grade;
        } catch (NumberFormatException e) {
            throw new InvalidGradeException("Invalid number format");
        }
    }
    
    // Converts numerical grade to letter grade
    private static String getLetterGrade(int grade) {
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }
}
