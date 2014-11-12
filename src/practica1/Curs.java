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
public class Curs {
    private int id;
    private String nom;
    private ArrayList<Assignatura> AssigList;
    private ArrayList<Estudiant> EstuList;
    
    public Curs(int i, String n){
        this.id = i;
        this.nom = n;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
