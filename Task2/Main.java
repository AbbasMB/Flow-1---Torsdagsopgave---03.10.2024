import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		System.out.println("PLease type your name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello " + name);

		System.out.println("Please type your age:");
		int age = scan.nextInt();
		System.out.println("You are " + age + " years old");

		int retirementAge = 67;
		int yearsUntilRetirement = retirementAge - age;

		if (yearsUntilRetirement > 0) {
			System.out.println("You have " + yearsUntilRetirement + " years until retirement.");
		} 
	}
}
