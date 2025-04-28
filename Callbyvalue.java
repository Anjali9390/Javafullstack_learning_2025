class Demo {
    int a;
    double b;
    char c;

    public void show(int a1, double b1, char c1) {
        a = a1;
        b = b1;
        c = c1;

        a++;
        b++;
        c++;

        System.out.println("This is show method");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

public class Callbyvalue {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show(2, 67.9, 'A');
    }
}
