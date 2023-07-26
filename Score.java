
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name , int score)
    {
        setBounds(600,150,750,550);
      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
       Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank you "+ name + " for playing knowledge.io");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font ("Georgia" , Font.PLAIN,24) );
        add(heading);
        
         JLabel fscore = new JLabel("Your score is "+ score );
        fscore.setBounds(450, 200, 300, 30);
        fscore.setFont(new Font ("Futura" , Font.PLAIN,24) );
        add(fscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(475, 270, 120, 30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
       add(submit);
        
        setVisible (true);
    }
    
    public void actionPerformed (ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    
 public static void main (String []args)
 {
     new Score("User",0);
 }
    
}
