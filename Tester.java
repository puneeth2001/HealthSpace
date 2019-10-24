import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;  
  
public class Tester extends Canvas{  
        public static void main(String[] args) {  
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
    				
    				while(scan.hasNextLine()) {
    					int i =0;
    					
    					String val = scan.nextLine();
    					
    					ar.add(i, val);
    					
    					i++;
    					aList.add(ar);
    					if(i==0) {
    						i=0;
    						
    					}
    					
    					
    				}
    				
    				
    				scan.close();
    		
    			
    			} catch (FileNotFoundException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        		
        		
        	}
        	System.out.println(aList);
    }  
  
}  
