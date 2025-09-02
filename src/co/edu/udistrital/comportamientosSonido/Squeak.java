/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.comportamientosSonido;

import co.edu.udistrital.interfaces.ISonido;

/**
 *
 * @author Estudiantes
 */
public class Squeak implements ISonido{

    @Override
    public void sonido() {
        System.out.println("Este pato hace Squeak");
    }
    
    
}
