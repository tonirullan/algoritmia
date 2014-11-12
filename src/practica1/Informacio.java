/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author toni
 */
public class Informacio extends JPanel{
    JTextArea ta = new JTextArea();
    JLabel l = new JLabel();
    
    public Informacio(){
        this.setPreferredSize(new Dimension(390,355));
        l.setText("   ");
        this.add(l);
        ta.setEditable(false);
        JScrollPane sp = new JScrollPane(ta);
        sp.setPreferredSize(new Dimension(390, 320));
        this.add(sp);
    }
    
    public void setTa(String s){
        this.ta.setText(s);
    }
    
    public void setL(String s){
        this.l.setText(s);
        this.repaint();
    }
}
