/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

import javax.swing.table.DefaultTableModel;
import Cola.*;

public class ColaLlamada {
    Cola<LlamadasTelefonicas> cola = new Cola<>();

    public void mostrarTabla(DefaultTableModel modelo) {
        int n = cola.contar();
        String titulos[] = {"N° TELEFONICO", "CLIENTE","DURACION LLAMADA"};
        Object datos[][] = new Object[n][3];
        Nodo<LlamadasTelefonicas> nodo = cola.cimaNodo();
        for (int i = 0; i < n; i++) {
            LlamadasTelefonicas llamadas = nodo.getInfo();
            datos[i][0] = llamadas.getNumeroTelefonico();
            datos[i][1] = llamadas.getCliente();
            datos[i][2] = llamadas.getDuracionLlamada();
            
            nodo = nodo.getSgte();
        }
        modelo.setDataVector(datos, titulos);
    }

    public void encolarLlamada(LlamadasTelefonicas llamada) {
        cola.encolar(llamada);
    }

    public LlamadasTelefonicas desencolarLlamada() {
        return cola.desencolar();
    }

    public boolean esVacio() {
        return cola.esVacio();
    }
}
