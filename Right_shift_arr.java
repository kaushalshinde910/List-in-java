package list;
import java.util.ArrayList;
public class Right_shift_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,2,3,4,5,6};
         int temp=a[a.length-1];
         for(int i=a.length-1;i>0;i--)
         {
        	 a[i]=a[i-1];
        	 }
         a[0]=temp;
         ArrayList<Integer>list=new ArrayList<>();
         for(int i=0;i<a.length;i++)
         {
        	 list.add(a[i]);
         }
         System.out.println(list);
         for(int i=0;i<list.size();i++)
         {
        	 System.out.print(list.get(i)+" ");
         }
	}

}
