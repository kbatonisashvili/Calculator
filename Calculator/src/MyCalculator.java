/**
 * @author Kote
 *
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

	
public class MyCalculator extends JFrame{
	
	JFrame CalcFrame = new JFrame("Kote's Calculator");
	private JTextField InputField;
	private JLabel ResultLabel;
	private Button EqualsButton,ExitButton, AddButton, SubtractButton, MultiplyButton, DivideButton;
	private JPanel CalcPanel;
	
	public MyCalculator(){
		
		JPanel InputPanel = new JPanel();
		InputPanel.setLayout(new GridLayout(0,2));
		
		InputField = new JTextField("Please input your calculations here");
		InputPanel.add(InputField);
		ResultLabel = new JLabel("Results will show here");
		InputPanel.add(ResultLabel);
		InputPanel).setVgap(10);
		
			
		
		CalcPanel = new JPanel();
		CalcPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		CalcPanel.setLayout(new GridLayout(3,2));
		
		Button AddButton = new Button("+");
		CalcPanel.add(AddButton);
		Button SubtractButton = new Button("-");
		CalcPanel.add(SubtractButton);
		Button DivideButton = new Button("/");
		CalcPanel.add(DivideButton);
		Button MultiplyButton = new Button("*");
		CalcPanel.add(MultiplyButton);
		Button EqualButton = new Button("=");
		CalcPanel.add(EqualButton);
		Button ExitButton = new Button("Exit");
		CalcPanel.add(ExitButton);
		
	
		
		ExitButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				CalcFrame.dispose();
			}
		});
	
		//EqualButton.addActionListener(this);
		
		CalcFrame.add(InputPanel, BorderLayout.NORTH);
		CalcFrame.add(new JSeparator(), BorderLayout.CENTER);
		CalcFrame.add(CalcPanel, BorderLayout.SOUTH);
		CalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalcFrame.pack();
		CalcFrame.setSize(400, 400);
		CalcFrame.setVisible(true);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new MyCalculator();
		
	}
}