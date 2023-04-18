/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dataObject;

import etu1988.ModelView;
import etu1988.framework.myAnnotation.MethodAnnotation;

/**
 *
 * @author mita
 */
public class Emp {
    String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }   
    
    public Emp(String nom){
        setNom(nom);
    }
    
    public Emp(){}
    
    @MethodAnnotation(url = "appelMoi")
    public ModelView callMe(){
        ModelView mv = new ModelView();
        mv.setView("testView.jsp");
        return mv;
    }
}