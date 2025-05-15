public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "stressed";
		
		int strLen = str.length();
	
		for (int i = strLen - 1; i >=0; i--) {
			
			char chInStr = str.charAt(i);
			
			System.out.print(chInStr);
		}
	}
}