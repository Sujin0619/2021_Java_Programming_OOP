package Task1;
import java.util.Scanner;

public abstract class Student extends Person implements Authentication{
	Scanner sc = new Scanner(System.in);
	
	String username;
	String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void register(){};
	public void login(){};
	
	public void getGrades(){};
	public void calculateGPA(){};
	public void scholarship(){};
	//정의만 해놓고 함수 내용은 없음
}
