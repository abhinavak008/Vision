/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//import package
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("Enter the Number till which U want to print fibonacci series: ");
	    Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		fibonacci(num);
		
	}
	static void fibonacci(int num)
	{
	    int n1=0, n2=1, n3;
	    System.out.print(n2);
	    for(int i=0;i<num-1;i++)
	    {
	        n3=n1+n2;
	        System.out.print(","+n3);
	        n1=n2;
	        n2=n3;
	    }
	}
	
}
