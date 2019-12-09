/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIESPN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arbol bruh = new arbol();
        arbol.agregarNodo(new Nodo(13));
        arbol.agregarNodo(new Nodo(10));
        arbol.agregarNodo(new Nodo(18));
        arbol.agregarNodo(new Nodo(2));
        arbol.agregarNodo(new Nodo(11));
        arbol.agregarNodo(new Nodo(17));
        arbol.agregarNodo(new Nodo(20));
        arbol.imprimePostOrder();
    }
    
}
