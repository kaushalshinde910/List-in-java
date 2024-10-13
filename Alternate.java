package list;

public class Alternate {
	
	public static void main(String[] args)
	{
	int[] a=
	{
	1,2,3,4,5,6
	}
	;
	myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[] a)
	{
	//write code here or logic
	for(int i=0;i<a.length;i+=2)
	{
	System.out.print(a[i]+" ");
	}
	}
	}

