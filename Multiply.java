
class A{
        int multiply(int a,int b)
        {
         return a*b;
        }
    }
    class B extends A{
        int multiply(int a,int b)
        {
         return a+b;
        }
    }
    public class Multiply {
    public static void main(String args[])
    {
        
       
        A a = new B();
        
        System.out.println(a.multiply(2,5));
      
       
    }
}