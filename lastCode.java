import java.util.*;
public class lastCode
{
	public static void main(String[] args) {
	    System.out.print("Enter the Number till which U want to print fibonacci series: ");
	    Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		revFibonacci(num);
		
	}
	static void revFibonacci(int num)
	{
	    int a[]=new int[num+1];
	    a[0]=0;a[1]=1;
	    System.out.print(a[1]);
	    for(int i=2; i<=num;i++)
	    {
	        a[i]=a[i-2]+a[i-1];
	        System.out.print(","+a[i]);
	    }
	    System.out.println();
	    for(int n: a)
	    
	    {
	        if(n==0) continue;
	        else if(n%2==0) System.out.print((n+4)+",");
	        else System.out.print((n+3)+",");
	    }
	}
	
}
