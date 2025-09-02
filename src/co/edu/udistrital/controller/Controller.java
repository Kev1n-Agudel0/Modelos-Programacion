/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.comportamientoVolar.Cohete;
import co.edu.udistrital.comportamientoVolar.NoVolar;
import co.edu.udistrital.comportamientoVolar.Volar;
import co.edu.udistrital.comportamientosSonido.NoSonido;
import co.edu.udistrital.comportamientosSonido.Quack;
import co.edu.udistrital.model.Pato;
import co.edu.udistrital.modelPatos.Decorativo;
import co.edu.udistrital.modelPatos.Plastico;
import co.edu.udistrital.modelPatos.Real;
import co.edu.udistrital.view.Vista;

/**
 *
 * @author Estudiantes
 */
public class Controller {

    private Vista vista;

    public Controller() {
        vista = new Vista();
    }

    public void run() {
        menu();
    }

    public void menu() {
        String mensaje = "Bienvenido a Duck Simulator\nElija el pato de su preferencia..."
                + "\n1. Pato Real"
                + "\n2. Pato de Plastico"
                + "\n3. Pato de Decoracion\n";

        int opcion = Integer.parseInt(vista.leerDato(mensaje));

        Pato patoElegido = null;

        switch (opcion) {
            case 1:
                patoElegido = new Real();
                break;
            case 2:
                patoElegido = new Plastico();
                break;
            case 3:
                patoElegido = new Decorativo();
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }


        patoElegido.mostrarPato();
        patoElegido.sonidoPato();
        patoElegido.volarPato();

        int opcion2;
        do {
            opcion2 = Integer.parseInt(vista.leerDato(
                    "\nDesea cambiar algun aspecto?\n"
                    + "1. Volar\n"
                    + "2. Sonido\n"
                    + "3. Nada / Salir"
            ));

            switch (opcion2) {
                case 1:
                    int opcion3 = Integer.parseInt(
                            vista.leerDato("Elija:\n1. Volar\n2. No Volar\n3. Cohete")
                    );
                    switch (opcion3) {
                        case 1:
                            patoElegido.cambiarVolar(new Volar());
                            break;
                        case 2:
                            patoElegido.cambiarVolar(new NoVolar());
                            break;
                        case 3:
                            patoElegido.cambiarVolar(new Cohete());
                            break;
                        default:
                            System.out.println("Opcion no valida, se mantiene la actual.");
                    }
                    break;

                case 2:
                    int opcion4 = Integer.parseInt(
                            vista.leerDato("Elija:\n1. Quack\n2. Mudo")
                    );
                    if (opcion4 == 1) {
                        patoElegido.cambiarSonido(new Quack());
                    } else {
                        patoElegido.cambiarSonido(new NoSonido());
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del menu de cambios...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

            
            System.out.println("\nCaracteristicas actuales:");
            patoElegido.mostrarPato();
            patoElegido.sonidoPato();
            patoElegido.volarPato();

        } while (opcion2 != 3);
    }
}
