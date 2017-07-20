package last;

/**
 *
 * @author Administrator
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends  JFrame implements ActionListener {
  JLabel l; JButton b; JButton exit;
    /**
     * @param args the command line arguments
     */
    Main(){
    
    
    l =new JLabel("MULTIPLE CHOICE QUESTIONS");
    l.setBounds(130,150,700,100);
    l.setFont(l.getFont().deriveFont(32f));
    add(l);
    
    b =new JButton("GO");
    b.setBounds(200,250,150,50);
    
    add(b);
    b.addActionListener(this);
    
    exit = new JButton("EXIT");
    exit.setBounds(400,250,150,50);
    add(exit);
    exit.addActionListener(this);
    
    getContentPane().setBackground(Color.decode("#eaeff8"));
    //setBackground(Color.RED); 
   // getContentPane().setBackground(Color.LIGHT_GRAY);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setTitle(" QUIZ ");
    setSize(720, 500);
    //setSize(300,300);
    setResizable(false);
    setLayout(null);
    setVisible(true);
}
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()== b){
     
      multipleQuestion mul = new multipleQuestion();
      mul.ITT();
      mul.setVisible(true);
    
    }
      if (e.getSource() == exit){
          System.exit(1);
      }
    
    }
     public static void main(String[] args) {
     // JavaApplication49 javaApplication49 = new JavaApplication49();
     //javaApplication49.setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     Main main =new Main();
    }
    
    
}