/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.comportamientoVolar;

import co.edu.udistrital.interfaces.IVolar;

/**
 *
 * @author Estudiantes
 */
public class NoVolar implements IVolar {

    @Override
    public void volar() {
        System.out.println("El pato NO puede volar");
    }
    
}
