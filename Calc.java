import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame{

    static JFrame f;
    static JTextField t;

    String s0, s1, s2;

    Calc(){
        s0=s1=s2="";
    }
    public static void main(String args[]){
        f= new JFrame("calc");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Calc s = new Calc();

        t = new JTextField(18);

        t.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7,b8, b9, ba, bs, bd, bm, be, beq,beq1;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");


        beq = new JButton("=");

        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq1 = new JButton("C");

        be = new JButton(".");

        JPanel p = new JPanel();


        bm.addActionListener(s);
        bd.addActionListener(s);
        bs.addActionListener(s);
        ba.addActionListener(s);
        b9.addActionListener(s);
        b8.addActionListener(s);
        b7.addActionListener(s);
        b6.addActionListener(s);
        b5.addActionListener(s);
        b4.addActionListener(s);
        b3.addActionListener(s);
        b2.addActionListener(s);
        b1.addActionListener(s);
        b0.addActionListener(s);
        be.addActionListener(s);
        beq1.addActionListener(s);
        beq.addActionListener(s);

        p.add(t);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(b0);
        p.add(be);
        p.add(beq1);
        p.add(beq);

        p.setBackground(Color.lightGray);

        f.add(p);

        f.setSize(360, 240);
        
        f.setVisible(true);

    
    
    }




    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            // set the value of text
            t.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";
 
            // set the value of text
            t.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            t.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
                s2 = "";
            }
 
            // set the value of text
            t.setText(s0 + s1 + s2);
        }
    }
}