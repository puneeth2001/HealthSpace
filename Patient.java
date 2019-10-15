import javax.swing.*;
public class Patient extends JFrame{
	JFrame j; JButton b4;
	
	Patient(){
        j = new JFrame("Patient");
        JLabel l1=new JLabel("Name");  
        l1.setBounds(0,50, 120,50);  
        JTextField name = new JTextField("Enter Name");
        name.setBounds(120,50,120,50);
        JLabel l4=new JLabel("Age");  
        l4.setBounds(0,125, 120,50); 
        JTextField j4= new JTextField();
         JLabel l5= new JLabel("Disease");
         JLabel l6=new JLabel("ph.no");
         JLabel l7=new JLabel("Severity");
         l5.setBounds(0,175 ,120 ,50);
         l6.setBounds(0,225 ,120 ,50);
         l7.setBounds(0,275,120 ,50 );
         JTextField j5= new JTextField();
         JTextField j6= new JTextField();
         JTextField j7= new JTextField();
         j4.setBounds(120,125,120,50);
         j5.setBounds(120,175 ,120 ,50);
         j6.setBounds(120,225 ,120 ,50);
         String severity[]={"Low","Mid","High","Very High"};        
         JComboBox cb=new JComboBox(severity);    
         cb.setBounds(120, 305,90,20);    
         j.add(cb);    
         b4 = new JButton("Add Aadhar");
         b4.setBounds(120,350,250,20);
         j.add(b4);
        j.add(name);j.add(l1);j.add(l4);j.add(l5);j.add(l6);j.add(l7);
        j.add(j4);j.add(j5);j.add(j6);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
	}
}
