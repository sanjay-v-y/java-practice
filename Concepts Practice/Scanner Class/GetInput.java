import java.util.Scanner;

public class GetInput {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int a = inp.nextInt();
		System.out.println("Age: " + a + "\n");
		
		System.out.print("Enter your Salary: ");
		double b = inp.nextDouble();
		System.out.println("Salary: " + b + "\n");
		
		System.out.print("What processor are you using?: ");
		String c = inp.next();
		System.out.println("Processor: " + c + "\n");
		
		System.out.print("Type a sentence that contains atleast two words: ");
		inp.nextLine();
		String d = inp.nextLine();
		System.out.println("Sentence: " + d + "\n");
	}
}