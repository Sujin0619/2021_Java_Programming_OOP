package Task2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;

public class Grade_Calculator extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel FirstLable;
	private JButton Button;
	private JLabel FinalLabel;
	private JLabel Course1;
	private JTextField Credit1;
	private JTextField Grade1;
	private JLabel Course2;
	private JTextField Grade2;
	private JTextField Credit2;
	private JLabel Course3;
	private JTextField Grade3;
	private JTextField Credit3;

	// Grade float variables
	float Gradenum1;   
	float Gradenum2;
	float Gradenum3;
	
	// Credit int variables
	int Creditnum1;
	int Creditnum2;
	int Creditnum3;
	
	int Creditsum;
	float GPA;
	
	/**
	 * Create the frame.
	 */
	public Grade_Calculator() {
		setTitle("Grade Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		FirstLable = new JLabel("SKKU Grade Calculator");
		FirstLable.setForeground(new Color(0, 0, 139));
		FirstLable.setFont(new Font("µ¸¿ò", Font.BOLD, 14));
		FirstLable.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(FirstLable, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		Course1 = new JLabel("Course1");
		Course1.setFont(new Font("µ¸¿ò", Font.BOLD, 12));
		Course1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Course1);
		
		Grade1 = new JTextField();
		Grade1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Grade1);
		Grade1.setColumns(10);
		
		Credit1 = new JTextField();
		Credit1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Credit1);
		Credit1.setColumns(10);
		
		Course2 = new JLabel("Course2");
		Course2.setFont(new Font("µ¸¿ò", Font.BOLD, 12));
		Course2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Course2);
		
		Grade2 = new JTextField();
		Grade2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Grade2);
		Grade2.setColumns(10);
		
		Credit2 = new JTextField();
		Credit2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Credit2);
		Credit2.setColumns(10);
		
		Course3 = new JLabel("Course3");
		Course3.setFont(new Font("µ¸¿ò", Font.BOLD, 12));
		Course3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Course3);
		
		Grade3 = new JTextField();
		Grade3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Grade3);
		Grade3.setColumns(10);
		
		Credit3 = new JTextField();
		Credit3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Credit3);
		Credit3.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		Button = new JButton("Calculate GPA");
		Button.setForeground(new Color(255, 255, 255));
		Button.setBackground(new Color(0, 0, 128));
		panel_1.add(Button);
		
		FinalLabel = new JLabel("");
		FinalLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		FinalLabel.setBackground(new Color(240, 240, 240));
		FinalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(FinalLabel);
		
		Button.addActionListener(this);  // When we click the button, events will happen (³Ö´Â ºÎºÐ)
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		// When we click the button (¹Þ´Â ºÎºÐ)
		if (e.getSource() == Button) {
			// Because Textfield has string, getText() function is needed
			// equals() is a function that compares two string 
			if (Grade1.getText().equals("A+")) 
				Gradenum1 = (float) 4.5;
			else if(Grade1.getText().equals("A0") || Grade1.getText().equals("A"))
				Gradenum1 = (float) 4.0;
			else if(Grade1.getText().equals("B+"))
				Gradenum1 = (float) 3.5;
			else if(Grade1.getText().equals("B0") || Grade1.getText().equals("B"))
				Gradenum1 = (float) 3.0;
			else if(Grade1.getText().equals("C+"))
				Gradenum1 = (float) 2.5;
			else if(Grade1.getText().equals("C0") || Grade1.getText().equals("C"))
				Gradenum1 = (float) 2.0;
			else if(Grade1.getText().equals("D+"))
				Gradenum1 = (float) 1.5;
			else if(Grade1.getText().equals("D0") || Grade1.getText().equals("D"))
				Gradenum1 = (float) 1.0;
			else
				Gradenum1 = (float) 0.0;
			
			if (Grade2.getText().equals("A+")) 
				Gradenum2 = (float) 4.5;
			else if(Grade2.getText().equals("A0") || Grade2.getText().equals("A"))
				Gradenum2 = (float) 4.0;
			else if(Grade2.getText().equals("B+"))
				Gradenum2 = (float) 3.5;
			else if(Grade2.getText().equals("B0") || Grade2.getText().equals("B"))
				Gradenum2 = (float) 3.0;
			else if(Grade2.getText().equals("C+"))
				Gradenum2 = (float) 2.5;
			else if(Grade2.getText().equals("C0") || Grade2.getText().equals("C"))
				Gradenum2 = (float) 2.0;
			else if(Grade2.getText().equals("D+"))
				Gradenum2 = (float) 1.5;
			else if(Grade2.getText().equals("D0") || Grade2.getText().equals("D"))
				Gradenum2 = (float) 1.0;
			else
				Gradenum2 = (float) 0.0;
			
			if (Grade3.getText().equals("A+")) 
				Gradenum3 = (float) 4.5;
			else if(Grade3.getText().equals("A0") || Grade3.getText().equals("A"))
				Gradenum3 = (float) 4.0;
			else if(Grade3.getText().equals("B+"))
				Gradenum3 = (float) 3.5;
			else if(Grade3.getText().equals("B0") || Grade3.getText().equals("B"))
				Gradenum3 = (float) 3.0;
			else if(Grade3.getText().equals("C+"))
				Gradenum3 = (float) 2.5;
			else if(Grade3.getText().equals("C0") || Grade3.getText().equals("C"))
				Gradenum3 = (float) 2.0;
			else if(Grade3.getText().equals("D+"))
				Gradenum3 = (float) 1.5;
			else if(Grade3.getText().equals("D0") || Grade3.getText().equals("D"))
				Gradenum3 = (float) 1.0;
			else
				Gradenum3 = (float) 0.0;
			
			// Convert string of Textfield into int
			Creditnum1 = Integer.parseInt(Credit1.getText().trim());
			Creditnum2 = Integer.parseInt(Credit2.getText().trim());
			Creditnum3 = Integer.parseInt(Credit3.getText().trim());
			
			Creditsum = Creditnum1 + Creditnum2 + Creditnum3; 
			
			GPA = (Gradenum1*Creditnum1 + Gradenum2*Creditnum2 + Gradenum3*Creditnum3)/Creditsum;
			
			// Original background of Label is none
			// We need setOpaque(true) function 
			FinalLabel.setOpaque(true);
			FinalLabel.setBackground(Color.yellow);
			
			FinalLabel.setText("Your GPA : " + GPA);
			
			
		}
		
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grade_Calculator frame = new Grade_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
