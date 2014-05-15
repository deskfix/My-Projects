import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;



	public class test extends JFrame {
		
		private JList list;
		private String[] brandnames = {"Toyota","BMW","Honda","Nissan","Renault","Peugeot","Porsche","Ferrari"};
		
		public test()
		{
			
			super("Brandnames List");
			setLayout (new FlowLayout());
			
			list = new JList(brandnames);
			list.setVisibleRowCount(4);
			add(new JScrollPane(list));
			
		}
	}

