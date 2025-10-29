/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

public class ColaCircular<T> {

    private T[] cola;
    private int capacidad;
    private int primero;
    private int ultimo;

    public ColaCircular(int maxElementos) {
        this.capacidad = maxElementos + 1;
        this.cola = (T[]) new Object[this.capacidad];

        this.primero = 0;
        this.ultimo = this.capacidad - 1;
    }

    private int avanzar(int indice) {
        return (indice + 1) % capacidad;
    }

    public boolean esVacia() {
        return avanzar(ultimo) == primero;
    }

    public boolean estaLlena() {
        return avanzar(avanzar(ultimo)) == primero;
    }

    public void encolar(T valor) {
        ultimo = avanzar(ultimo);
        cola[ultimo] = valor;
    }

    public T desencolar() {
        T valorEliminado = cola[primero];
        cola[primero] = null;
        primero = avanzar(primero);

        return valorEliminado;
    }

    public T cima() {
        return cola[primero];
    }

    public int contar() {

        if (primero <= ultimo) {
            return (ultimo - primero) + 1;
        } else {
            int parte1 = capacidad - primero;
            int parte2 = ultimo + 1;
            return parte1 + parte2;
        }
    }

    public void eliminarTodos() {

        this.cola = (T[]) new Object[this.capacidad];

        this.primero = 0;
        this.ultimo = this.capacidad - 1;
    }
}
