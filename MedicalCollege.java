import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MedicalCollege extends JFrame implements ActionListener{
    JFrame j,f; JButton b,b3;
    public void signup(){
        j = new JFrame("Hello College");

       JLabel l1=new JLabel("Name");  

       JTextField username = new JTextField("Enter Name");

       JLabel l2=new JLabel("Locality");  

       JTextField locality = new JTextField();

       b = new JButton("Sign Up");


       Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
       l1.setBounds(10,50, 120,50);  
       l1.setForeground(Color.black);
       username.setBounds(120,60,120,30);
       username.setBorder(border );
       l2.setBounds(10,100, 120,50);
       l2.setForeground(Color.black);
       locality.setBounds(120,110,120,30);
       locality.setBorder(border );
       b.setBounds(160,300,100,30);
       b.setBackground(Color.YELLOW);
       b.setBorder(border );
       j.add(username);  j.add(b);j.add(locality);j.add(l1);j.add(l2);
       b.addActionListener(this);
       j.getContentPane().setBackground(Color.LIGHT_GRAY);
       j.setSize(400,500);
       j.setLayout(null);
       j.setVisible(true);
   }
    public void signin() {

    	j = new JFrame("College");
        JLabel l1=new JLabel("Username");  

        JTextField username = new JTextField();

        JLabel l2=new JLabel("Password");  

        JPasswordField password = new JPasswordField();

         b = new JButton("Sign In");


        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        l1.setBounds(10,50, 120,50);  
        l1.setForeground(Color.black);
        username.setBounds(120,60,120,30);
        username.setBorder(border );
        l2.setBounds(10,100, 120,50);
        l2.setForeground(Color.black);
        password.setBounds(120,110,120,30);
        password.setBorder(border );
        b.addActionListener(this);
        b.setBorder(border );
        b.setBackground(Color.YELLOW);
        b.setBounds(120,300,100,30);
        j.add(username);  j.add(b);j.add(password);j.add(l1);j.add(l2);
        j.setSize(400,500);
        j.getContentPane().setBackground(Color.LIGHT_GRAY);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void chooseplace() {
        f = new JFrame("Table");  
        String data[][]={{"101","nalgonda","670000"},{"102","chilkaluripet","780000"},{"101","vallikav","700000"}};    
        String column[]={"ID","village","people"};         
        JTable jt=new JTable(data,column);    
       
        jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() {  
          public void valueChanged(ListSelectionEvent e) {  
            String Data = null;  
            int[] row = jt.getSelectedRows();  
            int[] columns = jt.getSelectedColumns();
           
            for (int i = 0; i < row.length; i++) {  
              for (int j = 0; j < columns.length; j++) {  
                Data = (String) jt.getValueAt(row[i], columns[j]);  
              } 
              }  
            System.out.println(Data);   
          }       
        });    
        
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 200);  
        f.setVisible(true);      	
    }
    public ArrayList openAllFiles() {
    	String directory = "Patient";
    	ArrayList<ArrayList<String> > aList =  
                new ArrayList<ArrayList<String> >(10); 
    	
    	
    	File dir = new File(directory);
    	File[] files = dir.listFiles();
    	for(File f : files) {
    		int j =0;
    		try {
    			ArrayList<String> ar = new ArrayList<String>(3); 
				Scanner scan = new Scanner(f);
				while(scan.hasNext()) {
					int i =0;
					
					String val = scan.nextLine();
					ar.add(i, val);
					i++;
					if(i==2) {
						i=0;
						
					}
					aList.add(ar);
					
				}
				
				scan.close();
		
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	}
    	return aList;
    	
    }
    public void details() {
    	j = new JFrame("College");
        JLabel l1=new JLabel("Username"); 
        b3 = new JButton("Select Village");


        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        b3.setBounds(50,300,200,30);
        b3.setBorder(border );
        j.add(b3); j.add(l1);
        b3.addActionListener(this);
        b3.setBackground(Color.YELLOW);
        j.getContentPane().setBackground(Color.LIGHT_GRAY);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);

        
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==b) {
    		this.openAllFiles();
    		j.dispose();
    		details();
    	}
    	if(e.getSource()==b3) {
    		j.dispose();
    		chooseplace();
    	}
    }
}
