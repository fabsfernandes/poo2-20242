/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab2.aula.solucao;

/**
 *
 * @author fabiola
 */
public class FabricanteCelularSingleton {
    
    Apple ap;
    Samsung sg;
    
    public FabricanteCelular getInstance(String fabrica){
        
        if(fabrica == "Apple"){
            
            if(ap == null){
                ap = new Apple();
            }
            return ap;
            
        } else {
            
           if(sg == null){
               sg = new Samsung();
           } 
           return sg;
           
            
        }
        
    }
    
    
    
}
