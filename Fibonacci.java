public class Fibonacci {
    public static void main(String[] args)
    {
        int a=0,b=1,c,n=10;
        System.out.println(a+" "+b);
        for (int i=2;i<n;++i)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
