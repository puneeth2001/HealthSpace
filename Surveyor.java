import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Surveyor implements ActionListener {
    JFrame j; JButton b,b2,b3;
    JTextField username,email,phoneno,PinCode,areaname;
    public void signup(){
    	j = new JFrame("Hello Surveyor");
        JLabel l1=new JLabel("Name");  

        username = new JTextField("Enter Name");

        JLabel l2=new JLabel("Email");  

        email = new JTextField();

        JLabel l3=new JLabel("phone no"); 

        phoneno = new JTextField();

        l3.setBounds(10,150, 120,50); 
        b = new JButton("Sign Up");


        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l1.setBounds(10,50, 120,50);  
        l1.setForeground(Color.black);
        username.setBounds(80,60,120,30);
        username.setBorder(border );
        l2.setBounds(10,100, 120,50);
        l2.setForeground(Color.black);
        email.setBounds(80,110,120,30);
        email.setBorder(border );
        l3.setForeground(Color.black);
        phoneno.setBounds(80, 160, 120, 30);
        phoneno.setBorder(border );
        b.setBounds(80,300,100,30);
        b.setBorder(border );
        b.setBackground(Color.YELLOW);
        j.add(username);  j.add(b);j.add(email);j.add(l1);j.add(l2);j.add(l3);j.add(phoneno);
        b.addActionListener(this);
        j.setSize(400,500);
        j.getContentPane().setBackground(Color.LIGHT_GRAY);
        j.setLayout(null);
        j.setVisible(true);
   
    }
    public void signin() {
    	j = new JFrame("Sign In");
        JLabel l1=new JLabel("Username");  

        username = new JTextField("enter username");

        JLabel l2=new JLabel("Password");  

        JPasswordField password = new JPasswordField();

        b = new JButton("Sign In");


        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l1.setForeground(Color.black);
        l1.setBounds(10,50, 120,50);  
        username.setBounds(120,60,120,30);
        username.setBorder(border );
        l2.setBounds(10,100, 120,50); 
        l2.setForeground(Color.black);
        password.setBounds(120,110,120,30);
        password.setBorder(border );
        b.setBackground(Color.YELLOW);
        b.addActionListener(this);
        b.setBounds(210,300,100,30);
        b.setBorder(border );
        j.add(username);  j.add(b);j.add(password);j.add(l1);j.add(l2);
        j.setSize(400,500);
        j.getContentPane().setBackground(Color.LIGHT_GRAY);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void survey() {
    	j = new JFrame("Area");
        JLabel l1=new JLabel("Name");  

    areaname = new JTextField();

   JLabel l2=new JLabel("Pin-Code");

    PinCode = new JTextField();

   b2 = new JButton("Add Patient");


   Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
   l1.setBounds(10,50, 120,30);  
   l1.setForeground(Color.black);
   areaname.setBounds(120,50,120,30);
   areaname.setBorder(border );
   l2.setBounds(10,100, 120,30);
   l2.setForeground(Color.black);
   PinCode.setBounds(120,100,120,30); 
   PinCode.setBorder(border );
   b2.setBounds(120,300,300,30);
   b2.setBorder(border );
   b2.setBackground(Color.YELLOW);
   j.add(areaname);  j.add(b2);j.add(PinCode);j.add(l1);j.add(l2);
   b2.addActionListener(this);
   j.getContentPane().setBackground(Color.LIGHT_GRAY);
   j.setSize(500,500);
   j.setLayout(null);
   j.setVisible(true);
    }
    public void createPage() {
		String userkanam = username.getText();
		BufferedWriter out;
		try {
			
			File file = new File("surveyor/"+userkanam+".txt");

			if(file.exists()==true) {
				FileWriter fw = new FileWriter(file,true);
				out = new BufferedWriter(fw);
				PrintWriter write = new PrintWriter(out);
				System.out.print("Populating");
				write.print(phoneno.getText()+"\n"+email.getText()+"\n");
			}
			else {
				FileWriter fw = new FileWriter(file,true);
				 out = new BufferedWriter(fw);
				PrintWriter write = new PrintWriter(out);
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