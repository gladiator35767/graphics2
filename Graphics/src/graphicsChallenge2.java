import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class graphicsChallenge2 extends Canvas
	{
		private static final long serialVersionUID = 1L;
		static Scanner Square;
		static int Size;
		static Scanner shapeColor;
		static int setColor;

		public static void main(String[] args)
			{
				graphicsChallenge2 canvas = new graphicsChallenge2();
		        JFrame frame = new JFrame();
		        frame.setSize(1000, 1000);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(true);
		        frame.setVisible(true);	
			}
		public void paint(Graphics graphics)
		{
			Square = new Scanner(System.in);
			System.out.println("How big would you like your square");
			Square.nextInt();			
		}

	}
