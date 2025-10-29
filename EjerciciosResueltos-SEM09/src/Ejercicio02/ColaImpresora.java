/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import Cola.*;
import javax.swing.table.DefaultTableModel;

public class ColaImpresora {

    Cola<TrabajoImpresion> cola = new Cola<>();

    public void mostrarTabla(DefaultTableModel modelo) {
        int n = cola.contar();
        String titulos[] = {"ARCHIVO", "N° DE PAGINAS"};
        Object datos[][] = new Object[n][2];
        Nodo<TrabajoImpresion> nodo = cola.cimaNodo();
        for (int i = 0; i < n; i++) {
            TrabajoImpresion impresion = nodo.getInfo();
            datos[i][0] = impresion.getNombreArchivo();
            datos[i][1] = impresion.getNumero();

            nodo = nodo.getSgte();
        }
        modelo.setDataVector(datos, titulos);
    }

    public void encolarImpresion(TrabajoImpresion impresion) {
        cola.encolar(impresion);
    }

    public TrabajoImpresion desencolarImpresion() {
        return cola.desencolar();
    }

    public boolean esVacio() {
        return cola.esVacio();
    }
}
