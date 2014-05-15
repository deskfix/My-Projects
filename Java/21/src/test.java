import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.FlowLayout;


public class test extends JFrame{
	
	private JSlider sl;
	
	public test()
	{
		super("Slider for Java");
		setLayout (new FlowLayout());
		
		sl = new JSlider(JSlider.HORIZONTAL,0,45,0);
		sl.setMajorTickSpacing(10);
		sl.setMinorTickSpacing(1);
		sl.setPaintTicks(true);
		sl.setPaintLabels(true);
		add(sl);
	}

}
