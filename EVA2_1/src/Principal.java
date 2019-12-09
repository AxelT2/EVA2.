
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARANGO RODRIGUEZ ERIN RICARDO 18550718
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iVal = input.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i + " - ");
             }
        System.out.println("");
        forFalso(iVal - 1);
        retoChido(iVal + 1);
    }
    
    public static void forFalso(int iVal){
        System.out.print(iVal + " - ");
        if (iVal > 1)
        {
        forFalso(iVal - 1); 
        }
    }
    public static void retoChido(int iVal){
        System.out.print(iVal + " - ");
        if (iVal < 10)
        {
            retoChido(iVal + 1);
        }
    }
}
