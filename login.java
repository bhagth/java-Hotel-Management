package hotelManagement;
import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
	
	login (){
		getContentPane ().setBackground(Color.pink);// change frmae color
		setLayout (null);
		setBounds (500,200,600,300);
		
		JLabel user = new JLabel ("UserName");
		user.setBounds(40,20,100,30);
		add(user);
		
		JTextField username = new JTextField ();
		username.setBounds(150,20,150,30);
		add(username);
		
		JLabel pass = new JLabel ("PassWord");
		pass.setBounds(40,70,100,30);
		add(pass);
		
		JTextField password = new JTextField ();
		password.setBounds(150,70,150,30);
		add(password);
		
		JButton button = new JButton ("Login");
		button.setBounds(300,150,100,30);
		add(button);
		
		JButton cancel = new JButton ("cancel");
		cancel.setBounds (40,150,100,30);
		add(cancel);
		
		ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("user.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);// crop the image
		ImageIcon i3 = new ImageIcon (i2);
		JLabel image = new JLabel (i3);
		image.setBounds (350,10,200,100);
		
		add(image);
		
		
		setVisible (true);
	}

	public static void main(String[] args) {
		new login ();
		

	}

}
