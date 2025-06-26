import java.util.*;

public class MiniCalculator
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
       
        System.out.println("enter the first number:");
         int num1=Sc.nextInt();
         System.out.println("enter the second number:");
         int num2=Sc.nextInt();

    System.out.println("/n choose Operation");
    System.out.println("1.Addition");
    System.out.println("2.Subtration");
    System.out.println("3.Multification");
    System.out.println("4.division");
    int choice=Sc.nextInt();
    switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        Sc.close();

        }
}
