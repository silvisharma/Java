//Java program to check if a given number is present in the array
import java.util.*; 
public class FindNo  
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the number:"); 
int n = sc.nextInt();
System.out.println("Enter the size of array:");
int s = sc.nextInt();
int m[] = new int[s];
boolean flag = false;

System.out.println("Enter the elements of the array: ");
  for(int i=0; i<m.length; i++) {
	m[i]=sc.nextInt();
 
  }
System.out.println("The array is: "+Arrays.toString(m));
  for (int i = 0; i<s;i++) {
  
      if (n == m[i]) {
        flag = true;
        
      }
    }
    
    if(flag)
      System.out.println("The given number "+ n +" exists in the given array.");
    else
      System.out.println("The given number "+ n +" does not exist in the given array.");
}
}