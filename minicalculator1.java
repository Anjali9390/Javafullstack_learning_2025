public class minicalculator1
{

void calculate(double a,double b,String operation)
{
    if(operation.equals("add"))
    {
       System.out.println("Addition="+(a+b));
    }
     else if(operation.equals("sub"))
    {
            System.out.println("subtraction="+(a-b));
    }
    else if(operation.equals("mul"))
    {
        System.out.println(("multiplication="+(a*b)));
    }
    else if (operation.equals("div"))
         {

            if (b != 0)
                 {
                System.out.println("Division = " + (a / b));
                 }
             else
                 {
                System.out.println("Cannot divide by zero");
            }
        }
        else {
            System.out.println("Invalid operation");
        }
    }

    public static void main(String[]args)
    {
           minicalculator1 c = new minicalculator1();

        double a = 10;
        double b = 0;
        String operation = "div";  

        c.calculate(a, b, operation);
    }
}