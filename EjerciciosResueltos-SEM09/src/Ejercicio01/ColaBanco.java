/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

import Cola.*;
import javax.swing.table.DefaultTableModel;


public class ColaBanco {
    Cola<Cliente> cola = new Cola<>();
    
    public void mostrarTabla(DefaultTableModel modelo){
        int n = cola.contar();
        String titulos[] = {"N° TICKET","NOMBRE", "TIPO DE TRAMITE"};
        Object datos[][] = new Object[n][3];
        Nodo<Cliente> nodo = cola.cimaNodo();
        for(int i = 0; i<n ; i++){
            Cliente cliente = nodo.getInfo();
            datos[i][0] = cliente.getnTicket();
            datos[i][1] = cliente.getNombre();
            datos[i][2] = cliente.getTipoTramite();
            nodo = nodo.getSgte();
        }
        modelo.setDataVector(datos, titulos);
    }
    public void encolarCliente(Cliente cliente){
      cola.encolar(cliente);
    }
    public Cliente desencolarCliente(){
        return cola.desencolar();
    }
    public boolean esVacio(){
        return cola.esVacio();
    }
}
