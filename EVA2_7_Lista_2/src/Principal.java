/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nodo1, nodo2, nodo3;
        nodo1 = new Nodo(32);
    }
    
}
class Nodo{
    private int valor;
    private Nodo siguiente;

    public Nodo(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
public Nodo() {
    this.siguiente = null;
}
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}