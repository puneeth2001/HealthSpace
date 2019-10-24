package oops_project;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Index extends JFrame implements ActionListener {
    JRadioButton r1,r2; JFrame j,j2; JButton b,b2;
    Index() {
         j = new JFrame("Hello");

        JLabel l1=new JLabel("Username");  
        
        JTextField username = new JTextField("enter username");
        username.setBounds(120,60,120,30);
        
        JLabel l2=new JLabel("Password");  
       
        JPasswordField password = new JPasswordField();
       
        JLabel l3=new JLabel("Confirm Password");  
       
        JPasswordField confirmpassword = new JPasswordField();
       
        JLabel l4=new JLabel("Group");  
       
         r1=new JRadioButton("A) Surveyor");    
         r2=new JRadioButton("B) Medical");    
        r2.addActionListener(this);
        r1.setBounds(120,215,110,30);
        r1.addActionListener(this);    
        r2.setBounds(120,250,100,30);    
        r2.addActionListener(this);
       
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
         b = new JButton("Sign Up");
        
        b2 = new JButton("Sign In");
        b2.setBounds(275,425,100,30);
       
        
        l1.setBounds(10,50, 120,50);  
        l1.setForeground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.BLACK,2);
        username.setBorder(border );
        username.setForeground(Color.BLACK);
        l2.setBounds(10,100, 120,50); 
        l2.setForeground(Color.black);
        password.setBounds(120,110,120,30);
        password.setBorder(border );
        password.setForeground(Color.BLACK);
        l3.setBounds(10,150, 120,30); 
        l3.setForeground(Color.black);
        confirmpassword.setBounds(120,150,120,30);
        confirmpassword.setForeground(Color.BLACK);
        confirmpassword.setBorder(border );
        l4.setBounds(10,225, 120,30); 
        l4.setForeground(Color.black);
        l3.setForeground(Color.black);
        r1.setBackground(Color.LIGHT_GRAY);
        r2.setBackground(Color.LIGHT_GRAY);
        b.setBackground(Color.YELLOW);
        b.setBounds(120,300,100,30);
        b.setBorder(border );
        b2.setBorder(border );
        b2.setBackground(Color.YELLOW);
        j.add(username);  j.add(b);j.add(password); j.add(confirmpassword);j.add(l1);j.add(l2);j.add(l3);j.add(r1);j.add(r2);
        j.add(l4); j.add(b2);
        b.addActionListener(this);
        b2.addActionListener(this);
        j.setSize(400,500);
        j.getContentPane().setBackground(Color.LIGHT_GRAY);
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