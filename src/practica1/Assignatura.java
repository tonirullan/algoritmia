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
public class Assignatura {
    private int id;
    private String nom;
    private ArrayList<Estudiant> EstuList;
    private Curs curs;
    
    public Assignatura(int i, String s, Curs c){
        this.id = i;
        this.nom = s;
        this.curs = c;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
    public boolean equals(Object o){
        if(!(o instanceof Assignatura)){
            return false;
        }
        Assignatura e=(Assignatura)o;
        if(this.id==e.getId()){
           return true; 
        }else{
            return false;
        }
    }
}
