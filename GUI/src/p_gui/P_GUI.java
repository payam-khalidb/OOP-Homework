/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


public class P_GUI extends JFrame{
    JButton b1=new JButton("Confirm");
JButton b2=new JButton("Cancel");

JLabel L1=new JLabel("Patient_ID");
JLabel L2=new JLabel("Patient_Name");
JLabel L3=new JLabel("Patient_Gender");
JLabel L4=new JLabel("Drug_ID");
JLabel L5=new JLabel("Drug_Price");


JTextField tp_id=new JTextField();
JTextField tp_name=new JTextField();
JTextField td_id=new JTextField();
JTextField td_price=new JTextField();
JTextField id_d=new JTextField();



String[] p_gender = {"Male", "female"};
JComboBox combo1 = new JComboBox(p_gender);

JMenuItem M1=new  JMenuItem("File");
  JMenuItem M2=new JMenuItem("View"); 
   JMenuItem M3=new JMenuItem("Edit"); 
   JMenuItem M4=new JMenuItem("About"); 
   JMenuItem M5=new JMenuItem("Help"); 

  

    public P_GUI() {
    setTitle("Pharmasy");
     Container c=getContentPane();
      setBounds(400,400,300,500);
        setResizable(false);
       
      c.setBackground(Color.yellow);
        
      L1.setBounds(25,40,100,50);
      tp_id.setBounds(130,55,133,20);
      L2.setBounds(25,80,100,50);
      tp_name.setBounds(130,96,133,20) ;
     L3.setBounds(25,120,100,50);
     combo1.setBounds(130,136,80,20);
    L4.setBounds(25,160, 100, 50);
    id_d.setBounds(130, 176, 133, 20);
    L5.setBounds(25, 200, 100, 50);
    td_price.setBounds(130, 216, 133, 20);
    

      
b1.setBounds(73,300,133,40);
b2.setBounds(73,360,133,40);

M1.setBounds(0,0, 40, 20);
M2.setBounds(40,0, 40, 20);
M3.setBounds(80,0, 40, 20);
M4.setBounds(120,0, 40, 20);
M5.setBounds(160,0, 40, 20);



  
setLayout(null);
c.add(combo1);
c.add(b1); 
c.add(b2);
c.add(tp_id);
c.add(tp_name);
c.add(td_id);
c.add(td_price);
c.add(id_d);
c.add(L1);
c.add(L2);
c.add(L3);
c.add(L4);
c.add(L5);
c.add(M1);
c.add(M2);
c.add(M3);
c.add(M4);
c.add(M5);
    b1.addActionListener(new PG2());

    
    }
    public static void main(String[] args) {
         P_GUI ob= new P_GUI();
             ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             
 ob.setVisible(true);
    }
    
    static public class PG2 extends JFrame implements ActionListener{
       
         @Override
         public void actionPerformed(ActionEvent e){
                   setTitle("New");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             
 setVisible(true);
  setBounds(400,400,300,500);
  Container c=getContentPane();
 setLayout(null);
 
 JLabel background;
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("W.jpg");
        
        background = new JLabel("",img,JLabel.LEFT);
        background.setBounds(0,0,720,420);
             setResizable(false);
       add(background);
 

    
    
    
    
   
   
   
   

         }}  
}
