interface one{
    public void show();
}
    interface two  extends one
    {
  public void demo();
    }
    class three implements two,one
    {
        public void show()
        {
            System.out.println("this is show method");
        }
        public void demo()
        {
            System.out.println("this is demo method");
        }
    }

    public class Hello
    {
        public static void main(String[]args)
        {
            three obj=new three();
            obj.show();
            obj.demo();
        }

    }
