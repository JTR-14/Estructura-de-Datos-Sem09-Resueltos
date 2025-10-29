/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

public class Cola<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
        }
        ultimo = nuevo;
    }

    public T desencolar() {
        T eliminado = primero.getInfo();
        primero = primero.getSgte();
        if (primero == null) {
            ultimo = null;
        }
        return eliminado;
    }

    public boolean esVacio() {
        return primero == null;
    }

    public T cima() {
        return primero.getInfo();
    }

    public void eliminarTodos() {
        while (primero != null) {
            primero = primero.getSgte();
        }
        ultimo = null;
    }
    public int contar(){
        int contador = 0;
        Nodo<T> p =primero;
        while (p !=null){
            contador++;
            p = p.getSgte();
        }
        return contador;
    }
}
