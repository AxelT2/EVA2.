/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo<String> bruh = new Nodo<String>();
        bruh.setValor("Holiwi");
        System.out.println(bruh.getValor());
    }
    
}

class Nodo<T>{
    private T valor;
    Nodo siguiente;
    Nodo previo;

    public Nodo() {
        this.siguiente = null;
        this.previo = null;
        
    }
    public Nodo(T valor){
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}