
import java.util.LinkedList;

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
        LinkedList<String> UnaLista = new LinkedList<String>();
        UnaLista.add("el ricoche");
        UnaLista.add("prendido");
        UnaLista.add("SKELER!");
        UnaLista.add("ya andamos");
        UnaLista.add("bien mamados");
        UnaLista.add("we");
        UnaLista.addFirst("bruh");
        System.out.println(UnaLista);
        for(String string : UnaLista){
            System.out.print(string + "-");
        }
        System.out.println(UnaLista.size());
        UnaLista.remove(3);
        System.out.println(UnaLista);
    }
    class algo{

        @Override
        public String toString() {
            return "algo{" + '}';
        }
    
    }
    
}
