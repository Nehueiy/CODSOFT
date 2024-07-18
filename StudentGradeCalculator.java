import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of subjects: ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
            }
            int numberOfSubjects = scanner.nextInt();

            if (numberOfSubjects <= 0) {
                throw new IllegalArgumentException("The number of subjects must be greater than zero.");
            }

            int[] marks = new int[numberOfSubjects];
            int totalMarks = 0;

            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                if (!scanner.hasNextInt()) {
                    throw new IllegalArgumentException("Invalid input. Please enter a valid number for marks.");
                }
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    throw new IllegalArgumentException("Marks should be between 0 and 100.");
                }

                marks[i] = mark;
                totalMarks += mark;
            }

            double averagePercentage = (double) totalMarks / numberOfSubjects;
            char grade;

            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
