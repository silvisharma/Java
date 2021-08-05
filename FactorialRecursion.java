import java.util.Scanner;

public class FactorialRecursion {
    static int fact(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * fact(n-1));    
       }    
    public static void main(String[] args)
    {
        int n,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        f = fact(n);
        System.out.println("Factorial of "+n+" is "+f);

    }
}
