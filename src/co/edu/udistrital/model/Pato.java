/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import co.edu.udistrital.interfaces.ISonido;
import co.edu.udistrital.interfaces.IVolar;

/**
 *
 * @author Estudiantes
 */
public abstract class Pato {
    
    protected IVolar volar;
    protected ISonido sonido;
    
    public Pato(){  
    }
    
    public abstract void mostrarPato();
    
    public void sonidoPato(){
        sonido.sonido();
    }
    
    public void volarPato(){
        volar.volar();
    }
    
    public void nadar(){
        System.out.println("Todos los patos pueden nadar/flotar");
    }
    
    public void cambiarVolar(IVolar volar) {
        this.volar = volar;
    }

    public void cambiarSonido(ISonido sonido) {
        this.sonido = sonido;
    }


}
