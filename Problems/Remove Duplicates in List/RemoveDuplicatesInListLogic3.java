import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInListLogic3 {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(9);
		li.add(7);
		li.add(4);
		li.add(7);
		li.add(1);
		li.add(5);
		li.add(9);
		li.add(1);
		
		System.out.println("List(with duplicates): " + li + "\n");
		
		int x = 1;
		
		for (int k = 0; k < li.size()-1; k++) {
			
			Integer checkVal = li.get(k);
			
			for (int i = x; i < li.size(); i++) {
				
				Integer LoopVal = li.get(i);
				
				if(LoopVal == checkVal) {
					
					li.set(i, null);
				}
			}
			
			x++;
		}
		
		List<Integer> chkLi = new ArrayList<Integer>();
		
		chkLi.add(null);
		
		li.removeAll(chkLi);		
		
		System.out.println("List that contains no duplicates: " + li);
		
	}
}
