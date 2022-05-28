/**
 * @author Kote
 *
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

	
public class MyCalculator implements ActionListener{
	
	static JFrame CalcFrame = new JFrame("Kote's Calculator");
	JTextField t1,t2;
	Button EqualsButton,ExitButton;
	
	MyCalculator(){
			
	JTextField t1 = new JTextField("Please input your calculations here");
	t1.setBounds(50,100,200,30);
	CalcFrame.add(t1);
	
	final JTextField t2 = new JTextField("Results will show here");
	t2.setEditable(false);
	t2.setBounds(50,150,200,30);
	CalcFrame.add(t2);
	
	
	Button EqualButton = new Button("=");
	EqualButton.setBounds(300,250, 50, 50);
	CalcFrame.add(EqualButton);
	
	Button ExitButton = new Button("Exit");
	ExitButton.setBounds(300,300, 50, 50);
	CalcFrame.add(ExitButton);
	

	
	ExitButton.addActionListener(this);
	EqualButton.addActionListener(this);
	
	
	CalcFrame.setSize(400, 400);
	CalcFrame.setLayout(null);
	CalcFrame.setVisible(true);
	
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ExitButton) {
				System.exit(0);
		}
		else if(e.getSource() == EqualsButton)
				t2.setText("test");
		}
		
		
	
	public static void main(String[] args) {
		
		new MyCalculator();
		
	}
}