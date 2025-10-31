import java.util.Scanner;

public class Busticket {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the bus ticket number: ");
        int ticketnumber = Sc.nextInt();

       
        int choice = 0;
        while (choice != 5) 
        { 
            System.out.println("\nChoose bus ticket details:"); 
            System.out.println("1. Processing ticket");
            System.out.println("2. Confirm the ticket");
            System.out.println("3. Cancel the ticket");
            System.out.println("4. Refund the ticket money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

        
            choice = Sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Processing ticket " + ticketnumber);
                    break;
                case 2:
                    System.out.println("Confirm the ticket " + ticketnumber);
                    break;
                case 3:
                    System.out.println("Cancel the ticket " + ticketnumber);
                    break;
                case 4:
                    System.out.println("Refund the ticket " + ticketnumber);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }

        Sc.close();
    }
}
