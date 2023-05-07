/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_fabianarayaortega;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author fabia
 */
public class ThreadProductor extends Thread{
    private boolean isRunning=true;
    private boolean isPaused =false;
    Simulacion simulacion;
    private String tipo;
    private int tiempo=2;
    
    public ThreadProductor(Simulacion simulacion, String tipo) {
        this.simulacion = simulacion;
        this.tipo=tipo;
    }
    
    @Override
    public void run() {
        while (isRunning){
            try {
                    sleep(tiempo*1000);
                    //fabricar!!!
                    int numero=(new Random()).nextInt(3)+1;
                    if (tipo.equals("Amor")){
                        if (simulacion.qSentimientosAmor.getListaSentimientos().size()<simulacion.qSentimientosAmor.getCantMaxima()){
                            simulacion.qSentimientosAmor.encolar(new Sentimiento(tipo, numero));
                            simulacion.printQAmor();
//qSentimientosBuenos.add(new Sentimiento(tipo, numero));
                            //simulacion.printQAmor();
                        }else{
                            this.isPaused=true;
                        }
                        
                    }else{
                        if (tipo.equals("Arte")){
                            if (simulacion.qSentimientosArte.getListaSentimientos().size()<simulacion.qSentimientosArte.getCantMaxima()){
                
                                simulacion.qSentimientosArte.encolar(new Sentimiento(tipo, numero));
                                simulacion.printQArte();
                            //simulacion.printQOdio();
                            }else{
                                this.isPaused=true;
                            }
                        }else{
                            if (simulacion.qSentimientosMaldad.getListaSentimientos().size()<simulacion.qSentimientosMaldad.getCantMaxima()){
                
                                simulacion.qSentimientosMaldad.encolar(new Sentimiento(tipo, numero));
                                simulacion.printQMaldad();
                                
                            }else{
                                this.isPaused=true;
                            }
                        }
                    }
                } catch (InterruptedException ex) {}
            while(isPaused){
                try {
                    sleep(100);
                } catch (InterruptedException ex) {}
            }
        }
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public void setIsPaused(boolean isPaused) {
        this.isPaused = isPaused;
    }
    
    
}
