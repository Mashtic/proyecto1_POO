/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_fabianarayaortega;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
/**
 *
 * @author fabia
 */
public class Simulacion {
    //Pantalla
    VentanaPrincipal refPantalla;
    //Threads
    ThreadProductor fabricaAmor;
    ThreadProductor fabricaArte;
    ThreadProductor fabricaMaldad;
    //Colas
    ColaSentimiento qSentimientosAmor= new ColaSentimiento(10);
    ColaSentimiento qSentimientosArte= new ColaSentimiento(10);
    ColaSentimiento qSentimientosMaldad= new ColaSentimiento(10);
    //ColaBebe qBebesFabricados = new ColaBebe (10);
    //ColaBebe qBebesHorneados =new ColaBebe(10);
   // ColaBebe qBebesDefectuosos= new ColaBebe(10);
    
    public Simulacion(VentanaPrincipal refpantalla){
        this.refPantalla=refpantalla;
        System.out.println("Iniciamos con Sabor");
        fabricaAmor=new ThreadProductor(this,"Amor");
        fabricaArte = new ThreadProductor(this, "Arte");
        fabricaMaldad = new ThreadProductor(this, "Maldad");
    }
    void iniciarSimulacion(){
        System.out.println("Holiiiii");
        fabricaAmor.start();
        fabricaArte.start();
        fabricaMaldad.start();
        
    }
    void pausarSimulacion(){
        fabricaAmor.setIsPaused(true);
        fabricaArte.setIsPaused(true);
        fabricaMaldad.setIsPaused(true);
    }
    void resumeSimulacion(){
        fabricaAmor.setIsPaused(false);
        fabricaArte.setIsPaused(false);
        fabricaMaldad.setIsPaused(false);
    }
    
    public void printQAmor(){
        refPantalla.printQAmor(qSentimientosAmor.printQueue());
    }
    public void printQArte(){
        refPantalla.printQArte(qSentimientosArte.printQueue());
    }
    public void printQMaldad(){
        refPantalla.printQMaldad(qSentimientosMaldad.printQueue());
    }
    /*
    public void setTiempoAmor(int tiempo){
        prodBien. setTiempo (tiempo);
    }
    public void setTiempoodio(int tiempo){
        prodMal. setTiempo (tiempo);
    }
    public void setPausaAmor(){
        prodBien.setIsPaused(true);
    }
    public void setPausaOdio(){
        prodMal.setIsPaused(true);
    }
    public void setResumeAmor(){
        prodBien.setIsPaused(false);
    }
    public void setResumeOdio(){
        
        prodMal.setIsPaused(false);
    }
*/
}
