package com.jusp.dev.meth;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str1 = "Welcome to my Kingdom";
		
		String str2 = "              K I N G                    ";
		
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
	}
	
}
