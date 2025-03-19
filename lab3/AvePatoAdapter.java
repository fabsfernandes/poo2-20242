/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab3.wrapper.aulalab;

/**
 *
 * @author fabiola
 */
public class AvePatoAdapter implements Ave {
    
    Pato pato;
    
    public AvePatoAdapter(Pato pato){
        this.pato = pato;
    }

    @Override
    public void voar() {
        
    }

    @Override
    public void emitirSom() {
        
        pato.grasnar();
        
    }
    
    
    
}
