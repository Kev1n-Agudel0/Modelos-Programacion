/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.modelPatos;

import co.edu.udistrital.comportamientoVolar.NoVolar;
import co.edu.udistrital.comportamientosSonido.NoSonido;
import co.edu.udistrital.interfaces.ISonido;
import co.edu.udistrital.interfaces.IVolar;
import co.edu.udistrital.model.Pato;

/**
 *
 * @author Estudiantes
 */
public class Decorativo extends Pato{
    
    public Decorativo() {
        volar = new NoVolar();
        sonido = new NoSonido();
    }

    @Override
    public void mostrarPato() {
        System.out.println("Este pato es de plastico...");
    }
   
}
    
    
    
