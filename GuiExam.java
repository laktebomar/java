import javax.swing.JFrame;
import java.awt.*;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JTextField;

public class GuiExam extends JFrame{
    JLabel lbl= new JLabel("Nom");
    JTextField txt = new JTextField(10);
    JButton btnAjt = new JButton("ajouter");
    JButton btnSup = new JButton("supprimer");

    JLabel lbl1= new JLabel("Niveau");
    JTextField txt1 = new JTextField(10);
    

    JLabel lbl2= new JLabel("Livre");
    JTextField txt2 = new JTextField(10);

    
    
    List lst = new List();
    List lstN = new List();
    List lstL = new List();
    public GuiExam(){
        this.setTitle("GUI d'exam");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel pnl = new JPanel();

       pnl.setLayout(new FlowLayout());
       pnl.add(lbl); pnl.add(txt);pnl.add(lbl1);pnl.add(txt1); pnl.add(lbl2);pnl.add(txt2); pnl.add(btnAjt);
       pnl.add(btnSup);
        
       
       
       this.add(pnl, BorderLayout.NORTH);


       JPanel pnlc =  new JPanel();
       pnlc.setLayout(new GridLayout());
       pnlc.add(lst);
       pnlc.add(lstN);
       pnlc.add(lstL);

 
       this.add(pnlc, BorderLayout.CENTER);

       
       this.setBounds(100, 10, 1200, 600);
       this.setVisible(true);

       btnAjt.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            lst.add(s);
            lstN.add(txt1.getText());
            lstL.add(txt2.getText());
            txt.setText(""); txt1.setText(""); txt2.setText(""); 
        }
    });

    btnSup.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e) {
           
           try {
             
            int indx = lst.getSelectedIndex();
            lst.remove(indx);
            lstN.remove(indx);
            lstL.remove(indx);
        
              
           } catch (Exception e2) {
               System.out.println("err");
           }
        }
    });

}
        public static void main(String[] args) {
            GuiExam g = new GuiExam();
        }
}


