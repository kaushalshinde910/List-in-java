package list;
import java.util.ArrayList;
public class Ar12 {

	private static ArrayList<Integer> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list = new ArrayList<Integer>(); 
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(40);
		list.set(0, 5);
		//list.remove(2);
		//list.clear();
	    
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.set(1, 5));
		System.out.println(list);
		System.out.println("i have removed ="+list.remove(2));
		System.out.println(list);
		System.out.println(list.clone());
		list.clear(); // Clear the list
		System.out.println("List cleared"); // Print a message indicating the list is cleared
	}
}
