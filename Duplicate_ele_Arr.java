package list;

public class Duplicate_ele_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,2,7,8,8,3};
for(int i=0;i<a.length;i++) {
	for(int j=0;j<i+1;j++)
	{
		if(a[i]==a[j])
		{
			System.out.println(a[j]);
			a[j]=Integer.MIN_VALUE;
		}
	}
}

	}

}
