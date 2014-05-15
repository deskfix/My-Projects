import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.*;

public class test extends JFrame {

	private JButton button1;
	TextField keimeno = new TextField(30);
	int number_clicks =0;
	
	public test()
	{
		super("Titlos Efarmogis");
		setLayout(new FlowLayout());
		
		button1 = new JButton("Button");
		button1.setToolTipText("This is a button");
		button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		button1.setFocusable(false);
		button1.addActionListener(new EnableButton());
		add(button1);
		add(keimeno);
	}
	public class EnableButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			number_clicks++;
			keimeno.setText("The button has been pressed " + number_clicks + " times");
		}

		
		}
	}
	
	

