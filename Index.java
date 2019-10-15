import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Index extends JFrame implements ActionListener {
    JRadioButton r1,r2; JFrame j,j2; JButton b,b2;
    Index() {
         j = new JFrame("Hello");

        JLabel l1=new JLabel("Username");  
        l1.setBounds(0,50, 120,50);  
        JTextField username = new JTextField("enter username");
        username.setBounds(120,50,120,50);
        JLabel l2=new JLabel("Password");  
        l2.setBounds(0,100, 120,50); 
        JPasswordField password = new JPasswordField();
        password.setBounds(120,100,120,50);
        JLabel l3=new JLabel("Confirm Password");  
        l3.setBounds(0,150, 120,50); 
        JPasswordField confirmpassword = new JPasswordField();
        confirmpassword.setBounds(120,150,120,50);
        JLabel l4=new JLabel("Group");  
        l4.setBounds(0,225, 120,50); 
         r1=new JRadioButton("A) Surveyor");    
         r2=new JRadioButton("B) Medical");    
        r2.addActionListener(this);
        r1.setBounds(160,200,110,30);
        r1.addActionListener(this);    
        r2.setBounds(160,250,100,30);    
        r2.addActionListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
         b = new JButton("Sign Up");
        b.setBounds(100,300,100,30);
        b2 = new JButton("Sign In");
        b2.setBounds(240,300,100,30);
        j.add(username);  j.add(b);j.add(password); j.add(confirmpassword);j.add(l1);j.add(l2);j.add(l3);j.add(r1);j.add(r2);
        j.add(l4); j.add(b2);
        b.addActionListener(this);
        b2.addActionListener(this);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected() && e.getSource()==b) {
        	j.dispose();
        	Surveyor s = new Surveyor();
        	s.signup();
        }
        if(r2.isSelected()&& e.getSource()==b) {
        	j.dispose();
        	MedicalCollege m = new MedicalCollege();
        	m.signup();
        }
        if(r1.isSelected() && e.getSource()==b2) {
        	Surveyor s = new Surveyor();
        	s.signin();
        }
        if(r2.isSelected() && e.getSource()==b2) {
        	MedicalCollege m = new MedicalCollege();
        	m.signin();
        }
    }
}