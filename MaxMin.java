//Java program to find min and max number in an array
import java.util.*; 
public class MaxMin 
{  
public static void main(String[] args)   
{  
int max,min,s,m[];
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the size of array:");
s = sc.nextInt();
m = new int[s];

System.out.println("Enter the elements of the array: ");
for(int i=0; i<s; i++) {
  m[i]=sc.nextInt();
  }  
System.out.println("The array is: "+Arrays.toString(m));
   max = m[0];
for(int i=0; i<s; i++) {
  if(max < m[i])
  {
  max = m[i];
  }
}
System.out.println("Maximum value in the array is: "+max);
min = m[0];
for(int i=0; i<s; i++) {
  if(min > m[i])
  {
  min = m[i];
  }
}
System.out.println("Minimum value in the array is: "+min);
}
}