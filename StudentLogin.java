import java.util.*;

public class StudentLogin
{
    public static void main(String[]args)
    {
        Map<String,String>Student=new HashMap<>();

        Student.put("1234","Anjali");
        Student.put("2345","Pramila");

        String userpassword="1234";
        String username="Anjali";

        if(Student.containsKey(userpassword)&&Student.get(userpassword).equals(username))
        {
            System.out.println("the student login successfull");
        }
     else
     {
        System.out.println("the student login failed");
     }
 
    }
}