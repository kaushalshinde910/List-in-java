package list;
import java.util.ArrayList;
public class Left_Shift_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a= {1,2,3,4,5,6};
        int temp=a[0];
        for(int i=0;i<a.length-1;i++)
        {
        	a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        ArrayList<Integer>list=new ArrayList<>();
        		for(int i=0;i<a.length;i++)
        		{
        			list.add(a[i]);
        		}
        System.out.println(list);
	}

}
