/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_fabianarayaortega;
import java.util.ArrayList;
/**
 *
 * @author fabia
 */

public class ColaBebe {
    private ArrayList <Bebe> listaBebes;
    private int cantMaxima;

    public ColaBebe(int cantMaxima) {
        this.cantMaxima = cantMaxima;
        listaBebes= new ArrayList<Bebe>();
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        if (cantMaxima<=listaBebes.size()) {
            this.cantMaxima = cantMaxima;
        }     
    }
    
    public void encolar(Bebe bebe){
        listaBebes.add(bebe);
    }
    
    public Bebe desencolar(){
        return listaBebes.remove(0); 
    }
    
    public String printQueue(){
        String str="";
        for (int i = 0; i < listaBebes.size(); i++) {
            str+= (i+1)+"."+listaBebes.get(i).toString();
        }
        return str;
    }
}
