package hotelManagement;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.*;




public  class  hotelManagement extends JFrame implements ActionListener{
	
	hotelManagement ()  {
		
		//setSize(1250, 565);
		//setLocation(100,100);
		setBounds (100,100,1250,565);
		setLayout(null);
		ImageIcon icon = new ImageIcon (ClassLoader.getSystemResource("new.jpg"));
		
		JLabel image = new JLabel (icon);
		image.setBounds(0,0,1250,565);
		add(image);
		
		JLabel text = new JLabel ("HOTEL MANAGEMENT SYSTEM");
		text.setBounds(20,430,1000,90);
		text.setForeground(Color.BLUE);
		text .setFont(new Font ("serif",Font.PLAIN,30));
		
		image.add(text);
		JButton next = new JButton ("NEXT");
		image.add(next);
		next.setBounds(1000,450,100,60);
		next.setBackground(Color.DARK_GRAY);
		next.setForeground(Color.white);
		next.setFont((new Font ("serif",Font.PLAIN,20)));
		next.addActionListener(this);
		setVisible(true);
		
		while (true) {
			text.setVisible(false);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				e.printStackTrace();
				
			}
			text.setVisible(true);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
		
		
	}
	public void actionPerformed (ActionEvent ae) {
		setVisible (false);// current frame close and next one open 
		new login();
		
	}

	
	

	public static void main(String[] args)  {
	  new  hotelManagement   () ;


	}

}
