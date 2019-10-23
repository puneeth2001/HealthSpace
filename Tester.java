import java.awt.*;  
import javax.swing.JFrame;  
  
public class Tester extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("First.jpg");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        Tester m=new Tester();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  
