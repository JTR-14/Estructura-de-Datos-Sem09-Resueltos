/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author Sistemas
 */
public class Cliente {
    private int nTicket;
    private String nombre;
    private String tipoTramite;

    public Cliente(int nTicket, String nombre, String tipoTramite) {
        this.nTicket = nTicket;
        this.nombre = nombre;
        this.tipoTramite = tipoTramite;
    }

    public int getnTicket() {
        return nTicket;
    }

    public void setnTicket(int nTicket) {
        this.nTicket = nTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    
}