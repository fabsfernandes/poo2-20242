/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ufu.poo2.lab3.wrapper.aulalab;

/**
 *
 * @author fabiola
 */
public class AvePavaoAdapter implements Ave{
    
    Pavao pavao;
    
    public AvePavaoAdapter(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("pavao nao voa");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
        
    }
    
}
