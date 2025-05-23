import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInList {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(5);
		li.add(8);
		li.add(7);
		li.add(2);
		li.add(5);
		li.add(3);
		li.add(8);
		li.add(2);
		
		System.out.println("List(with duplicates: " + li + "\n");
		
		int x = 1;
		
		for (int k = 0; k < li.size()-1; k++) {
			
			Integer checkVal = li.get(k);
			
			for (int i = x; i < li.size(); i++) {
				
				Integer LoopVal = li.get(i);
				
				if(LoopVal == checkVal) {
					
					li.remove(i);
					i--;
				}
			}
			
			x++;
		}
		
		System.out.println("List after removing duplicates: " + li);
		
	}
}
