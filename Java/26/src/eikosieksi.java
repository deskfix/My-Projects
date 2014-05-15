import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;


public class eikosieksi extends JFrame {

	int wwidth = 400;
	int wheight = 400;
	int fdiameter = 200;
	int xf = 100;
	int yf = 100;
	int ewidth = 20;
	int xre = xf + 55;
	int yre = yf + 60;
	int xle = xf + 130;
	int yle = yf + 60;
	int mwidth = 100;
	int xmouth = xf + 50;
	int ymouth = yf + 150;
	
	public static void main(String args[])
	{
		eikosieksi fobject = new eikosieksi();
		fobject.setVisible(true);
	}
	
	public eikosieksi()
	{
		super("A simple face!");
		setSize(wwidth, wheight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics runner)
	{
		super.paint(runner);
		runner.drawOval(xf, yf, fdiameter, fdiameter);
		runner.drawLine(xre, yre, xre + ewidth, yre);
		runner.drawLine(xle, yle, xle + ewidth, yle);
		runner.drawLine(xmouth, ymouth, xmouth +mwidth, ymouth);
	}
	
}
