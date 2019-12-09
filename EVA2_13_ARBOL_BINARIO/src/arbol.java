/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIESPN
 */
public class arbol {
    public Nodo root;
    
    public arbol(){
    root = null;
    }
    
    public void agregarNodo (Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){
        //Arbol vacío
        root = nuevo;
        }else{
        if(nuevo.getValor() > actual.getValor()){//mayor __> derecha
        if(actual.getDer() == null{
        actual.setDer(nuevo);
        }else {//ya hay un nodo
        agregarNodoRec(actual.getDer(), nuevo);    
        }}
        }
        else if(nuevo.getValor() < actual.getValor()){
                if(actual.getIzq() == null{
        actual.setIzq(nuevo);
        }else {//ya hay un nodo
        agregarNodoRec(actual.getIzq(), nuevo);    
        }}//menor ---> izquierda
        }else{
            //valor ya exxiste
            System.out.println("UPS! YA EXISTE EL VALOR");
        }
        public void imprimePostOrder(){
        postOrder(root);
        }
        private void postOrder(Nodo actual){
            if(actual != null){
        //leer izquierda
        postOrder(actual.getIzq());
        //leer derecha
        postOrder(actual.getDer());
        //imprimir
            System.out.println(actual.getValor() + " -");
            }
        }
        public void imprimePreOrder(){
        preOrder(root);
        }
        private void preOrder(Nodo actual){
            if(actual != null){
       //imprimir
         System.out.println(actual.getValor() + " -");
        //leer izquierda
        preOrder(actual.getIzq());
        //leer derecha
        preOrder(actual.getDer());
            }
        }
        public void imprimeInOrder(){
        InOrder(root);
        }
        private void InOrder(Nodo actual){
            if(actual != null){
        //leer izquierda
        InOrder(actual.getIzq());
        //imprimir
            System.out.println(actual.getValor() + " -");
        //leer derecha
        InOrder(actual.getDer());
        
            }
        }
        
        }
