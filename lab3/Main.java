/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab3.wrapper.aulalab;

/**
 *
 * @author fabiola
 */
public class Main {
    
    public static void main(String ... args){
        Pavao pavao = new PavaoAzul();
        Ave pavaoAve = new AvePavaoAdapter(pavao);
        
        pavaoAve.emitirSom();
        pavaoAve.voar();
        
    }
    
}
