import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class graphicsChallenge2 extends Canvas
	{
		private static final long serialVersionUID = 1L;
		static Scanner userInput;
		static int Size;
		static Scanner shapeColor;
		static String setColor;
		static int x = 100;
		static int speed = 3;
		static int y = 0;
		static int i = 0;

		public static void main(String[] args)
			{
//				takeInput();
				graphicsChallenge2 canvas = new graphicsChallenge2();
		        JFrame frame = new JFrame();
		        frame.setSize(1000, 1000);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(true);
		        frame.setVisible(true);	
			}
//		public static void takeInput()
//			{
//				Scanner userInput = new Scanner (System.in);
//				System.out.println("What would you like the size of"
//						+ " the your square to be?(Maximum 999)");
//				shapeColor = new Scanner(System.in);
//				Size = userInput.nextInt();
//				
//				Scanner userInput2 = new Scanner(System.in);
//				System.out.println("Between red and blue which color would"
//						+ " you like your square to be? (red or blue)");
//				setColor = userInput2.nextLine();
//			}
//		
//		public void paint(Graphics graphics)
//		{
//			if(setColor.equals("red"))
//				{
//					graphics.setColor(Color.red);
//					graphics.fillRect(0, 0, Size, Size);
//					
//				}
//			if(setColor.equals("blue"))
//				{
//					graphics.setColor(Color.blue);
//					graphics.fillRect(0, 0, Size, Size);
//				}
//	    }
		
//		public void paint(Graphics graphics)
//		{
//			for (int r = 0; r < 255; r++)
//				{
//					for (int g = 0; g < 255; g++)
//						{
//							for (int b = 0; b < 255; b++)
//								{
//									graphics.setColor(new Color(r, g, b));
//									graphics.fillRect(0, 0, 100, 100);
//									delay();
//								}
//						}
//				}
//		}
		public void paint(Graphics graphics)
		{
		
        for (int i = 0; i < 350; i++)
        	{
        		for (int j = 0; j <500; j++)
        			{
	        graphics.setColor(Color.blue);
	        graphics.fillRect(j, i, 50, 50);
	        
	        delay();
	        
	        graphics.setColor(Color.white);
	        graphics.fillRect(j, i, 50, 50);
        			}
        	}
		}
		
		
		
		
		
//		public void paint(Graphics graphics)
//		{
//        while(true)
//        	{
//			x = x + speed;
//
//					graphics.setColor(Color.blue);
//					graphics.fillRect(x, 20, 20, 20);
//					
//					delay();
//					
//					graphics.setColor(Color.white);
//					graphics.fillRect(x, 20, 20, 20);
//					
//			if(x > 980 || x < 0)
//				speed = -speed;
//			
//        	}
        
//			for(int i = 0; i < 500; i++)
//				{
//					graphics.setColor(Color.red);
//					graphics.fillRect(i, i, 100, 100);
//					
//					graphics.setColor(Color.white);
//					graphics.fillRect(i, i, 100, 100);
//				}
			
//		}
		public void delay()
		{
			try
				{
					Thread.sleep(1);
				} catch (InterruptedException e)
				{
			    e.printStackTrace();
				}
		}
	}
