/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class Practica1 extends JFrame{

    List<Curs> CursList = new ArrayList<Curs>();
    JMenuItem   menuOpcion11,menuOpcion12,
                menuOpcion21,
                menuOpcion31;
    Informacio informacio;
    String aux,nom;
    int id;
    Curs c;
    
    ActionListener a1 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==menuOpcion11){
                informacio.setL("Cursos");
            }
            if(e.getSource()==menuOpcion12){
                nom = JOptionPane.showInputDialog("Nom del curs", null);
                if(nom!=null&&!"".equals(nom)){
                    c = new Curs(CursList.size()+1,nom);
                    CursList.add(c);
                }
            }
            if(e.getSource()==menuOpcion21){
                informacio.setL("Assignatures");
            }
            if(e.getSource()==menuOpcion31){
                informacio.setL("Estudiants");
            }
        }
    };
    
    public Practica1(){
        super("Gestió d'un col·legi");
        this.setLayout(new BorderLayout());
        informacio = new Informacio();
        this.getContentPane().add(informacio);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu menu1 = new JMenu("CURSOS");
        menuOpcion11 = new JMenuItem("MOSTRAR CURSOS");
        menuOpcion12 = new JMenuItem("NOU CURS");
        
        JMenu menu2 = new JMenu("ASSIGNATURES");
        menuOpcion21 = new JMenuItem("MOSTRAR ASSIGNATURES");
        
        JMenu menu3 = new JMenu("ESTUDIANTS");
        menuOpcion31 = new JMenuItem("MOSTRAR ESTUDIANTS");
        
        menu1.add(menuOpcion11);
        menu1.add(menuOpcion12);
        menu2.add(menuOpcion21);
        menu3.add(menuOpcion31);
        
        menuOpcion11.addActionListener(a1);
        menuOpcion12.addActionListener(a1);
        menuOpcion21.addActionListener(a1);
        menuOpcion31.addActionListener(a1);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        
        this.setSize(new Dimension(400,400));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public String getCursos(){
        String s = "";
        for(int i=0;i<CursList.size();i++){
            s += "ID: "+CursList.get(i).getId()+"  Nom: "+CursList.get(i).getNom() + "\n";
        }
        return s;
    }
    
    public static void main(String[] args) {
        Practica1 Colegi = new Practica1();
        Colegi.setVisible(true);
    }
    
}
