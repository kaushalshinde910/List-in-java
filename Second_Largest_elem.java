package list;

public class Second_Largest_elem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {5,10,3,8,15};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondLargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondLargest && a[i] !=largest)
			{
				secondLargest=a[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE)
		{
			System.out.println("There is no second largest no.");
		}
		else
		{
			System.out.println("The second largest element is: "+secondLargest);
		}
			
				
	}
}


