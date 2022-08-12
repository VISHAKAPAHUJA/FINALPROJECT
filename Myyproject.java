/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

/**
 *
 * @author Vishaka
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.*;


public class  Myyproject extends JFrame implements ActionListener{

JTextField name;
JPanel npanel;
JButton login,logout;
JButton menu,order,showsales,feedback;
JPanel btnpanel;
JLabel user,pass;
JTextField username;
JPasswordField password;
JPanel upanel;
JButton loginbtn;
ImageIcon img;
JLabel label;
    JCheckBox cb;
   JLabel lbl,lbl2,lbl3,lbl5;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    JCheckBox d1,d2,d3;
    JCheckBox s1,s2,s3,s4,s5;
    JPanel pnl,pnl2;
    JButton orderbtn;
    JTextField n,q;
    JLabel nm,qu;
    JTextField q1, q2, q3, q4,q5,q6,q7,q8,q9,q10,
            q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24,q25,q26,q27,q28;
   double amount=0;
   String msg ="VISHAN RESTAURANT \n";
  JTextArea fbtxt;
    JLabel labelpic;
   JTextField fbfd;
   JButton save;
   String response;
    public Myyproject() {
       
        name= new JTextField(30);
        name.setText(" VISHAN RESTAURANT MANAGEMENT SYSTEM");
        name.setFont(new Font("serif",Font.BOLD,25));  
        name.setPreferredSize(new Dimension(100,100));
        name.setBackground(Color.PINK);
         
        login=new JButton();
        login.setText("LOGIN");
        login.addActionListener(new login());
        logout=new JButton("LOGOUT");
        logout.setEnabled(false);     
        logout.addActionListener(new logout());
        
        npanel=new JPanel();
        npanel.add(name);
        npanel.add(login);
        npanel.add(logout);
        npanel.setLayout(new FlowLayout());
        npanel.setBackground(Color.pink);
        npanel.setPreferredSize(new Dimension(100,100));

        menu=new JButton();
        menu.setText("SHOW MENU ITEMS");
        menu.setPreferredSize(new Dimension(200,150));  
        menu.addActionListener(new menu());
        menu.setEnabled(false);
        order=new JButton();
        order.setText("ORDER MANAGEMENT");
        order.setPreferredSize(new Dimension(200,150));
        order.addActionListener(new order());
        order.setEnabled(false);
        showsales=new JButton("SHOW RECEIPT");
        showsales.addActionListener(new showsales());
        showsales.setEnabled(false);
        showsales.setPreferredSize(new Dimension(200,150));
        feedback=new JButton("FEEDBACK");
        feedback.setPreferredSize(new Dimension(200,150));
        feedback.setEnabled(false);
        feedback.addActionListener(new feedback());
      
        btnpanel=new JPanel();
        btnpanel.setPreferredSize(new Dimension(200,800));
       

     
        btnpanel.add(menu);
        btnpanel.add(order);
        btnpanel.add(showsales);
        btnpanel.add(feedback);
        btnpanel.setVisible(true);
       
       
        user=new JLabel("\n ENTER USERNAME:");
        user.setFont(new Font("SERIF",Font.PLAIN,20));
        user.setForeground(Color.WHITE);
        user.setBounds(180, 100, 450, 25);
        username=new JTextField(50);
        username.setBounds(370, 100, 300, 30);
        username.setFont(new Font("SERIF",Font.PLAIN,20));
     
     
        pass=new JLabel("\n ENTER PASSWORD:");
        pass.setForeground(Color.WHITE);
        pass.setBounds(180, 160, 950, 25);
        pass.setFont(new Font("SERIF",Font.PLAIN,20));
       
        password=new JPasswordField(50);
        password.setBounds(370, 160, 300, 30);
        password.setFont(new Font("SERIF",Font.PLAIN,20));
     
        cb=new JCheckBox("LOGIN AS AN CUSTOMER");
        cb.setBounds(360,230, 270, 25);
        cb.setFont(new Font("SERIF",Font.PLAIN,20));
       
        loginbtn=new JButton("LOGIN");
        loginbtn.setBounds(360, 280, 270, 25);
        loginbtn.setPreferredSize(new Dimension(50,50));
        loginbtn.addActionListener(new loginbtn());
       
        
        upanel=new JPanel();
        upanel.setPreferredSize(new Dimension(1000,600));
        upanel.setBackground(Color.BLACK);
        upanel.setLayout(null);
        Dimension sizze = upanel.getPreferredSize(); 
        upanel.setBounds(270, 105,sizze.width,sizze.height );
         upanel.setVisible(false);
        upanel.add(user);
        upanel.add(username);  
        upanel.add(pass);
        upanel.add(password);
        upanel.add(cb);
        upanel.add(loginbtn);
           
        
        labelpic = new JLabel();
        labelpic.setIcon(new ImageIcon("a3.jpg"));
        Dimension siize = labelpic.getPreferredSize(); 
        labelpic.setBounds(330, 120, siize.width, siize.height); 
        
        labelpic.setVisible(false);
        upanel.add(labelpic);
        add(upanel);
       
        label = new JLabel();
        label.setIcon(new ImageIcon("f2.jpg"));
        Dimension size = label.getPreferredSize(); 
        label.setBounds(330, 120, size.width, size.height); 
        add(label);  
        label.setVisible(true);
     
        
        
        
      lbl=new JLabel("\t \t STARTERS:");
        lbl.setBounds(50, 20, 220, 40);
        lbl.setFont(new Font("SERIF",Font.ITALIC,25));
        lbl.setForeground(Color.RED);
        lbl.setBackground(Color.white);
        lbl.setOpaque(true);
        cb1=new JCheckBox("FRIES.........50$");
        cb1.setBounds(40, 70, 220, 40);
        cb1.setFont(new Font("SERIF",Font.PLAIN,20));
        cb1.setForeground(Color.RED);
        cb1.setBackground(Color.BLACK);
        q1 = new JTextField();
        q1.setBounds(290, 70, 40, 30);
        q1.setBackground(Color.white);
        q1.setVisible(false);
        cb2=new JCheckBox("FISH FINGER.........78$");
        cb2.setBounds(40, 110, 250, 40);
        cb2.setFont(new Font("SERIF",Font.PLAIN,20));
        cb2.setForeground(Color.RED);
        cb2.setBackground(Color.BLACK);
        q2 = new JTextField();
        q2.setBounds(290, 110, 40, 30);
        q2.setBackground(Color.white);
         q2.setVisible(false);
        cb3=new JCheckBox("CHEESE NAAN.........80$");
        cb3.setBounds(40, 150, 250, 40);
        cb3.setFont(new Font("SERIF",Font.PLAIN,20));  
         cb3.setForeground(Color.RED);
        cb3.setBackground(Color.BLACK);
         q3 = new JTextField();
           q3.setVisible(false);
        q3.setBounds(290, 150, 40, 30);
        q3.setBackground(Color.white);
        cb4=new JCheckBox("MEATBALL.........59$");
        cb4.setBounds(40, 190, 250, 40);
        cb4.setFont(new Font("SERIF",Font.PLAIN,20));
         cb4.setForeground(Color.RED);
          q4 = new JTextField();
        q4.setBounds(290, 190, 40, 30);
        q4.setBackground(Color.white);
          q4.setVisible(false);
        cb4.setBackground(Color.BLACK);
        cb5=new JCheckBox("RASHMI KABAB.........98$");
        cb5.setBounds(40, 230, 250, 40);
        cb5.setFont(new Font("SERIF",Font.PLAIN,20));
         cb5.setForeground(Color.RED);
        cb5.setBackground(Color.BLACK);
         q5 = new JTextField();
        q5.setBounds(290, 230, 40, 30);
        q5.setBackground(Color.white);
          q5.setVisible(false);
        cb6=new JCheckBox("MALAI BOOTI.........346$");
        cb6.setBounds(40, 270, 250, 40);
        cb6.setFont(new Font("SERIF",Font.PLAIN,20));
         cb6.setForeground(Color.RED);
         q6 = new JTextField();
        q6.setBounds(290, 270, 40, 30);
        q6.setBackground(Color.white);
         q6.setVisible(false);
        cb6.setBackground(Color.BLACK);
        cb7=new JCheckBox("SPRING ROLLS.........50$");
        cb7.setBounds(40, 310, 250, 40);
        cb7.setFont(new Font("SERIF",Font.PLAIN,20));
         cb7.setForeground(Color.RED);
         q7 = new JTextField();
        q7.setBounds(290, 310, 40, 30);
        q7.setBackground(Color.white);
          q7.setVisible(false);
        cb7.setBackground(Color.BLACK);
        cb8=new JCheckBox("CAESAR SALAD.........50$");
        cb8.setBounds(40, 350, 250, 40);
        cb8.setFont(new Font("SERIF",Font.PLAIN,20));
        cb8.setForeground(Color.RED);
        cb8.setBackground(Color.BLACK);
        q8 = new JTextField();
          q8.setVisible(false);
        q8.setBounds(290, 350, 40, 30);
        q8.setBackground(Color.white);
        cb9=new JCheckBox("WINGS.........50$");
        cb9.setBounds(40, 390, 250, 40);
        cb9.setFont(new Font("SERIF",Font.PLAIN,20));
         cb9.setForeground(Color.RED);
        cb9.setBackground(Color.BLACK);
        q9 = new JTextField();
        q9.setBounds(290, 390, 40, 30);
          q9.setVisible(false);
        q9.setBackground(Color.white);
        cb10=new JCheckBox("HOTSHOTS.........50$");
        cb10.setBounds(40, 430, 250, 40);
        cb10.setFont(new Font("SERIF",Font.PLAIN,20));
         cb10.setForeground(Color.RED);
        cb10.setBackground(Color.BLACK);
        q10 = new JTextField();
        q10.setBounds(290, 430, 40, 30);
        q10.setBackground(Color.white);
          q10.setVisible(false);
       
        lbl2=new JLabel("\t \t FAMILY PLATTERS:");
        lbl2.setBounds(360, 20, 270, 40);
        lbl2.setFont(new Font("SERIF",Font.ITALIC,25));
        lbl2.setForeground(Color.RED);
         lbl2.setBackground(Color.white);
        lbl2.setOpaque(true);
       
        c1=new JCheckBox("MUTTON MASKA HANDI........200$");
        c1.setBounds(350, 70, 350, 40);
        c1.setFont(new Font("SERIF",Font.PLAIN,20));
        c1.setForeground(Color.RED);
         c1.setBackground(Color.BLACK);
          q11 = new JTextField();
        q11.setBounds(700, 70, 40, 30);
        q11.setBackground(Color.white);
          q11.setVisible(false);
       
         c2=new JCheckBox("CHICKEN SHAHI HANDI.........170$");
        c2.setBounds(350, 110, 350, 40);
        c2.setFont(new Font("SERIF",Font.PLAIN,20));
        c2.setForeground(Color.RED);
         c2.setBackground(Color.BLACK);
          q12 = new JTextField();
        q12.setBounds(700, 110, 40, 30);
        q12.setBackground(Color.white);
          q12.setVisible(false);
         
         c3=new JCheckBox("PANEER RASHMI HANDI.........478$");
        c3.setBounds(350, 150, 350, 40);
        c3.setFont(new Font("SERIF",Font.PLAIN,20));
        c3.setForeground(Color.RED);
        c3.setBackground(Color.BLACK);
        q13 = new JTextField();
        q13.setBounds(700, 150, 40, 30);
        q13.setBackground(Color.white);
          q13.setVisible(false);
       
         c4=new JCheckBox("MUTTON SIJJI.........300$");
        c4.setBounds(350, 190, 350, 40);
        c4.setFont(new Font("SERIF",Font.PLAIN,20));
        c4.setForeground(Color.RED);
        c4.setBackground(Color.BLACK);
        q14 = new JTextField();
        q14.setBounds(700, 190, 40, 30);
        q14.setBackground(Color.white);
          q14.setVisible(false);
       
         c6=new JCheckBox("CHICKEN DHAKA.........555$");
        c6.setBounds(350, 230, 350, 40);
        c6.setFont(new Font("SERIF",Font.PLAIN,20));
        c6.setForeground(Color.RED);
        c6.setBackground(Color.BLACK);
        q16 = new JTextField();
        q16.setBounds(700, 230, 40, 30);
        q16.setBackground(Color.white);
          q16.setVisible(false);
       
       
         c5=new JCheckBox("CHICKEN CHOWMIEN.........850$");
        c5.setBounds(350, 270, 350, 40);
        c5.setFont(new Font("SERIF",Font.PLAIN,20));
        c5.setForeground(Color.RED);
        c5.setBackground(Color.BLACK);
       
         q15 = new JTextField();
        q15.setBounds(700, 270, 40, 30);
        q15.setBackground(Color.white);
          q15.setVisible(false);
       
       
         c7=new JCheckBox("WHITE DAHI KARAHI.........270$");
        c7.setBounds(350, 310, 350, 40);
        c7.setFont(new Font("SERIF",Font.PLAIN,20));
        c7.setForeground(Color.RED);
        c7.setBackground(Color.BLACK);
       
         q17 = new JTextField();
        q17.setBounds(700, 310, 40, 30);
        q17.setBackground(Color.white);
          q17.setVisible(false);
       
        c8=new JCheckBox("MIX VEGETABLE.........500$");
        c8.setBounds(350, 350,350, 40);
        c8.setFont(new Font("SERIF",Font.PLAIN,20));
        c8.setBackground(Color.BLACK);
        c8.setForeground(Color.RED);
        q18 = new JTextField();
        q18.setBounds(700, 350, 40, 30);
        q18.setBackground(Color.white);
        q18.setVisible(false);
        c9=new JCheckBox("PALAK PANEER.........780$");
        c9.setBackground(Color.BLACK);
        c9.setBounds(350, 390, 350, 40);
        c9.setFont(new Font("SERIF",Font.PLAIN,20));
        c9.setForeground(Color.RED);
        q19 = new JTextField();
        q19.setBounds(700, 390, 40, 30);
        q19.setBackground(Color.white);
          q19.setVisible(false);
       
         c10=new JCheckBox("SHAHI DAAL........400$");
        c10.setBounds(350, 430, 350, 40);
        c10.setFont(new Font("SERIF",Font.PLAIN,20));
        c10.setForeground(Color.RED);
        c10.setBackground(Color.BLACK);
       
       
        q20 = new JTextField();
        q20.setBounds(700, 430, 40, 30);
        q20.setBackground(Color.white);
          q20.setVisible(false);
       
       
         
          lbl3=new JLabel("SOUP & SALAD");
        lbl3.setBounds(770, 20, 350, 40);
        lbl3.setFont(new Font("SERIF",Font.ITALIC,25));
        lbl3.setForeground(Color.RED);
         lbl3.setBackground(Color.white);
        lbl3.setOpaque(true);
       
         s1=new JCheckBox("CHIKEN CORN SOUP.........300$");
        s1.setBounds(750, 70, 350, 40);
        s1.setFont(new Font("SERIF",Font.PLAIN,20));
        s1.setForeground(Color.RED);
         s1.setBackground(Color.BLACK);
          q21 = new JTextField();
        q21.setBounds(1100, 70, 40, 30);
        q21.setBackground(Color.white);
         q21.setVisible(false);
       
         s2=new JCheckBox("HOT & SOUR SOUP.........750$");
        s2.setBounds(750, 110, 350, 40);
        s2.setFont(new Font("SERIF",Font.PLAIN,20));
        s2.setForeground(Color.RED);
         s2.setBackground(Color.BLACK);
         q22 = new JTextField();
        q22.setBounds(1100, 110, 40, 30);
        q22.setBackground(Color.white);
         q22.setVisible(false);
       
         s5=new JCheckBox("RAITA.........59$");
        s5.setBounds(750, 150, 350, 40);
        s5.setFont(new Font("SERIF",Font.PLAIN,20));
        s5.setForeground(Color.RED);
         s5.setBackground(Color.BLACK);
         q23 = new JTextField();
        q23.setBounds(1100, 150, 40, 30);
        q23.setBackground(Color.white);
         q23.setVisible(false);
       
         s3=new JCheckBox("FRESH GREEN SALD.........70$");
        s3.setBounds(750, 190, 350, 40);
        s3.setFont(new Font("SERIF",Font.PLAIN,20));
        s3.setForeground(Color.RED);
         s3.setBackground(Color.BLACK);
         q24 = new JTextField();
        q24.setBounds(1100, 190, 40, 30);
        q24.setBackground(Color.white);
         q24.setVisible(false);
       
       
          s4=new JCheckBox("RUSSIAN SALAD.........90$");
        s4.setBounds(750, 230, 350, 40);
        s4.setFont(new Font("SERIF",Font.PLAIN,20));
        s4.setForeground(Color.RED);
         s4.setBackground(Color.BLACK);
         q25 = new JTextField();
        q25.setBounds(1100, 230, 40, 30);
        q25.setBackground(Color.white);
         q25.setVisible(false);
       
          lbl5=new JLabel(" DESERT");
        lbl5.setBounds(770, 270, 350, 40);
        lbl5.setFont(new Font("SERIF",Font.ITALIC,25));
        lbl5.setForeground(Color.RED);
         lbl5.setBackground(Color.white);
          lbl5.setOpaque(true);
         d1=new JCheckBox("ICE-CREAM........215$");
        d1.setBounds(750, 320, 350, 40);
        d1.setFont(new Font("SERIF",Font.PLAIN,20));
        d1.setForeground(Color.RED);
         d1.setBackground(Color.BLACK);
         q26 = new JTextField();
        q26.setBounds(1100, 320, 40, 30);
        q26.setBackground(Color.white);
          q26.setVisible(false);
       
          d2=new JCheckBox("KULFI FALUDA.........240$");
        d2.setBounds(750, 360, 350, 40);
        d2.setFont(new Font("SERIF",Font.PLAIN,20));
        d2.setForeground(Color.RED);
         d2.setBackground(Color.BLACK);
         q27 = new JTextField();
        q27.setBounds(1100, 360, 40, 30);
        q27.setBackground(Color.white);
          q27.setVisible(false);
       
           d3=new JCheckBox("VISHAN HOT BROWNIE........500$");
        d3.setBounds(750, 400, 350, 40);
        d3.setFont(new Font("SERIF",Font.PLAIN,20));
        d3.setForeground(Color.RED);
         d3.setBackground(Color.BLACK);

         q28 = new JTextField();
        q28.setBounds(1100, 400, 40, 30);
        q28.setBackground(Color.white);
        q28.setVisible(false);
       
         pnl=new JPanel();
       pnl.setLayout(null);
       pnl.setBackground(Color.BLACK);
        pnl.add(lbl);
       pnl.add(cb1);
       pnl.add(q1);
       pnl.add(q2);
       pnl.add(q3);
       pnl.add(q4);
       pnl.add(q5);
       pnl.add(q6);
       pnl.add(q7);
       pnl.add(q8);
       pnl.add(q9);
       pnl.add(q10);
       pnl.add(q11);
         pnl.add(q12);
         pnl.add(q13);
         pnl.add(q14);
         pnl.add(q15);
         pnl.add(q16);
         pnl.add(q17);
         pnl.add(q18);
         pnl.add(q19);
         pnl.add(q20);
         pnl.add(q21);
         pnl.add(q22);
         pnl.add(q23);
         pnl.add(q24);
         pnl.add(q25);
         pnl.add(q26);
         pnl.add(q27);
         pnl.add(q28 );
     
         pnl. add(cb2);
         pnl.add(cb3);
         pnl.add(cb4);
         pnl.add(cb5);
         pnl.add(cb6);
         pnl.add(cb7);
         pnl.add(cb8);
         pnl.add(cb9);
         pnl.add(cb10);
         pnl.add(lbl2);
         pnl.add(c1);
         pnl.add(c2);
         pnl.add(c3);
         pnl.add(c4);
         pnl.add(c5);
         pnl.add(c6);
         pnl.add(c7);
         pnl.add(c8);
         pnl.add(c9);
         pnl.add(c10);
         pnl.add(s1);
         pnl.add(s2);
         pnl.add(s3);
         pnl.add(s4);
         pnl.add(s5);
         pnl.add(lbl3);
         pnl.add(lbl5);
         pnl.add(d1);
         pnl.add(d2);
         pnl.add(d3);
       
       
         fbtxt=new JTextArea("\n"+"\t"+"\t"+"THE VISHAN RESTAURANT"
                 +"\n"+"\n"+"\t"+"\t"
                 + "WE WOULD LIKE TO GET YOUR FEEDBACK ABOUT" 
                 +"\n"+"\t"+"\t"
                 +"YOUR EXPERIENCE AT THE VISHAN"
                 +"\n"+"\t"+"\t"
                 +"PLEASE WRITE US AND VISIT US"
                 +"\n"+"\n"+"\t"
                 + "\t"+"@WWW.VISHAN.COM/THE VISHAN "
                 +"\n"+"\n"+"\t"+"\t"
                 +"WE INVITE YOUR COMMENTS AND SUGGESTIONS"
                 +"\n"+"\t"+"\t"
                 +"IN ORDER TO MAKE AND IMPROVE THE"
                 +"\n"+"\t"+"\t"
                 +"QUALITY OF OUR FOOD PLEASE TAKE A MOMENT "
                 +"\n"+"\t"+"\t"
                 + "& FILL OUT THE COMMENT CARD THANKYOU!"+"\n");

     fbtxt.setBounds(200, 100,15000,400 );
     fbtxt.setFont(new Font("ALGERIAN" , Font.ITALIC, 20));
     fbtxt.setBackground(Color.black);
     fbtxt.setForeground(Color.white);
     fbtxt.setVisible(false);
     
     fbfd=new JTextField();     
     fbfd.setBounds(450, 600, 200, 50);
     fbfd.setBackground(Color.WHITE);
     fbfd.setForeground(Color.BLACK);
     fbfd.setVisible(false);

     save=new JButton("SAVE");
     save.setFont(new Font("ALGERIAN" , Font.ITALIC, 20));
     save.setBounds(750, 600, 200, 50);
     save.setBackground(Color.black);
     save.setForeground(Color.white);
     save.addActionListener(new save());
     save.setVisible(false);
     
     
     add(fbtxt);
     add(fbfd);
     add(save);
     
     orderbtn=new JButton("PLACE YOUR ORDER");
     orderbtn.setBackground(Color.yellow);
     orderbtn.setForeground(Color.blue);
     orderbtn.setBounds(700, 500, 250, 70);
     orderbtn.setFont(new Font("Arial" , Font.BOLD , 18));
     orderbtn.addActionListener(new orderbtn());
     
     pnl.add(orderbtn);
     n = new JTextField(30);
      n.setBackground(Color.yellow);
     n.setForeground(Color.blue);
      n.setVisible(false);
      n.setBounds(300, 500, 300, 50);
   
      nm = new JLabel(" ENTER TABLE ID:");
       nm.setForeground(Color.blue);
      nm.setVisible(false);
      nm.setBounds(100, 500, 200, 50);
       nm.setFont(new Font("Arial" , Font.BOLD , 18));
         pnl.add(n);
         pnl.add(nm);
       pnl.setVisible(false);
    
       
      add(pnl,BorderLayout.CENTER) ;
      add(npanel,BorderLayout.NORTH);
      add(btnpanel,BorderLayout.WEST);
        setVisible(true);
    }
public static void main(String args[])
{
 Myyproject   obj=new Myyproject();
   
}
@Override
    public void actionPerformed(ActionEvent ae) {
    }
    
    private class login implements ActionListener{
  
        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd=ae.getActionCommand();
        if(cmd=="LOGIN")
        {
         label.setVisible(false);
        upanel.setVisible(true);
        labelpic.setVisible(true);
        }
        }}
    
    private class logout implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            String cmd=ae.getActionCommand();
        if(cmd=="LOGOUT")
        {
           int res= JOptionPane.showConfirmDialog(logout, "ARE YOU SURE YOU WANT TO LOGOUT?","CONFIRM",JOptionPane.INFORMATION_MESSAGE);  
           if(res==0)
           {
                label.setVisible(true);
                upanel.setVisible(false);
                menu.setEnabled(false);
                order.setEnabled(false);
                showsales.setEnabled(false);
                feedback.setEnabled(false);
                login.setEnabled(true);
                logout.setEnabled(false);
                fbfd.setVisible(false);
                fbtxt.setVisible(false);
           }
                   if(res==1)
         {
                label.setVisible(false);
                upanel.setVisible(false);
                menu.setEnabled(true);
                order.setEnabled(true);
                showsales.setEnabled(true);
                feedback.setEnabled(true);
                login.setEnabled(false);
                logout.setEnabled(true);
                fbfd.setVisible(true);
                fbtxt.setVisible(true);
         }}}}
    
    private class loginbtn implements ActionListener
    {
       
        @Override
        public void actionPerformed(ActionEvent ae) {
          String cmd=ae.getActionCommand();
           String usertext=username.getText();
            String passtext=password.getText();
           
        if(cmd=="LOGIN")
        {
            if(usertext.equalsIgnoreCase("vishan")&&passtext.equalsIgnoreCase("1000")) {
            JOptionPane.showMessageDialog(loginbtn, "login successfully! ");
                upanel.setVisible(false);
               label.setVisible(true);
                menu.setEnabled(true);
                order.setEnabled(true);
                showsales.setEnabled(true);
                feedback.setEnabled(true);
                logout.setEnabled(true);
                login.setEnabled(false);
             }
            else{
                JOptionPane.showMessageDialog(loginbtn, "INVALID USERNAME OR PASSWORD");
            }}}}
       
        private class menu implements ActionListener{
@Override  
        public void actionPerformed(ActionEvent ae) {
           String cmd=ae.getActionCommand();
           if(cmd=="SHOW MENU ITEMS")
           {
               upanel.setVisible(false);
               label.setVisible(false);
               pnl.setVisible(true);
               orderbtn.setVisible(false);
               n.setVisible(false);
               nm.setVisible(false);
                 q1.setVisible(false);
                  q2.setVisible(false);
                  q3.setVisible(false);
                  q4.setVisible(false);
                  q5.setVisible(false);
                  q6.setVisible(false);
                  q7.setVisible(false);
                  q8.setVisible(false);
                  q9.setVisible(false);
                  q10.setVisible(false);
                  q11.setVisible(false);
                  q12.setVisible(false);
                  q13.setVisible(false);
                  q14.setVisible(false);
                  q15.setVisible(false);
                  q16.setVisible(false);
                  q17.setVisible(false);
                  q18.setVisible(false);
                  q19.setVisible(false);
                  q20.setVisible(false);
                  q21.setVisible(false);
                  q22.setVisible(false);
                  q23.setVisible(false);
                  q24.setVisible(false);
                  q25.setVisible(false);
                  q26.setVisible(false);
                  q27.setVisible(false);
                  q28.setVisible(false);
                        
           }}}
        
           private class order implements ActionListener
           {
 @Override
        public void actionPerformed(ActionEvent a) {
             String cmd=a.getActionCommand();
           if(cmd=="ORDER MANAGEMENT")
           {
               
                 upanel.setVisible(false);
                 label.setVisible(false);
                 pnl.setVisible(true);
                 orderbtn.setVisible(true);
                 n.setVisible(true);
                 nm.setVisible(true);
                  q1.setVisible(true);
                  q2.setVisible(true);
                  q3.setVisible(true);
                  q4.setVisible(true);
                  q5.setVisible(true);
                  q6.setVisible(true);
                  q7.setVisible(true);
                  q8.setVisible(true);
                  q9.setVisible(true);
                  q10.setVisible(true);
                  q11.setVisible(true);
                  q12.setVisible(true);
                  q13.setVisible(true);
                  q14.setVisible(true);
                  q15.setVisible(true);
                  q16.setVisible(true);
                  q17.setVisible(true);
                  q18.setVisible(true);
                  q19.setVisible(true);
                  q20.setVisible(true);
                  q21.setVisible(true);
                  q22.setVisible(true);
                  q23.setVisible(true);
                  q24.setVisible(true);
                  q25.setVisible(true);
                  q26.setVisible(true);
                  q27.setVisible(true);
                  q28.setVisible(true);
                  
           }}}
           
           private class orderbtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd=ae.getActionCommand();
 
               if(cb1.isSelected())
               {
                   Double a = Double.parseDouble(q1.getText());    
                  amount+=50*a;
                  msg+="FRIES:50$ \n QUANTITY:"+a+"\n";  
               }
              if(cb2.isSelected())
               {
                   Double a = Double.parseDouble(q2.getText());
                  amount+=78*a;
                  msg+= "FISH FINGER:78$ \n QUANTITY:"+a+"\n";
               }
                if(cb3.isSelected())
               {
                    Double a = Double.parseDouble(q3.getText());
                  amount+=80*a;
                  msg +="CHEESE NAAN:80$\n QUANTITY:"+a+"\n";
               }
                if(cb4.isSelected())
               {
                    Double a = Double.parseDouble(q4.getText());
                  amount+=59*a;
                  msg+="MEATBALL:59$\n QUANTITY:"+a+"\n";
               }
                 if(cb5.isSelected())
               {
                    Double a = Double.parseDouble(q5.getText());
                  amount+=98*a;
                  msg+="RASHMI KABAB:98$\n QUANTITY:"+a+"\n";
               }
                if(cb6.isSelected())
               {  Double a = Double.parseDouble(q6.getText());
                  amount+=346*a;
                  msg+="MALAI BOOTI:346$\n QUANTITY:"+a+"\n";
               }
                 if(cb7.isSelected())
               {  Double a = Double.parseDouble(q7.getText());
                  amount+=50*a;
                  msg+="SPRING ROLLS:50$\n QUANTITY:"+a+"\n";
               }
                  if(cb8.isSelected())
               {   Double a = Double.parseDouble(q8.getText());
                  amount+=50*a;
                  msg+="CAESAR SALAD:50$\n QUANTITY:"+a+"\n";
               }
                 if(cb9.isSelected())
               {  Double a = Double.parseDouble(q9.getText());
                  amount+=50*a;
                  msg+="WINGS:50$\n QUANTITY:"+a+"\n";
               }
                  if(cb10.isSelected())
               {   Double a = Double.parseDouble(q10.getText());
                  amount+=50*a;
                  msg+="HOTSHOTS:50$\n QUANTITY:"+a+"\n";
               }
                 if(c1.isSelected())
               {
                    Double a = Double.parseDouble(q11.getText());
                  amount+=200*a;
                  msg+="MUTTON MASKA HANDI:200$\n QUANTITY:"+a+"\n";
               }
               if(c2.isSelected())
              {   Double a = Double.parseDouble(q12.getText());
                  amount+=170*a;
                  msg+="CHICKEN SHAHI HANDI:170$\n QUANTITY:"+a+"\n";
               }
               if(c3.isSelected())
               {  Double a = Double.parseDouble(q13.getText());
                  amount+=478*a;
                  msg+="PANEER RASHMI HANDI:478$\n QUANTITY:"+a+"\n";
               }
                if(c4.isSelected())
               {   Double a = Double.parseDouble(q14.getText());
                  amount+=300*a;
                  msg+="MUTTON SIJJI:300$\n QUANTITY:"+a+"\n";
               }
               if(c6.isSelected())
               {  Double a = Double.parseDouble(q16.getText());
                  amount+=555*a;
                  msg+="CHICKEN DHAKA:555$\n QUANTITY:"+a+"\n";
               }
               if(c5.isSelected())
               {
                    Double a = Double.parseDouble(q15.getText());
                  amount+=850*a;
                  msg+="CHICKEN CHOWMIEN:850$\n QUANTITY:"+a+"\n";
               }
               if(c7.isSelected())
               {  Double a = Double.parseDouble(q17.getText());
                  amount+=270*a;
                  msg+="WHITE DAHI KARAHI:270$\n QUANTITY:"+a+"\n";
               }
               if(c8.isSelected())
               {  Double a = Double.parseDouble(q18.getText());
                  amount+=500*a;
                  msg+="MIX VEGETABLE:500$\n QUANTITY:"+a+"\n";
               }
               if(c9.isSelected())
               {  Double a = Double.parseDouble(q19.getText());
                  amount+=780*a;
                  msg+="PALAK PANEER:780$\n QUANTITY:"+a+"\n";
               }
               if(c10.isSelected())
               {  Double a = Double.parseDouble(q20.getText());
                  amount+=400*a;
                  msg+="SHAHI DAAL:400$\n QUANTITY:"+a+"\n";
               }
               if(s1.isSelected())
               {  Double a = Double.parseDouble(q21.getText());
                  amount+=300*a;
                  msg+="CHICKEN CORN SOUP:300$\n QUANTITY:"+a+"\n";
               }
               if(s2.isSelected())
               {  Double a = Double.parseDouble(q22.getText());
                  amount+=750*a;
                  msg+="HOT & SOUR SOUP:750$\n QUANTITY:"+a+"\n";
               }
               if(s5.isSelected())
               {  Double a = Double.parseDouble(q23.getText());
                  amount+=59*a;
                  msg+="RAITA:59$\n QUANTITY:"+a+"\n";
               }
               if(s3.isSelected())
               {   Double a = Double.parseDouble(q24.getText());
                  amount+=70*a;
                  msg+="FRESH GREEN SALAD:70$\n QUANTITY:"+a+"\n";
               }
                 if(s4.isSelected())
               {  Double a = Double.parseDouble(q25.getText());
                  amount+=90*a;
                  msg+="RUSSIAN SALAD:90$\n QUANTITY:"+a+"\n";
               }
              if(d1.isSelected())
               {   Double a = Double.parseDouble(q26.getText());
                  amount+=215*a;
                  msg+="ICE-CREAM:215$\n QUANTITY:"+a+"\n";
               }
               if(d2.isSelected())
               { Double a = Double.parseDouble(q27.getText());
                  amount+=240*a;
                  msg+="KULFI FALUDA:240$\n QUANTITY:"+a+"\n";
               }
               if(d3.isSelected())
               {  Double a = Double.parseDouble(q28.getText());
                  amount+=500*a;
                  msg+="VISHAN HOT BROWNIE:500$\n QUANTITY:"+a+"\n";
               }
           }
   
       
        }
           
             

private class showsales implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        String cmd=ae.getActionCommand();
        if(cmd=="SHOW RECEIPT")
        {
                    msg+= " ........\n";
           JOptionPane.showMessageDialog(order,msg+"\n"+"TABLE ID:"+n.getText()+
              "\n"+"Your total bill is:"+amount+"$",
              "RECIEPT",JOptionPane.INFORMATION_MESSAGE); 
        }
        
        }}

 private class feedback implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        String cmd=ae.getActionCommand();
        if(cmd=="FEEDBACK")
        { label.setVisible(false);
          upanel.setVisible(false);
           pnl.setVisible(false);
           orderbtn.setVisible(false);
           n.setVisible(false);
           nm.setVisible(false);
           label.setVisible(false);
           fbtxt.setVisible(true);
           fbfd.setVisible(true);
           save.setVisible(true);
          
  
          }
        }
     
 }   

private class save implements ActionListener{
 
        @Override
        public void actionPerformed(ActionEvent ae) {
        String cmd=ae.getActionCommand(); 
        if(cmd=="SAVE")
        {   response=fbfd.getText();
            JOptionPane.showMessageDialog(feedback,"THANK YOU!","COMMENT-CARD",JOptionPane.INFORMATION_MESSAGE);
            
            String path="C:\\Users\\Aman\\Documents\\NetBeansProjects\\Final_Project\\src\\final_project\\comments.txt";
            
            File file=new File(path);
            
            try{
                file.createNewFile();
                FileWriter w=new FileWriter(path);
                w.write(response+" ");
                w.close();
            }
            catch(Exception e)
            {
                
            }
        }}
    
}}
 
 
 
 
 
 
 
 
 
 
 
         