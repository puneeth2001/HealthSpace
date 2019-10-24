import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;

public class Patient extends JFrame implements ActionListener{
	JFrame j; JButton b4,submit; JLabel l1,l4,l5,l6,l7; JTextField name,j4,j5,j6,j7;
	JComboBox cb;
	Patient(){
        j = new JFrame("Patient");
        JLabel l1=new JLabel("Name");  
        l1.setBounds(0,50, 120,50);  
         name = new JTextField("Enter Name");
        name.setBounds(120,50,120,50);
         l4=new JLabel("Age");  
        l4.setBounds(0,125, 120,50); 
          j4= new JTextField();
          l5= new JLabel("Disease");
          l6=new JLabel("ph.no");
          l7=new JLabel("Severity");
         l5.setBounds(0,175 ,120 ,50);
         l6.setBounds(0,225 ,120 ,50);
         l7.setBounds(0,275,120 ,50 );
         j5= new JTextField();
         j6= new JTextField();
         j7= new JTextField();
         j4.setBounds(120,125,120,50);
         j5.setBounds(120,175 ,120 ,50);
         j6.setBounds(120,225 ,120 ,50);
         String severity[]={"Low","Mid","High","Very High"};        
         JComboBox cb=new JComboBox(severity);    
         cb.setBounds(120, 305,90,20);    
         j.add(cb);    
         b4 = new JButton("Add Aadhar");
         b4.setBounds(120,350,250,20);
         submit = new JButton("Submit");
         submit.setBounds(120,375,250,20);
         submit.addActionListener(this);
         j.add(b4);
        j.add(name);j.add(l1);j.add(l4);j.add(l5);j.add(l6);j.add(l7);
        j.add(j4);j.add(j5);j.add(j6); j.add(submit);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
        
	}
/*	public void paint(Graphics g) {
		java.awt.Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("First.jpg");
		g.drawImage(i,120,100,this);
	}*/
    public void createPage() {
		String userkanam = name.getText();
		try {
			FileWriter fw = new FileWriter("Patient/"+userkanam+".txt");
			
			fw.write(j4.getText()+"\n"+j5.getText()+"\n"+j6.getText()+"\n"+j7.getText());
			fw.close();
		}
		catch (Exception eh) {
			eh.printStackTrace();
		} 	
    }
 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit) {
			j.dispose();
			this.createPage();
			System.out.print("created");
		}
	}
		
}
