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
public class ColaSentimiento {
    private ArrayList <Sentimiento> listaSentimientos;
    private int cantMaxima;

    public ColaSentimiento(int cantMaxima) {
        this.cantMaxima = cantMaxima;
        listaSentimientos= new ArrayList<Sentimiento>();
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        if (cantMaxima<=listaSentimientos.size()) {
            this.cantMaxima = cantMaxima;
        }
    }

    public ArrayList<Sentimiento> getListaSentimientos() {
        return listaSentimientos;
    }

    public void encolar(Sentimiento senti){
        listaSentimientos.add(senti);
    }
    
    public Sentimiento desencolar(){
        return listaSentimientos.remove(0); 
    }
    public String printQueue(){
        String str="";
        for (int i = 0; i < listaSentimientos.size(); i++) {
            str+= (i+1)+"."+listaSentimientos.get(i).toString()+"\n";
        }
        return str;
    }
}
