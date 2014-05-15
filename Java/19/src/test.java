import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.*;

public class test extends JFrame {
	

	private JCheckBox sqrt;
	private TextField text;

	public test()
	{
		super("Program for finding the Square Root");
		setLayout(new FlowLayout());
		
		
		text = new TextField(10);
		add(text);
		
		sqrt = new JCheckBox("Find the square root");
		sqrt.setFocusable(false);
		sqrt.addActionListener(new SQRT());
		add(sqrt);
	}
	
	public class SQRT implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double a,b;
			a=(new Double(text.getText())).doubleValue();
			b=Math.sqrt(a);
			text.setText(Double.toString(b));
		}
	}
}
