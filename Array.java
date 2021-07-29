import java.util.Scanner;
import java.util.Arrays;  
public class Array  
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<array.length; i++)  
{   
array[i]=sc.nextInt();
}  
System.out.println("Array is: ");  
System.out.println(Arrays.toString(array));  
}  
}