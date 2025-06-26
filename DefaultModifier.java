package SP;

class one4 {  
    void demo() {  
        int a = 10;
        System.out.println("executing the demo method");
    }
}

public class DefaultModifier {
    public static void main(String[] args) {
        one4 obj = new one4(); 
        obj.demo();            
    }
}
