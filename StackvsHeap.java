class Student
{
    int id; //Stored in heap memory
    String name;//Stored in Heap memory

    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
public class StackvsHeap
{
public static void main(String[] args) 
{
     int primitiveVar = 50; // 'primitiveVar' is a local variable stored on the STACK

Student s1 = new Student(101, "Alice");

        printDetails(s1); // New stack frame created for this method
}
static void printDetails(Student s) 
{
        // 's' is a local reference on the STACK pointing to the HEAP object
        System.out.println("ID: " + s.id + ", Name: " + s.name);
}
}