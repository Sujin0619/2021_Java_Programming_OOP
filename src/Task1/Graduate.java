package Task1;
import java.util.Scanner;

public class Graduate extends Student{
	Scanner sc = new Scanner(System.in);
	
	String javaGrade;
	int javaCredits;
	String dataStructureGrade;
	int dataStructureCredits;
	String algorithmGrade;
	int algorithmCredits;
	float gpa;
	String professorRecommend;
	
	//Getter and Setter method
	public String getJavaGrade() {
		return javaGrade;
	}

	public void setJavaGrade(String javaGrade) {
		this.javaGrade = javaGrade;
	}

	public int getJavaCredits() {
		return javaCredits;
	}

	public void setJavaCredits(int javaCredits) {
		this.javaCredits = javaCredits;
	}

	public String getDataStructureGrade() {
		return dataStructureGrade;
	}

	public void setDataStructureGrade(String dataStructureGrade) {
		this.dataStructureGrade = dataStructureGrade;
	}

	public int getDataStructureCredits() {
		return dataStructureCredits;
	}

	public void setDataStructureCredits(int dataStructureCredits) {
		this.dataStructureCredits = dataStructureCredits;
	}

	public String getAlgorithmGrade() {
		return algorithmGrade;
	}

	public void setAlgorithmGrade(String algorithmGrade) {
		this.algorithmGrade = algorithmGrade;
	}

	public int getAlgorithmCredits() {
		return algorithmCredits;
	}

	public void setAlgorithmCredits(int algorithmCredits) {
		this.algorithmCredits = algorithmCredits;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	// register method
	public void register() {
		
		System.out.println("Register (Graduate): ");
		
		System.out.print("Full name: ");
		this.setFullname(sc.nextLine());
		
		System.out.print("Username: ");
		this.setUsername(sc.next());
		
		System.out.print("Password: ");
		this.setPassword(sc.next());
	
		System.out.println("=================================");
	};
	
	// login method
	public void login(){
		int i=1;
		String name;
		String pwd;
		
		while(i==1) {
			System.out.println("Login: ");
			
			System.out.print("Username: ");
			name = sc.next();
			
			System.out.print("Password: ");
			pwd = sc.next();
			
			if(name.equals(this.username) && pwd.equals(this.password)) // correct
				i = 0;
			
			else 
				System.out.println("Incorrect username or password");  //incorrect
			
			System.out.println("=================================");
		}
		
	};
	
	// getGrades method
	public void getGrades(){

		System.out.print("Grade from Java Programming: ");
		this.setJavaGrade(sc.next());
		System.out.print("Credits from Java Programming: ");
		this.setJavaCredits(sc.nextInt());
		
		System.out.print("Grade from Data Structure: ");
		this.setDataStructureGrade(sc.next());
		System.out.print("Credits from Data Structure: ");
		this.setDataStructureCredits(sc.nextInt());
		
		System.out.print("Grade from Algorithms: ");
		this.setAlgorithmGrade(sc.next());
		System.out.print("Credits from Algorithms: ");
		this.setAlgorithmCredits(sc.nextInt());
		
		System.out.println("---------");
		System.out.print("Did professor recommend you (Y/N): ");
		
		this.professorRecommend = sc.next();
		
		System.out.println("=================================");
	};
	
	// calculateGPA method
	public void calculateGPA(){
		int credits_sum = this.javaCredits + this.dataStructureCredits + this.algorithmCredits;
		
		float javaGradenum;
		float dataGradenum;
		float algoGradenum;
		
		if(this.javaGrade.equals("A+"))
			javaGradenum = (float) 4.5;
		else if(this.javaGrade.equals("A0") || (this.javaGrade.equals("A")))
			javaGradenum = (float) 4.0;
		else if(this.javaGrade.equals("B+"))
			javaGradenum = (float) 3.5;
		else if(this.javaGrade.equals("B0") || (this.javaGrade.equals("B")))
			javaGradenum = (float) 3.0;
		else if(this.javaGrade.equals("C+"))
			javaGradenum = (float) 2.5;
		else if(this.javaGrade.equals("C0") || (this.javaGrade.equals("C")))
			javaGradenum = (float) 2.0;
		else if(this.javaGrade.equals("D+"))
			javaGradenum = (float) 1.5;
		else if(this.javaGrade.equals("D0") || (this.javaGrade.equals("D")))
			javaGradenum = (float) 1.0;
		else
			javaGradenum = (float) 1.0;
		
		
		if(this.dataStructureGrade.equals("A+"))
			dataGradenum = (float) 4.5;
		else if(this.dataStructureGrade.equals("A0") || (this.dataStructureGrade.equals("A")))
			dataGradenum = (float) 4.0;
		else if(this.dataStructureGrade.equals("B+"))
			dataGradenum = (float) 3.5;
		else if(this.dataStructureGrade.equals("B0") || (this.dataStructureGrade.equals("B")))
			dataGradenum = (float) 3.0;
		else if(this.dataStructureGrade.equals("C+"))
			dataGradenum = (float) 2.5;
		else if(this.dataStructureGrade.equals("C0") || (this.dataStructureGrade.equals("C")))
			dataGradenum = (float) 2.0;
		else if(this.dataStructureGrade.equals("D+"))
			dataGradenum = (float) 1.5;
		else if(this.dataStructureGrade.equals("D0") || (this.dataStructureGrade.equals("D")))
			dataGradenum = (float) 1.0;
		else 
			dataGradenum = (float) 1.0;
		
		
		if(this.algorithmGrade.equals("A+"))
			algoGradenum = (float) 4.5;
		else if(this.algorithmGrade.equals("A0") || (this.algorithmGrade.equals("A")))
			algoGradenum = (float) 4.0;
		else if(this.algorithmGrade.equals("B+"))
			algoGradenum = (float) 3.5;
		else if(this.algorithmGrade.equals("B0") || (this.algorithmGrade.equals("B")))
			algoGradenum = (float) 3.0;
		else if(this.algorithmGrade.equals("C+"))
			algoGradenum = (float) 2.5;
		else if(this.algorithmGrade.equals("C0") || (this.algorithmGrade.equals("C")))
			algoGradenum = (float) 2.0;
		else if(this.algorithmGrade.equals("D+"))
			algoGradenum = (float) 1.5;
		else if(this.algorithmGrade.equals("D0") || (this.algorithmGrade.equals("D")))
			algoGradenum = (float) 1.0;
		else 
			algoGradenum = (float) 1.0;
		
		
		gpa = (javaGradenum*javaCredits + dataGradenum*dataStructureCredits + algoGradenum*algorithmCredits)/credits_sum;
	
		System.out.printf("Student: %s\n", this.getFullname());
		System.out.printf("Your GPA: %.2f\n", this.getGpa());
		
	};
	
	public void scholarship(){
		if(this.gpa>3.8 && this.professorRecommend.equals("Y"))
			System.out.println("Congratulation! You got 100% scholarship");
		
		else if (this.gpa>=3.5 && this.professorRecommend.equals("Y"))
			System.out.println("Congratulation! You got 50% scholarship");
		
		else if(this.gpa<3.5 && this.professorRecommend.equals("Y"))
			System.out.println("Congratulation! You got 50% scholarship");
		
		else{
			System.out.println("You did not get scholarship");
			System.out.println("Professor did not recommend.");
		}
		
		System.out.println("=================================");
	};
}
