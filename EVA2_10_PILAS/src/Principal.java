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
        Pila mipila = new Pila();
        mipila.push(new Nodo (100));
        mipila.push(new Nodo (200));
        mipila.push(new Nodo (300));
        mipila.push(new Nodo (400));
        mipila.print();
        System.out.println("CIMA DE LA PILA" + mipila.peek());
        System.out.println("CIMA DE LA PILA" + mipila.pop());
                
    }
    
}
