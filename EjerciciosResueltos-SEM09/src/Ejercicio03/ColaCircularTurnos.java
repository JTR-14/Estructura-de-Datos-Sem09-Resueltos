/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import javax.swing.table.DefaultTableModel;
import Cola.*;

public class ColaCircularTurnos {

    private ColaCircular<Turno> cola = new ColaCircular<>(5);
    private int numeroTurno = 1;
    public void agregarTurno(String nombreCliente) {
        Turno turno = new Turno(nombreCliente,numeroTurno);
        cola.encolar(turno);
        numeroTurno++;
    }

    public Turno atenderTurno() {
        return cola.desencolar();
    }

    public void mostrarTabla(DefaultTableModel modelo) {

        int n = cola.contar();

        String titulos[] = {"N° TURNO", "NOMBRE CLIENTE"};
        Object datos[][] = new Object[n][2];

        for (int i = 0; i < n; i++) {
            Turno turnoActual = cola.desencolar();

            datos[i][0] = turnoActual.getNumeroTurno();
            datos[i][1] = turnoActual.getNombreCliente();

            cola.encolar(turnoActual);
        }

        modelo.setDataVector(datos, titulos);
    }
    public boolean estaVacia(){
        return cola.esVacia();
    }
    public boolean estaLlena(){
        return cola.estaLlena();
    }
}
