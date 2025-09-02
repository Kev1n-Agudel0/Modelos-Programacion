/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.modelPatos;

import co.edu.udistrital.comportamientoVolar.Volar;
import co.edu.udistrital.comportamientosSonido.Quack;
import co.edu.udistrital.interfaces.ISonido;
import co.edu.udistrital.interfaces.IVolar;
import co.edu.udistrital.model.Pato;

/**
 *
 * @author Estudiantes
 */
public class Real extends Pato{
    
    public Real() {
        volar = new Volar();
        sonido = new Quack();
    }


    @Override
    public void mostrarPato() {
        System.out.println("Este es un pato real...");
        
    }
    
    
    
}
