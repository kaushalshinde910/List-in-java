package list;

public class Find_Pairs_withsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {2,4,3,5,7,8};
          int targetSum=7;
          for(int i=0;i<a.length;i++)
          {
        	  for(int j=i+1;j<a.length;j++)
        	  {
        		if(a[i]+a[j]==targetSum)
        		{
        			System.out.println(a[i]+"+"+a[j]+"="+targetSum);
        		}
        	  }
          }
	}

}
