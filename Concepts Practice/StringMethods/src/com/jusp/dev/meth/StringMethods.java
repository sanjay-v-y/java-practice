package com.jusp.dev.meth;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str1 = "Welcome to my Kingdom";
		
		String str2 = "              K I N G                    ";
		
		String str3 = "sun god";
		String str4 = "Sun God";
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2 + "\n");
		
		int strInd = str1.indexOf("K");
		System.out.println("First index of \'K\': " + strInd + "\n");
		
		int lstInd = str1.lastIndexOf("m");
		System.out.println("Last index of \'m\': " + lstInd + "\n");
		
		int len = str1.length();
		System.out.println("Length of the string str1: " + len + "\n");
		
		boolean strCon = str1.contains("King");
		System.out.println("Does str1 contain \"King\"? " + strCon + "\n");
		
		boolean strEmp = str1.isEmpty();		
		System.out.println("Is str1 empty? " + strEmp + "\n");
		
		boolean startsWith = str1.startsWith("wel");
		System.out.println("Does str1 starts with \"wel\"? " + startsWith + "\n");
		
		boolean endsWith = str1.endsWith("dom");
		System.out.println("Does str1 ends with \"dom\"? " + endsWith + "\n");
		
		String lwrStr = str2.toLowerCase();
		System.out.println("Lower case: " + lwrStr + "\n");
		
		String uprStr = lwrStr.toUpperCase();
		System.out.println("Upper case: " + uprStr + "\n");
		
		String trmStr = str2.trim();
		System.out.println("Trimmed String: " + trmStr + "\n");
		
		boolean sameStr = str3.equals(str4);
		System.out.println("Is str3 and str4 same(case sensitive): " + sameStr + "\n");
		
		boolean sameStrIgnoreCase = str3.equals(str4);
		System.out.println("Is str3 and str4 same(ignore case): " + sameStrIgnoreCase + "\n");
		
		String newStr1 = str1.substring(11);
		System.out.println("Sub string of str1(only start index): " + newStr1 + "\n");
		
		String newStr2 = str1.substring(8,11);
		System.out.println("Sub string of str1(start index & end index): " + newStr2 + "\n");
		
		String charReplacedStr = str1.replace('m', '$');
		System.out.println("Character replaced String of str1: " + charReplacedStr + "\n");
		
		String wordReplacedStr = str2.replace("KING", "Jack Of All Trades");
		System.out.println("Word replaced String of str2: " + wordReplacedStr + "\n");
		
	}
	
}
