/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;


public class TrabajoImpresion {
    private String nombreArchivo;
    private int nPaginas;

    public TrabajoImpresion(String nombre, int numero) {
        this.nombreArchivo = nombre;
        this.nPaginas = numero;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getNumero() {
        return nPaginas;
    }

    public void setNumero(int numero) {
        this.nPaginas = numero;
    }
    
}
