/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_fabianarayaortega;

/**
 *
 * @author fabia
 */
public class Sentimiento {
 private String tipo;
    private int valor;

    public Sentimiento(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString(){
       return "Sentimiento "+tipo+":"+valor;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}