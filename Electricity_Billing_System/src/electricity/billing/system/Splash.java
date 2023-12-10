package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 =i1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        add(image);
        
        setVisible(true);
        
        for(int i=2;i<600;i++){
            setSize(i+2,i);
            setLocation(700-(i/2),400-(i/2));
            try{
                Thread.sleep(5);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        t=new Thread(this); 
        t.start();
    }
    public void run(){
    try{
        Thread.sleep(5000);
        setVisible(false);
        
        new Login();
    
    }catch(Exception e){
        e.printStackTrace();
    }
    
    }
    
    public static void main(String[]args){
        new Splash();
        
    
    }
    
}
