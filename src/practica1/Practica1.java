/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Practica1 extends JFrame{

    List<Curs> CursList = new ArrayList<Curs>();
    JMenuItem menuOpcion11,menuOpcion21,menuOpcion31;
    Informacio informacio;
    
    public Practica1(){
        super("Gestió d'un col·legi");
        this.setLayout(new BorderLayout());
        informacio = new Informacio();
        this.getContentPane().add(informacio);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu menu1 = new JMenu("CURSOS");
        menuOpcion11 = new JMenuItem("MOSTRAR CURSOS");
        
        JMenu menu2 = new JMenu("ASSIGNATURES");
        menuOpcion21 = new JMenuItem("MOSTRAR ASSIGNATURES");
        
        JMenu menu3 = new JMenu("ESTUDIANTS");
        menuOpcion31 = new JMenuItem("MOSTRAR ESTUDIANTS");
        
        menu1.add(menuOpcion11);
        menu2.add(menuOpcion21);
        menu3.add(menuOpcion31);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        
        this.setSize(new Dimension(400,403));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Practica1 Colegi = new Practica1();
        Colegi.setVisible(true);
    }
    
}
