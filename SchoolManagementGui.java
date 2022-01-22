import java.awt.*;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JTextField;

public class SchoolManagementGui extends JFrame {
    
    JButton btn = new JButton("etudiant");
    JButton btn1 = new JButton("Niveau");
    JButton btn2 = new JButton("planifier un examen");
    JButton btn3 = new JButton("saisir les notes");
    
    
    JLabel lblSign = new JLabel("chosir qu'elle opération vous voulez faire");
    
   
    public Tuto(){
        this.setTitle("EHTP");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        JPanel pnl = new JPanel();
        this.add(lblSign, BorderLayout.NORTH);
        pnl.add(btn); pnl.add(btn1); pnl.add(btn2); pnl.add(btn3);
        this.add(pnl, BorderLayout.CENTER);
        this.setBounds(100, 10, 300, 300);
       this.setVisible(true);
       btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Test s = new Test();    
        }
    });
    btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Niveau s = new Niveau();    
        }
    });
    btn2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Examen emn = new Examen();    
        }
    });
    btn3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Notes n = new Notes();    
        }
    });
    
    }
    


    public static void main(String[] args) {
            SchoolManagementGui t = new SchoolManagementGui();
    }
}


class Test extends JFrame{
    JLabel lbl = new JLabel("etudiant");
    JButton btnAjt = new JButton("ajouter");
    JButton btnMod = new JButton("Modifier");
    JButton btnSup = new JButton("supprimer");
    List lst  = new List();
   
    JTextField txt = new JTextField(20);
    JLabel lblErr = new JLabel("ok");
    public Test() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel pnl = new JPanel();

       pnl.setLayout(new FlowLayout());
       pnl.add(lbl); pnl.add(txt); pnl.add(btnAjt);
       pnl.add(btnMod);pnl.add(btnSup);pnl.add(lst);


       
       
       this.add(pnl, BorderLayout.NORTH);


       JPanel pnlc =  new JPanel();
       pnlc.setLayout(new GridLayout());
       pnlc.add(lst);

       this.add(pnlc, BorderLayout.CENTER);

       
       this.add(lblErr, BorderLayout.SOUTH);
       this.setBounds(100, 10, 600, 500);
       this.setVisible(true);

       btnAjt.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            lst.add(s);
            txt.setText("");  
        }
    });

    btnMod.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
           
           try {
             
              int indx = lst.getSelectedIndex();
              lst.getItem(indx);
             
              txt.setText(lst.getItem(indx)); 


              btnMod.addActionListener(new ActionListener(){
         
                public void actionPerformed(ActionEvent e) {

                    String s = txt.getText();
                    lst.replaceItem(s, indx);
                    
                }
            });
              
           } catch (Exception e2) {
               lblErr.setText("element non removed");
           }
        }
    });

    btnSup.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            int indx = lst.getSelectedIndex();
            lst.remove(indx);
           
        }
    });
}}


class Niveau extends JFrame{
    JLabel lbl= new JLabel("Niveau");
    JTextField txt = new JTextField(14);
    JButton btnAjt = new JButton("ajouter");
    JButton btnMod = new JButton("Modifier");
    JButton btnSup = new JButton("supprimer");
    List lst = new List();
    JLabel lblErr = new JLabel("ok");
    public Niveau(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel pnl = new JPanel();

       pnl.setLayout(new FlowLayout());
       pnl.add(lbl); pnl.add(txt); pnl.add(btnAjt);
       pnl.add(btnMod);pnl.add(btnSup);pnl.add(lst);


       
       
       this.add(pnl, BorderLayout.NORTH);


       JPanel pnlc =  new JPanel();
       pnlc.setLayout(new GridLayout());
       pnlc.add(lst);
 
       this.add(pnlc, BorderLayout.CENTER);

       
       this.add(lblErr, BorderLayout.SOUTH);
       this.setBounds(100, 10, 600, 500);
       this.setVisible(true);

       btnAjt.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            lst.add(s);
            txt.setText("");  
        }
    });

    btnMod.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
           
           try {
             
            int indx = lst.getSelectedIndex();
              lst.getItem(indx);
             
              txt.setText(lst.getItem(indx)); 


              btnMod.addActionListener(new ActionListener(){
         
                public void actionPerformed(ActionEvent e) {

                    String s = txt.getText();
                    lst.replaceItem(s, indx);
                    
                }
            });
              
           } catch (Exception e2) {
            lblErr.setText("element non removed");
           }
        }
    });

    btnSup.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            int indx = lst.getSelectedIndex();
            lst.remove(indx);
        }
    });

    }

}


