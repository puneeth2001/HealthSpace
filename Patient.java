import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;
import javax.swing.border.Border;

public class Patient extends JFrame implements ActionListener{
	JFrame j; JButton b4,submit; JLabel l1,l4,l5,l6,l7; JTextField name,j4,j5,j6,j7;
	JComboBox cb;
	Patient(){
		j = new JFrame("Patient");
        JLabel l1=new JLabel("Name");  

         name = new JTextField("Enter Name");

         l4=new JLabel("Age");  

          j4= new JTextField();

          l5= new JLabel("Disease");
          l6=new JLabel("ph.no");
          l7=new JLabel("Severity");

         j5= new JTextField();
         j6= new JTextField();
         j7= new JTextField();

         String severity[]={"Low","Mid","High","Very High"};        
         JComboBox cb=new JComboBox(severity);    
         cb.setBounds(120,290,90,30);   

         j.add(cb);    
         b4 = new JButton("Add Aadhar");

         submit = new JButton("Submit");

         submit.addActionListener(this);


         Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
         l1.setBounds(10,50, 120,50);  
         l1.setForeground(Color.black);
         name.setBounds(120,60,120,30);
         name.setBorder(border );
         l4.setBounds(10,125, 120,50);
         l4.setForeground(Color.black);
         j4.setBorder(border );
         l5.setBounds(10,175 ,120 ,50);
         l6.setBounds(10,225 ,120 ,50);
         l7.setBounds(10,275,120 ,50 );
         l5.setForeground(Color.black);
         l6.setForeground(Color.black);
         l7.setForeground(Color.black);
         j7.setBorder(border );
         j6.setBorder(border );
         j5.setBorder(border );
         j4.setBounds(120,135,120,30);
         j5.setBounds(120,185 ,120 ,30);
         j6.setBounds(120,235 ,120 ,30);
         cb.setBorder(border );
         cb.setBackground(Color.orange);
         b4.setBounds(120,350,250,30);
         b4.setBackground(Color.YELLOW);
         b4.setBorder(border );
         submit.setBorder(border );
         submit.setBounds(120,375,250,30);
         submit.setBackground(Color.YELLOW);
         
        j.add(name);j.add(l1);j.add(l4);j.add(l5);j.add(l6);j.add(l7);
        j.add(j4);j.add(j5);j.add(j6); j.add(submit);
        j.setSize(400,500);
        j.getContentPane().setBackground(Color.LIGHT_GRAY);
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
