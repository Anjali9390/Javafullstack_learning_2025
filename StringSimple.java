public class StringSimple {
    public static void main (String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        String s4=new String("hello");

        if (s1 == s4) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
      if(s3.equals(s2))
      {
       System.out.println("equals");
      }
      else
      {
        System.out.println("not equals");
      }
    }
}
