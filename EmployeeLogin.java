import java.util.*;

public class EmployeeLogin
{
    public static void main(String[]args)
    {
        Map<String,String>employees=new HashMap<>();

        employees.put("emp101","pass101");
        employees.put("emp102","pass102");

        String enteredid="emp101";
        String enteredpass="pass102";

        if(employees.containsKey(enteredid)&&employees.get(enteredid).equals(enteredpass))
        {
            System.out.println("employees login successfully");
        }
        else{
            System.out.println(" login failed");
        }
    }
}