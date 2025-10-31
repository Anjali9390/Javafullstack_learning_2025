import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = sc.nextInt();

        System.out.println("\nChoose Grade Check Option:");
        System.out.println("1. A Grade (90 and above)");
        System.out.println("2. B Grade (75 and above)");
        System.out.println("3. C Grade (55 and above)");
        System.out.println("4. D Grade (40 and above)");
        System.out.println("5. Fail (Below 40)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (marks >= 90)
                    System.out.println("Grade: A");
                else
                    System.out.println("Not eligible for A Grade");
                break;

            case 2:
                if (marks >= 75)
                    System.out.println("Grade: B");
                else
                    System.out.println("Not eligible for B Grade");
                break;

            case 3:
                if (marks >= 55)
                    System.out.println("Grade: C");
                else
                    System.out.println("Not eligible for C Grade");
                break;

            case 4:
                if (marks >= 40)
                    System.out.println("Grade: D");
                else
                    System.out.println("Grade is E (Fail)");
                break;

            case 5:
                if (marks < 40)
                    System.out.println("Grade: E (Fail)");
                else
                    System.out.println("Not Fail");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
