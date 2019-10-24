import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Surveyor implements ActionListener {
    JFrame j; JButton b,b2,b3;
    JTextField username,email,phoneno;
    public void signup(){
        j = new JFrame("Hello Surveyor");
        JLabel l1=new JLabel("Name");  
        l1.setBounds(0,50, 120,50);  
        username = new JTextField();
        username.setBounds(120,50,120,50);
        JLabel l2=new JLabel("Email");  
        l2.setBounds(0,100, 120,50); 
        email = new JTextField();
        email.setBounds(120,100,120,50);
        JLabel l3=new JLabel("phoneno");  
        phoneno = new JTextField();
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
        username = new JTextField("enter username");
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
    public void createPage() {
		String userkanam = username.getText();
		try {
			File file = new File("surveyor/"+userkanam+".txt");
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter out = new BufferedWriter(fw);
			PrintWriter write = new PrintWriter(out);
			if(file.exists()) {
				System.out.print("Populating");
				write.print(phoneno.getText()+"\n"+email.getText()+"\n");
			}
			else {
				file.createNewFile();
				System.out.print("Creating");
				write.print(phoneno.getText()+"\n"+email.getText()+"\n");
			}
		
			out.close();
		}
		catch (Exception eh) {
			eh.printStackTrace();
		} 	
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==b) {
    		this.createPage();
       		j.dispose();
    		this.survey(); 
    	}
    	if(e.getSource()==b2) {
    		j.dispose();
    		new Patient();
    	}
    }
    
}