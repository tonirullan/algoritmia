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
   public int getId(){
       return(this.id);
   }
   public boolean equals(Object o){
        if(!(o instanceof Estudiant)){
            return false;
        }
        Estudiant e=(Estudiant)o;
        if(this.id==e.getId()){
           return true; 
        }else{
            return false;
        }
   }
}
