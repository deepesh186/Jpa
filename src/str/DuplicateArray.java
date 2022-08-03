package str;

import java.util.ArrayList;
import java.util.Iterator;

public class DuplicateArray {
	public int fact(int a)
	{
		int f2=1;
		for(int j=1;j<=a;j++)
		{
			f2=f2*j;
		}
		
		return a;
	}

	public static void main(String[] args) {
		DuplicateArray a12=new DuplicateArray();
		a12.fact(6);
		System.out.println(a12.toString());
		
		
		int n=5,f=1;
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println(f);
		
	}

}
