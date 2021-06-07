package Task1;
import java.util.Scanner;

public class Main {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(i!=0) {
			int j = 1;
			
			System.out.println("=======================================================================");
			System.out.print("Student degree (Enter 1 for Undergraduate, 2 for Graduate, 0 for Cancel): ");
			
			i = sc.nextInt();
			
			//Undergraduate
			if (i==1) { 
				System.out.println("=================================");
				Undergraduate student = new Undergraduate();
				student.register();
				student.login();
				System.out.println("Welcome to SKKU grade calculator! ");
				student.getGrades();
				student.calculateGPA();
				student.scholarship();
				
				while(j==1) {
					System.out.print("Do you want to calculate again(Y/N): ");
					String answer = sc.next();
					if (answer.equals("N")) //break
						j=0;
					else {
							student.getGrades();
							student.calculateGPA();
							student.scholarship();
						}
					}
				}
			
			//Graduate
			else if(i==2) {
				System.out.println("=================================");
				Graduate student = new Graduate();
				student.register();
				student.login();
				System.out.println("Welcome to SKKU grade calculator! ");
				student.getGrades();
				student.calculateGPA();
				student.scholarship();
				
				while(j==1) {
					System.out.print("Do you want to calculate again(Y/N): ");
					String answer = sc.next();
					if (answer.equals("N")) //break
						j=0;
					else {
							student.getGrades();
							student.calculateGPA();
							student.scholarship();
						}
					}
			}
			
			// Cancel
			else if(i==0) {
				System.out.println("Thank you for using our system!");
			}
		}
	}
}


