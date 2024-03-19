package hotelManagement;
import javax.swing.*;
import java.awt.*;

public class dashBoard extends JFrame {
	public dashBoard () {
		setBounds (0,0,1550,1000);
		
		setLayout (null);
		
		ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("hotel.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon (i2);
		JLabel image = new JLabel (i3);
		image.setBounds(0,0,1550,1000);
		add(image);
		
		JLabel text = new JLabel ("welcome to taj group");
		text.setBounds(450,80,1000,50);
		text.setFont (new Font ("serif",Font.PLAIN,45));
		text.setForeground(Color.white);
		
		image.add(text);
		
		
		JMenuBar mb = new JMenuBar ();
		mb.setBounds (0,0,1550,20);
		image.add(mb);
		JMenu hotel = new JMenu ("HOTEL MANAGEMENT");
		hotel.setForeground(Color.red);
		mb.add(hotel);
		
		JMenu admin = new JMenu ("admin");
		admin.setForeground(Color.blue);
		mb.add(admin);
		JMenuItem reception = new JMenuItem ("reception");
		reception.setForeground(Color.magenta);
	    hotel.add(reception);
	    
	   
	    
	    JMenuItem employee = new JMenuItem ("add employee");
	    employee.setForeground(Color.magenta);
	    admin.add(employee);
	    
	    JMenuItem rooms = new JMenuItem ("add rooms");
	    rooms.setForeground(Color.magenta);
	    admin.add(rooms);
	    
	    JMenuItem adress = new JMenuItem ("add address");
	    adress.setForeground(Color.magenta);
	    admin.add(adress);
		
		setVisible (true);
		
	}

	public static void main(String[] args) {
		new dashBoard ();

	}

}
