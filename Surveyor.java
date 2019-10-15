import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Surveyor implements ActionListener {
    JFrame j; JButton b,b2,b3;
    public void signup(){
         j = new JFrame("Hello Surveyor");

        JLabel l1=new JLabel("Name");  
        l1.setBounds(0,50, 120,50);  
        JTextField username = new JTextField("Enter Name");
        username.setBounds(120,50,120,50);
        JLabel l2=new JLabel("Email");  
        l2.setBounds(0,100, 120,50); 
        JTextField email = new JTextField();
        email.setBounds(120,100,120,50);
        JLabel l3=new JLabel("phoneno");  
        JTextField phoneno = new JTextField();
        phoneno.setBounds(120, 150, 120, 50);
        l3.setBounds(0,150, 120,50); 
         b = new JButton("Sign Up");
        b.setBounds(160,300,100,30);
        j.add(username);  j.add(b);j.add(email);j.add(l1);j.add(l2);j.add(l3);j.add(phoneno);
        b.addActionListener(this);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void signin() {
    	j = new JFrame("Sign In");
        JLabel l1=new JLabel("Username");  
        l1.setBounds(0,50, 120,50);  
        JTextField username = new JTextField("enter username");
        username.setBounds(120,50,120,50);
        JLabel l2=new JLabel("Password");  
        l2.setBounds(0,100, 120,50); 
        JPasswordField password = new JPasswordField();
        password.setBounds(120,100,120,50);
         b = new JButton("Sign In");
        b.addActionListener(this);
        b.setBounds(210,300,100,30);
        j.add(username);  j.add(b);j.add(password);j.add(l1);j.add(l2);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void survey() {
        j = new JFrame("Area");
       JLabel l1=new JLabel("Name");  
       l1.setBounds(0,50, 120,50);  
       JTextField username = new JTextField();
       username.setBounds(120,50,120,50);
       JLabel l2=new JLabel("Pin-Code");  
       l2.setBounds(0,100, 120,50); 
       JTextField PinCode = new JTextField();
       PinCode.setBounds(120,100,120,50); 
        b2 = new JButton("Add Patient");
       b2.setBounds(120,300,300,30);
       j.add(username);  j.add(b2);j.add(PinCode);j.add(l1);j.add(l2);
       b2.addActionListener(this);
       j.setSize(500,500);
       j.setLayout(null);
       j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==b) {
    		j.dispose();
    		this.survey(); 
    	}
    	if(e.getSource()==b2) {
    		j.dispose();
    		new Patient();
    	}
    }
    
}