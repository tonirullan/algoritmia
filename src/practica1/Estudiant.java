/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.ArrayList;

/**
 *
 * @author Toni
 */
public class Estudiant {
    private int id;
    private String nom;
    private ArrayList<Assignatura> AssigList;
    Curs curs;
    
    public Estudiant(int i, String s, Curs c){
        this.id = i;
        this.nom = s;
        this.curs = c;
    }
}
