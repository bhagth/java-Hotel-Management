package Htm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class dashBoard extends JFrame {
	
	dashBoard (){
		
		setBounds (0,0,1550,1000);
		setLayout (null);
		
		ImageIcon icon = new ImageIcon (ClassLoader.getSystemResource("dsb.jpg"));
		Image i1 = icon.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon (i1);
		JLabel image = new JLabel (i2);
		image.setBounds(0,0,1500,1000);
		add (image);
		
		JLabel text = new JLabel ("Welcom to Tag Group");
		text.setBounds(450,80,1000,50);
		
		text.setFont (new Font ("serif",Font.PLAIN,45));
		text.setForeground (Color.YELLOW);
		image.add(text);
		JMenuBar menu = new JMenuBar();
		menu.setBounds(0, 0, 1550, 30);
		image.add(menu);
		
		JMenu hmt = new JMenu ("Hotel Management");
		hmt.setForeground(Color.RED);
		menu .add(hmt);
		
		JMenu admin = new JMenu ("admin");
		admin.setForeground(Color.red);
		menu.add(admin);
		
		JMenuItem employee = new JMenuItem ("employee");
		employee.setForeground(Color.blue);
		admin.add(employee);
		
		JMenuItem mang = new JMenuItem ("manager");
		mang.setForeground(Color.blue);
		admin.add(mang);
		
		JMenuItem hr = new JMenuItem ("hr");
		hr.setForeground(Color.blue);
		admin.add(hr);
		
		JMenuItem rectp = new JMenuItem ("reception");
		rectp.setForeground(Color.blue);
		hmt.add(rectp);
		
		JMenuItem wait = new JMenuItem ("waiter");
		wait .setForeground(Color.blue);
		hmt.add(wait);
		
		JLabel name = new JLabel ("name");
		name.setBounds(400,300,100,50);
		name.setForeground(Color.white);
		name.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(name);
		
		JTextField nm = new JTextField ();
		nm.setBounds(600,300,250,50);
		image.add(nm);
		
		JLabel ph = new JLabel ("Ph No");
		ph.setBounds(400,400,100,50);
		ph.setForeground(Color.white);
		ph.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(ph);
		
		JTextField call = new JTextField ();
		call.setBounds(600,400,250,50);
		image.add(call);
		
		JLabel gend = new JLabel ("gender");
		gend.setBounds(400,500,100,50);
		gend.setForeground(Color.white);
		gend.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(gend);
		
		JRadioButton  male = new JRadioButton ("male");
		male.setBounds(600,500,75,50);
		male.setForeground(Color.MAGENTA);
		image.add(male);
		
		JRadioButton fml = new JRadioButton ("female");
		fml.setBounds(750,500,75,50);
		fml.setForeground(Color.MAGENTA);
		image.add(fml);
		
		JLabel job = new JLabel ("job");
		job.setBounds(400,600,100,50);
		job.setForeground(Color.white);
		job.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(job);
		
		String str [] = {"front desk clerks ","waiters","porters","house keeping","drivers","receptionist","kiten staff","accountent"};
		JComboBox jcb = new JComboBox (str);
		
		jcb.setForeground(Color.red);
		jcb.setBackground(Color.BLACK);
		jcb.setBounds(600,600,200,50);
		image.add(jcb);
		
		
		JLabel email = new JLabel ("gmail");
		email.setBounds(400,700,100,50);
		email.setForeground(Color.white);
		email.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(email);
		
		JTextField jtf = new JTextField ();
		jtf.setBounds(600,700,250,50);
		image.add(jtf);
		
		JLabel aadar = new JLabel ("aadar");
		aadar.setBounds(400,800,100,50);
		aadar.setForeground(Color.white);
		aadar.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(aadar);
		
		
		JTextField ad = new JTextField ();
		ad.setBounds(600,800,250,50);
		image.add(ad);
		
		JLabel sr = new JLabel ("salary");
		sr.setBounds(400,900,100,50);
		sr.setForeground(Color.white);
		sr.setFont(new Font ("serif",Font.HANGING_BASELINE,30));
		image.add(sr);
		
		JTextField slr = new JTextField ();
		slr.setBounds(600,900,250,50);
		image.add(slr);
		
		JButton sub = new JButton ("submit");
		sub .setBounds(1050,900,100,50);
		sub.setFont(new Font ("serif",Font.ITALIC,20));
		sub.setForeground(Color.magenta);
		image.add(sub);
		

		
		
		setVisible (true);
		
	}

	public static void main(String[] args) {
		           new dashBoard ();
	}

}
