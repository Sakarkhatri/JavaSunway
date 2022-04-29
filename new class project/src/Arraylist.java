import java.lang.reflect.Array;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("Banana");
		fruit.add("Peach");
		fruit.add("Mango");
		fruit.add("White apple");
		System.out.print(fruit);
		
		for(int i = 0; i<fruit.size();i++) {
			System.out.println(fruit.get(i));	
		}
		System.out.println(fruit.get(2));
//		
		fruit.set(3, "White apple");
		System.out.println(fruit.get(2));
		
//
		fruit.remove (3); 
		System.out.print("White apple");

	}
}
