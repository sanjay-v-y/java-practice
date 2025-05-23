import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInListLogic2 {
	
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
		
		int count =0;
		
		int j=li.size()-1;
		
		for (int k = 0; k < li.size()-1; k++) {
			
			Integer checkVal = li.get(k);
			
			for (int i = x; i < li.size() - count; i++) {
				
				Integer LoopVal = li.get(i);
				
				if(LoopVal == checkVal) {
					
					int temp = li.get(j);
				
					li.set(j, LoopVal);
					
					li.set(i, temp);
					
					i--;
					
					j--;
					
					count++;
				}
				
			}
			
			
			x++;
		}
		
		List<Integer> newLi = new ArrayList<Integer>();
		
		for(int v = 0; v<li.size()-count;v++) {
			
			int value = li.get(v);
			
			newLi.add(value);
			
		}
		
		System.out.println("List that contains no duplicates: " + newLi);
		
	}
}