class Examen extends JFrame{
    JLabel lbl= new JLabel("Examen");
    JTextField txt = new JTextField(12);
    JButton btnAjt = new JButton("ajouter");
    JButton btnMod = new JButton("Modifier");

    JLabel lbl1= new JLabel("Niveau");
    JTextField txt1 = new JTextField(12);
   

    List lst = new List();
    List lstN = new List();
    JLabel lblErr = new JLabel("ok");
    public Examen(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel pnl = new JPanel();

       pnl.setLayout(new FlowLayout());
       pnl.add(lbl); pnl.add(txt);pnl.add(lbl1);pnl.add(txt1); pnl.add(btnAjt);
       pnl.add(btnMod);
        
       
       
       this.add(pnl, BorderLayout.NORTH);


       JPanel pnlc =  new JPanel();
       pnlc.setLayout(new GridLayout());
       pnlc.add(lst);
       pnlc.add(lstN);

 
       this.add(pnlc, BorderLayout.CENTER);

       
       this.add(lblErr, BorderLayout.SOUTH);
       this.setBounds(100, 10, 600, 500);
       this.setVisible(true);

       btnAjt.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            lst.add(s);
            lstN.add(txt1.getText());
            txt.setText(""); txt1.setText(""); 
        }
    });

    btnMod.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
           
           try {
             
              int indx = lst.getSelectedIndex();
              lst.getItem(indx);
             
              txt.setText(lst.getItem(indx)); 
              txt1.setText(lstN.getItem(indx)); 


              btnMod.addActionListener(new ActionListener(){
         
                public void actionPerformed(ActionEvent e) {

                    String s = txt.getText();
                    String s1 = txt1.getText();
                    lst.replaceItem(s, indx);
                    lstN.replaceItem(s1, indx);
                    
                }
            });
              
           } catch (Exception e2) {
               lblErr.setText("err line 312");
           }
        }
    });

}
}



class Notes extends JFrame{
    JLabel lbl= new JLabel("Note");
    JTextField txt = new JTextField(10);
    JButton btnAjt = new JButton("ajouter");
    JButton btnMod = new JButton("Modifier");

    JLabel lbl1= new JLabel("matiére");
    JTextField txt1 = new JTextField(10);
    

    JLabel lbl2= new JLabel("etudiant");
    JTextField txt2 = new JTextField(10);

    

    List lst = new List();
    List lstM = new List();
    List lstE = new List();
    JLabel lblErr = new JLabel("ok");
    public Notes(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel pnl = new JPanel();

       pnl.setLayout(new FlowLayout());
       pnl.add(lbl); pnl.add(txt);pnl.add(lbl1);pnl.add(txt1); pnl.add(lbl2);pnl.add(txt2); pnl.add(btnAjt);
       pnl.add(btnMod);
        
       
       
       this.add(pnl, BorderLayout.NORTH);


       JPanel pnlc =  new JPanel();
       pnlc.setLayout(new GridLayout());
       pnlc.add(lst);
       pnlc.add(lstM);
       pnlc.add(lstE);

 
       this.add(pnlc, BorderLayout.CENTER);

       
       this.add(lblErr, BorderLayout.SOUTH);
       this.setBounds(100, 10, 1200, 600);
       this.setVisible(true);

       btnAjt.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            lst.add(s);
            lstM.add(txt1.getText());
            lstE.add(txt2.getText());
            txt.setText(""); txt1.setText(""); txt2.setText(""); 
        }
    });

    btnMod.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
           
           try {
             
              int indx = lst.getSelectedIndex();
              lst.getItem(indx);
             
              txt.setText(lst.getItem(indx)); 
              txt1.setText(lstM.getItem(indx)); 
              txt2.setText(lstE.getItem(indx)); 


              btnMod.addActionListener(new ActionListener(){
         
                public void actionPerformed(ActionEvent e) {

                    String s = txt.getText();
                    String s1 = txt1.getText();
                    lst.replaceItem(s, indx);
                    lstM.replaceItem(s1, indx);
                    lstE.replaceItem(txt2.getText(), indx);
                    
                }
            });
              
           } catch (Exception e2) {
               lblErr.setText("err");
           }
        }
    });

}
}
