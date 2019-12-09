
import java.util.Scanner;

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
      Scanner spider = new Scanner(System.in);
        System.out.println("Métale un número");
        int iVal = spider.nextInt();
        if (esPrimoIneficiente(iVal)) {
            System.out.println("Es prime");
        }
        else{
            System.out.println("Ne es prime");
        }
    }
    
    
    public static boolean esPrimoIneficiente(int valor){
        boolean resu = true;
        for (int i = 2; i < valor; i++) {
            if ((valor % i) == 0) {
                resu = false;
                break;
            }
        }
        return resu;
    }
}
