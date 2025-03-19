/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab2.aula.solucao;

/**
 *
 * @author fabiola
 */
public class Main {
    
    public static void main(String ... args){
        
        FabricanteCelularSingleton singleton = new FabricanteCelularSingleton();
        FabricanteCelular apple = singleton.getInstance("Apple");
                      
        apple.constroiCelular("IPhoneX");
        
        FabricanteCelular samsung = singleton.getInstance("Samgung");
        Celular galaxyMeu = samsung.constroiCelular("GalaxyS23");
        
        galaxyMeu.tiraFoto();
        
        Celular galaxyJose = samsung.constroiCelular("GalaxyS23");
        galaxyJose.tiraFoto();
        
    }
    
}
