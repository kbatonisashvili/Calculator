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
	private JPanel FuncPanel, InputPanel;
		

	
	
	
	
	
	//Changes
	public class MyButton extends Button{
		
		Button defButton = new Button();
		Color gray = new Color(100,100,100);
		Color white = new Color(0,0,0);
		
		
		public MyButton (Button defButton) {
			this.defButton = defButton;
		}
		
		
		public Button getButton() {
			return this.defButton;
		}
		
		public void ButColor(Button defButton) {
			this.defButton.setBackground(new Color(50,50,50));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public MyCalculator(){
				
		
		InputField = new JTextField("Input here");
				
		FuncPanel = new JPanel();
		InputField.setBackground(new Color(69,69,69));
		InputField.setForeground(Color.white);	
		FuncPanel.setLayout(new GridLayout(7,5));
		
				
		
		//Creating the numbered buttons and adding them to their own panel
		Button SndButton = new Button("2nd");
		Button PiButton = new Button("π");
		Button EButton = new Button("e");
		Button ClearButton = new Button("CE");
		Button EraseButton = new Button("Erase");
		Button SquaredButton = new Button("x^2");
		Button OveroneButton = new Button("1/x");
		Button AbsButton = new Button("|x|");
		Button ExpEButton = new Button("exp");
		Button ModButton = new Button("mod");
		Button RootButton = new Button("2nd/x");
		Button LeftParButton = new Button("(");
		Button RightParButton = new Button(")");
		Button FactButton = new Button("n!");
		Button ExpButton = new Button("x^y");
		Button TenExButton = new Button("10^x");
		Button LogButton = new Button("log");
		Button LnButton = new Button("ln");		
		Button SymbButton = new Button("+/-");	
		Button OneButton = new Button("1");
		Button TwoButton = new Button("2");
		Button ThreeButton = new Button("3");
		Button FourButton = new Button("4");
		Button FiveButton = new Button("5");
		Button SixButton = new Button("6");
		Button SevenButton = new Button("7");
		Button EightButton = new Button("8");
		Button NineButton = new Button("9");
		Button ZeroButton = new Button("0");
		Button AddButton = new Button("+");		
		Button SubtractButton = new Button("-");
		Button DivideButton = new Button("/");
		Button MultiplyButton = new Button("X");
		Button EqualButton = new Button("=");
		Button DotButton = new Button(".");
		
		FuncPanel.add(SndButton);
		FuncPanel.add(PiButton);
		FuncPanel.add(EButton);
		FuncPanel.add(ClearButton);
		FuncPanel.add(EraseButton);
		FuncPanel.add(SquaredButton);
		FuncPanel.add(OveroneButton);
		FuncPanel.add(AbsButton);
		FuncPanel.add(ExpEButton);
		FuncPanel.add(ModButton);
		FuncPanel.add(RootButton);
		FuncPanel.add(LeftParButton);
		FuncPanel.add(RightParButton);
		FuncPanel.add(FactButton);
		FuncPanel.add(DivideButton);		
		FuncPanel.add(ExpButton);
		FuncPanel.add(SevenButton);
		FuncPanel.add(EightButton);
		FuncPanel.add(NineButton);
		FuncPanel.add(MultiplyButton);
		FuncPanel.add(TenExButton);
		FuncPanel.add(FourButton);
		FuncPanel.add(FiveButton);
		FuncPanel.add(SixButton);
		FuncPanel.add(SubtractButton);
		FuncPanel.add(LogButton);
		FuncPanel.add(OneButton);
		FuncPanel.add(TwoButton);
		FuncPanel.add(ThreeButton);
		FuncPanel.add(AddButton);
		FuncPanel.add(LnButton);
		FuncPanel.add(SymbButton);
		FuncPanel.add(ZeroButton);
		FuncPanel.add(DotButton);
		FuncPanel.add(EqualButton);
		
		/*
		 * DotButton.addActionListener(new ActionListener(){
		 * 
		 * public void actionPerformed(ActionEvent e) { CalcFrame.dispose(); } });
		 */
	
		
		InputField.addMouseListener(new MouseAdapter() {
			  @Override
			  public void mouseClicked(MouseEvent e) {
			    InputField.setText("");
			  }
			});
		
		CalcFrame.setLayout(new GridLayout(2,1));
		CalcFrame.add(InputField);
		CalcFrame.add(FuncPanel);
		CalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalcFrame.setSize(1000, 1000);
		CalcFrame.setVisible(true);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new MyCalculator();
		
	}
}