import java.util.List;
import java.util.ArrayList;

public class ArrList {
	
	public static void main(String[] args) {
		
		List objLi = new ArrayList<>();  //type casting --> up casting. Creating objects for ArrayList class but it references List interface.
		
		objLi.add("Hello");
		objLi.add('Z');
		objLi.add(77);
		objLi.add(true);
		objLi.add(55.555);
		objLi.add(77);
		
		System.out.println(objLi);     //List of Objects
		Object val = objLi.get(1);
		System.out.println(val + "\n");
	
		System.out.println("Using Generic(<String>): ");
		List<String> strLi = new ArrayList<>();
		
		strLi.add("I");
		strLi.add("am");
		strLi.add("Iron");
		strLi.add("Fist");
		
		System.out.println(strLi);     //List of Strings
		String str = strLi.get(2);
		System.out.println(str);
	}
	
	
	
}
