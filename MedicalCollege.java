import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MedicalCollege extends JFrame implements ActionListener{
    JFrame j,f; JButton b,b3;
    public void signup(){
         j = new JFrame("Hello College");

        JLabel l1=new JLabel("Name");  
        l1.setBounds(0,50, 120,50);  
        JTextField username = new JTextField("Enter Name");
        username.setBounds(120,50,120,50);
        JLabel l2=new JLabel("Locality");  
        l2.setBounds(0,100, 120,50);
        JTextField locality = new JTextField();
        locality.setBounds(120,100,120,50);
         b = new JButton("Sign Up");
        b.setBounds(160,300,100,30);
        j.add(username);  j.add(b);j.add(locality);j.add(l1);j.add(l2);
        b.addActionListener(this);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void signin() {
    	j = new JFrame("College");
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
    public void chooseplace() {
        f = new JFrame("Table");  
        String data[][]={ {"101","nalgonda","670000"}, {"102","chilkaluripet","780000"},{"101","vallikav","700000"}};    
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
    public void details() {
    	j = new JFrame("College");
       JLabel l1=new JLabel("Username"); 
       b3 = new JButton("Select Village");
       b3.setBounds(50,300,200,30);
       j.add(b3); j.add(l1);
       b3.addActionListener(this);
       j.setSize(400,500);
       j.setLayout(null);
       j.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==b) {
    		j.dispose();
    		details();
    	}
    	if(e.getSource()==b3) {
    		j.dispose();
    		chooseplace();
    	}
    }
}
