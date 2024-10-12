/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Math.pow
        int expo,base;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Escriba el numero que potenciara: ");
        expo = captu.nextInt();
        base = captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for ( int i = 1; i <=expo; i++){
        resu = resu * base;
                }
        System.out.println("EL resultado es = "+ resu);
    }
    
            
            
    
}
