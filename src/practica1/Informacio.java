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
        this.setPreferredSize(new Dimension(400,360));
        
        l.setText("");
        l.setPreferredSize(new Dimension(400, 15));
        this.add(l);
        ta.setEditable(false);
        JScrollPane sp = new JScrollPane(ta);
        sp.setPreferredSize(new Dimension(400, 335));
        this.add(sp);
        
    }
}
