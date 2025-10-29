/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;


public class LlamadasTelefonicas {
    private int numeroTelefonico;
    private String cliente;
    private double duracionLlamada;

    public LlamadasTelefonicas(int numeroTelefonico, String cliente, double duracionLlamada) {
        this.numeroTelefonico = numeroTelefonico;
        this.cliente = cliente;
        this.duracionLlamada = duracionLlamada;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(double duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }
    
}
