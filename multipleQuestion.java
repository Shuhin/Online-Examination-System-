    package last;
    import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
    

    /**
     *
     * @author Administrator
     */
    public class multipleQuestion extends JFrame implements ActionListener{
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
        
        JRadioButton r1a,r1b, r1c,r1d,r2a,r2b, r2c,r2d,r3a,r3b, r3c,r3d,r4a,r4b, r4c,r4d,r5a,r5b, r5c,r5d, r6a,r6b, r6c,r6d,r7a,r7b, r7c,r7d,r8a,r8b, r8c,r8d,r9a,r9b, r9c,r9d,r10a,r10b, r10c,r10d;
        JButton b;

        void ITT(){
         
            //Question 1  starts----->
        l1= new JLabel("Q1: 0+3+2+1 = ?");
        l1.setBounds(50,0,300,100);
        l1.setFont(l1.getFont().deriveFont(28f));
        add(l1);

        //----------------------------------------
        r1a =new JRadioButton("4");
        r1a.setBackground(Color.decode("#7bed9f"));
        r1a.setFont(r1a.getFont().deriveFont(20f));
        r1a.setBounds(50,80,70,30);
        add(r1a);
        //-----------------------------------------
        r1b =new JRadioButton("6");
        r1b.setBackground(Color.decode("#7bed9f"));
        r1b.setFont(r1a.getFont().deriveFont(20f));
        r1b.setBounds(150,80,70,30);
        add(r1b);
        //-----------------------------------------
        r1c =new JRadioButton("60");
        r1c.setFont(r1c.getFont().deriveFont(20f));
        r1c.setBackground(Color.decode("#7bed9f"));
        r1c.setBounds(250,80,70,30);
        add(r1c);
        //-----------------------------------------
        r1d =new JRadioButton("70");
        r1d.setBackground(Color.decode("#7bed9f"));
        r1d.setFont(r1d.getFont().deriveFont(20f));
        r1d.setBounds(350,80,70,30);
        add(r1d);
        //-------------------------------------------

            //question 1 ends





           //Question 2 starts:------------------>
        l2= new JLabel("Q2: 3+1+20+10 = ?");
        l2.setBounds(50,100,300,100);
        l2.setFont(l2.getFont().deriveFont(28f));
        add(l2);
           //--------------------------------------
            r2a =new JRadioButton("34");
            r2a.setFont(r2a.getFont().deriveFont(20f));
            r2a.setBackground(Color.decode("#7bed9f"));
            r2a.setBounds(50,180,70,30);
            add(r2a);
           //--------------------------------------
           
        r2b =new JRadioButton("3");
        r2b.setBackground(Color.decode("#7bed9f"));
        r2b.setFont(r2b.getFont().deriveFont(20f));
        r2b.setBounds(150,180,70,30);
        add(r2b);
            //---------------------------------------
        r2c =new JRadioButton("0");
        r2c.setBackground(Color.decode("#7bed9f"));
        r2c.setFont(r2c.getFont().deriveFont(20f));
        r2c.setBounds(250,180,70,30);
        add(r2c);
        //------------------------------------------
        

        r2d =new JRadioButton("7");
        r2d.setBackground(Color.decode("#7bed9f"));
        r2d.setFont(r2d.getFont().deriveFont(20f));
        r2d.setBounds(350,180,70,30);

        add(r2d);
        //=--------------------------------------------
        

        //question 2 ends





        //question 3 starts-------->


        l3= new JLabel("Q3: 13+3 = ?");
        l3.setBounds(50,200,300,100);
        l3.setFont(l3.getFont().deriveFont(28f));
        add(l3);

        r3a =new JRadioButton("34");
        r3a.setBounds(50,280,70,30);
        r3a.setBackground(Color.decode("#7bed9f"));
        r3a.setFont(r3a.getFont().deriveFont(20f));
        add(r3a);
        //--------------------------------------------
        r3b =new JRadioButton("63");
        r3b.setBackground(Color.decode("#7bed9f"));
        r3b.setBounds(150,280,70,30);
        r3b.setFont(r3b.getFont().deriveFont(20f));
        add(r3b);
        //--------------------------------------------

        r3c =new JRadioButton("16");
        r3c.setBounds(250,280,70,30);
        r3c.setBackground(Color.decode("#7bed9f"));
        r3c.setFont(r3c.getFont().deriveFont(20f));
        add(r3c);
        //-----------------------------------------------
        
        r3d =new JRadioButton("710");
        r3d.setBounds(350,280,70,30);
        r3d.setBackground(Color.decode("#7bed9f"));
        r3d.setFont(r3d.getFont().deriveFont(20f));
        add(r3d);
        //----------------------------------------------
        


         //question 3 ends


         //question 4 starts

        l4= new JLabel("Q4: 32+3 = ?");
        l4.setBounds(50,300,300,100);
         l4.setFont(l4.getFont().deriveFont(28f));
        add(l4);

        //--------------------------------------------
        r4a =new JRadioButton("21");
        r4a.setBounds(50,380,70,30);
        r4a.setBackground(Color.decode("#7bed9f"));
        r4a.setFont(r4a.getFont().deriveFont(20f));
        add(r4a);
        //-----------------------------------------------
        r4b =new JRadioButton("11");
        r4b.setBounds(150,380,70,30);
        r4b.setBackground(Color.decode("#7bed9f"));
        r4b.setFont(r4b.getFont().deriveFont(20f));
        add(r4b);
        //------------------------------------------------

        r4c =new JRadioButton("35");
        r4c.setBounds(250,380,70,30);
        r4c.setBackground(Color.decode("#7bed9f"));
        r4c.setFont(r4c.getFont().deriveFont(20f));
        add(r4c);
        //--------------------------------------------------

        r4d =new JRadioButton("0");
        r4d.setBounds(350,380,70,30);
        r4d.setBackground(Color.decode("#7bed9f"));
        r4d.setFont(r4d.getFont().deriveFont(20f));
        add(r4d);
        //---------------------------------------------------

        //question 4 ends

        //question 5 starts 
        l5= new JLabel("Q5: 3+23 = ?");
        l5.setBounds(50,400,300,100);
        l5.setFont(l5.getFont().deriveFont(28f));
        add(l5);



        //--------------------------------------------------
        r5a =new JRadioButton("35");
        r5a.setBounds(50,480,70,30);
        r5a.setBackground(Color.decode("#7bed9f"));
        r5a.setFont(r5a.getFont().deriveFont(20f));
        add(r5a);
        //--------------------------------------------------
        r5b =new JRadioButton("121");
        r5b.setBounds(150,480,70,30);
        r5b.setBackground(Color.decode("#7bed9f"));
        r5b.setFont(r5b.getFont().deriveFont(20f));
        add(r5b);
        //--------------------------------------------------


        r5c =new JRadioButton("25");
        r5c.setBounds(250,480,70,30);
        r5c.setBackground(Color.decode("#7bed9f"));
        r5c.setFont(r5c.getFont().deriveFont(20f));
        add(r5c);
        //---------------------------------------------------

        r5d =new JRadioButton("10");
        r5d.setBounds(350,480,70,30);
        r5d.setBackground(Color.decode("#7bed9f"));
        r5d.setFont(r5d.getFont().deriveFont(20f));
        add(r5d);
        //--------------------------------------------------
        



         //quesrion 5 ends

    
         //Question 6  starts----->
    l6= new JLabel("Q6: 9+0+1 = ?");
    l6.setBounds(50,500,300,100);
    l6.setFont(l6.getFont().deriveFont(28f));
    add(l6);
    
    
    r6a =new JRadioButton("8");
    r6a.setFont(r6a.getFont().deriveFont(20f));
    r6a.setBackground(Color.decode("#7bed9f"));
    r6a.setBounds(50,580,70,30);
    add(r6a);
    
    r6b =new JRadioButton("10");
    r6b.setFont(r6a.getFont().deriveFont(20f));
    r6b.setBackground(Color.decode("#7bed9f"));
    r6b.setBounds(150,580,70,30);
    add(r6b);
    
    r6c =new JRadioButton("60");
    r6c.setBackground(Color.decode("#7bed9f"));
    r6c.setFont(r6c.getFont().deriveFont(20f));
    r6c.setBounds(250,580,70,30);
    add(r6c);
    
    r6d =new JRadioButton("50");
    r6d.setFont(r6d.getFont().deriveFont(20f));
    r6d.setBackground(Color.decode("#7bed9f"));
    r6d.setBounds(350,580,70,30);
    add(r6d);
    
  
        //question 6 ends
   
    
       
        

    //Question 7 starts:------------------>
    l7= new JLabel("Q7: 23+1+20+10 = ?");
    l7.setBounds(50,600,300,100);
    l7.setFont(l7.getFont().deriveFont(28f));
    add(l7);
    
      r7a =new JRadioButton("34");
      r7a.setFont(r7a.getFont().deriveFont(20f));
      r7a.setBackground(Color.decode("#7bed9f"));
      r7a.setBounds(50,680,70,30);
    add(r7a);
    
    r7b =new JRadioButton("32");
    r7b.setFont(r7b.getFont().deriveFont(20f));
    r7b.setBounds(150,680,70,30);
    r7b.setBackground(Color.decode("#7bed9f"));
    add(r7b);
    
    r7c =new JRadioButton("54");
    r7c.setFont(r7c.getFont().deriveFont(20f));
    r7c.setBackground(Color.decode("#7bed9f"));
    r7c.setBounds(250,680,70,30);
    add(r7c);
    
    r7d =new JRadioButton("77");
    r7d.setFont(r7d.getFont().deriveFont(20f));
     r7d.setBackground(Color.decode("#7bed9f"));
    r7d.setBounds(350,680,70,30);
    
    add(r7d);
    
   
    //question 2 ends
    
    //question 8 starts-------->
    
    
    l8= new JLabel("Q8: 13+12 = ?");
    l8.setBounds(50,700,300,100);
    l8.setFont(l8.getFont().deriveFont(28f));
    add(l8);
    
    r8a =new JRadioButton("54");
    r8a.setBounds(50,780,70,30);
    r8a.setBackground(Color.decode("#7bed9f"));
    r8a.setFont(r8a.getFont().deriveFont(20f));
    add(r8a);
    
    r8b =new JRadioButton("63");
    r8b.setBounds(150,780,70,30);
    r8b.setBackground(Color.decode("#7bed9f"));
    r8b.setFont(r8b.getFont().deriveFont(20f));
    add(r8b);
    
    
    r8c =new JRadioButton("66");
    r8c.setBounds(250,780,70,30);
    r8c.setBackground(Color.decode("#7bed9f"));
    r8c.setFont(r8c.getFont().deriveFont(20f));
    add(r8c);
    
    r8d =new JRadioButton("25");
    r8d.setBounds(350,780,70,30);
    r8d.setBackground(Color.decode("#7bed9f"));
    r8d.setFont(r8d.getFont().deriveFont(20f));
    add(r8d);
    
    
  
     //question 8 ends
     
     
     //question 9 starts
     
    l9= new JLabel("Q9: 90+ 11= ?");
    l9.setBounds(50,800,300,100);
    l9.setFont(l9.getFont().deriveFont(28f));
    add(l9);
    
     
    r9a =new JRadioButton("201");
    r9a.setBounds(50,880,70,30);
    
    r9a.setBackground(Color.decode("#7bed9f"));
    r9a.setFont(r9a.getFont().deriveFont(20f));
    add(r9a);
    
    r9b =new JRadioButton("101");
    r9b.setBounds(150,880,70,30);
    r9b.setBackground(Color.decode("#7bed9f"));
    r9b.setFont(r9b.getFont().deriveFont(20f));
    add(r9b);
    
    r9c =new JRadioButton("105");
    r9c.setBounds(250,880,70,30);
    r9c.setBackground(Color.decode("#7bed9f"));
    r9c.setFont(r9c.getFont().deriveFont(20f));
    add(r9c);
    
    
    r9d =new JRadioButton("0");
    r9d.setBounds(350,880,70,30);
    r9d.setBackground(Color.decode("#7bed9f"));
    r9d.setFont(r9d.getFont().deriveFont(20f));
    add(r9d);
    
    
    //question 9 ends
    
    //question 10 starts 
    l10= new JLabel("Q10: 11+11 = ?");
    l10.setBounds(50,880,300,100);
    l10.setFont(l10.getFont().deriveFont(28f));
    add(l10);
    
  
    
     
    r10a =new JRadioButton("35");
    r10a.setBounds(50,960,70,30);
    
      r10a.setBackground(Color.decode("#7bed9f"));
      r10a.setFont(r10a.getFont().deriveFont(20f));
    add(r10a);
    
    r10b =new JRadioButton("22");
    r10b.setBounds(150,960,70,30);
    r10b.setBackground(Color.decode("#7bed9f"));
    r10b.setFont(r10b.getFont().deriveFont(20f));
    add(r10b);
    
    
    r10c =new JRadioButton("25");
    r10c.setBounds(250,960,70,30);
      r10c.setBackground(Color.decode("#7bed9f"));
    r10c.setFont(r10c.getFont().deriveFont(20f));
    add(r10c);
    
    
    r10d =new JRadioButton("10");
    r10d.setBounds(350,960,70,30);
    r10d.setBackground(Color.decode("#7bed9f"));
    r10d.setFont(r10d.getFont().deriveFont(20f));
    add(r10d);


     //question 10 ends



         // checking button starts
        b= new JButton("check");
        b.setBounds(900,900,100,50);
        b.addActionListener(this);
        add(b);

        //checking button ends
         //s.setBounds(0,0,2000,2000);
            //Component add = add(s);
            //  JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        getContentPane().setBackground(Color.decode("#9fbef2"));
        //JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        //setContentPane(pane);
        setSize(1500,1500);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        //JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }


        public void actionPerformed (ActionEvent e){

            int sum=0;
            //for ques number 1
            if (r1b.isSelected()){
          //      JOptionPane.showMessageDialog(this," Q1 is correct");

                sum=sum+1;
            }   
            else if (r1a.isSelected()||r1c.isSelected()||r1d.isSelected()){
        //JOptionPane.showMessageDialog(b," Q1 is incorrect");
            }
            else{
                JOptionPane.showMessageDialog(this," you have not answered Q1","ALERT",JOptionPane.WARNING_MESSAGE);
            }
            //for question number 2
                 if (r2a.isSelected()){
                //JOptionPane.showMessageDialog(this," Q2 is correct");

                 sum = sum+1;
                 }   
            else if (r2b.isSelected()||r2c.isSelected()||r2d.isSelected()){
       // JOptionPane.showMessageDialog(b," Q2 is incorrect");
            }
                  else{
                JOptionPane.showMessageDialog(this," you have not answered Q2","ALERT",JOptionPane.WARNING_MESSAGE);
            }

        //for question number 3
                     if (r3c.isSelected()){
              //  JOptionPane.showMessageDialog(this," Q3 is correct");
                   sum = sum+1;
                     }   
            else if (r3b.isSelected()||r3a.isSelected()||r3d.isSelected()){
        //JOptionPane.showMessageDialog(b," Q3 is incorrect");
            }
                      else{
                JOptionPane.showMessageDialog(this," you have not answered Q3","ALERT",JOptionPane.WARNING_MESSAGE);
            }

            //for question number 4

                     if (r4c.isSelected()){
                //JOptionPane.showMessageDialog(this," Q4 is correct");
                    sum = sum+1;
                     }   
            else if (r4b.isSelected()||r4a.isSelected()||r4d.isSelected()){
        //JOptionPane.showMessageDialog(b," Q4 is incorrect");
            }
              else{
                JOptionPane.showMessageDialog(this," you have not answered Q4","ALERT",JOptionPane.WARNING_MESSAGE);
            }

           //for question number 5

                    if (r5c.isSelected()){
               // JOptionPane.showMessageDialog(this," Q5 is correct");
                sum = sum+1;
                    }   
            else if (r5b.isSelected()||r5a.isSelected()||r5d.isSelected()){
        //JOptionPane.showMessageDialog(b," Q5 is incorrect");
            }
         else{
                JOptionPane.showMessageDialog(this," you have not answered Q5","ALERT",JOptionPane.WARNING_MESSAGE);
            }

       // JOptionPane.showMessageDialog(b,"you have got"+sum);

        //if (sum==5){



        //}
        if (r6b.isSelected()){
      //      JOptionPane.showMessageDialog(this," Q6 is correct");
    
            sum=sum+1;
        }   
        else if (r6a.isSelected()||r6c.isSelected()||r6d.isSelected()){
    //JOptionPane.showMessageDialog(b," Q6 is incorrect");
        }
        else{
            JOptionPane.showMessageDialog(this," you have not answered Q6","ALERT",JOptionPane.WARNING_MESSAGE);
        }
        //for question number 7
             if (r7c.isSelected()){
            //JOptionPane.showMessageDialog(this," Q7 is correct");
    
             sum = sum+1;
             }   
        else if (r7b.isSelected()||r7a.isSelected()||r7d.isSelected()){
   // JOptionPane.showMessageDialog(b," Q7 is incorrect");
        }
              else{
            JOptionPane.showMessageDialog(this," you have not answered Q7","ALERT",JOptionPane.WARNING_MESSAGE);
        }
             
    //for question number 8
                 if (r8d.isSelected()){
          //  JOptionPane.showMessageDialog(this," Q8 is correct");
               sum = sum+1;
                 }   
        else if (r8b.isSelected()||r8a.isSelected()||r8c.isSelected()){
    //JOptionPane.showMessageDialog(b," Q8 is incorrect");
        }
                  else{
            JOptionPane.showMessageDialog(this," you have not answered Q8","ALERT",JOptionPane.WARNING_MESSAGE);
        }
        
        //for question number 9
        
                 if (r9b.isSelected()){
            //JOptionPane.showMessageDialog(this," Q9 is correct");
                sum = sum+1;
                 }   
        else if (r9a.isSelected()||r9c.isSelected()||r4d.isSelected()){
    //JOptionPane.showMessageDialog(b," Q9 is incorrect");
        }
          else{
            JOptionPane.showMessageDialog(this," you have not answered Q9","ALERT",JOptionPane.WARNING_MESSAGE);
        }
                 
       //for question number 10
       
                if (r10b.isSelected()){
           // JOptionPane.showMessageDialog(this," Q10 is correct");
            sum = sum+1;
                }   
        else if (r10c.isSelected()||r10a.isSelected()||r10d.isSelected()){
    //JOptionPane.showMessageDialog(b," Q10 is incorrect");
        }
     else{
            JOptionPane.showMessageDialog(this," you have not answered Q10","ALERT",JOptionPane.WARNING_MESSAGE);
        }
                JOptionPane.showMessageDialog(b,"you have got"+sum);
                
        }



    }