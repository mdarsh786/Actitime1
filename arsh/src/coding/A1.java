package coding;
import java.util.Scanner;
public class A1 {
	
	public static int[] readyArray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of aaray");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("enter"+size+"elements");
		for(int i=0; i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		return a;
	}

	public static void main(String[] args) {
		int[]a=readyArray();
		int[]b=duplicateArray(a);
		System.out.println("Duplicate element array");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(b[i]);
		}
		

	}

	private static int[] duplicateArray(int[] a) 
	{
		int []b = new int [a.length];
		for(int i=0; i<b.length;i++)
		{
			b[i]=a[i];
		}
	
		return b;
	}

}
