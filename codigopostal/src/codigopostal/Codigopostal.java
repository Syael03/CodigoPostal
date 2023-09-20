/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigopostal;

import java.util.Scanner;

/**
 *
 * @author S.YAEL
 */
public class Codigopostal {

   public void CodigoPostal(){
    Scanner stdIn = new Scanner (System.in);
    String cp;
    System.out.print("Introdusca codigo postal: ");
    cp = stdIn.nextLine();
    switch(cp.charAt(0)){
        case '1':
            System.out.println(cp + " esta en el area de Metepec ");
        break;
        case '2':
            System.out.println(cp + " esta en el area de Toluca");
        break;
        case '3':
            System.out.println(cp + " esta en el area de Oaxaca ");
        break;
        case '4':
            System.out.println(cp + " esta en el area de Nuevo leon");
        break;
        case '5':
            System.out.println(cp + " esta en el area de Veracruz");
        break;
        case '6':
            System.out.println(cp + " esta en el area de Venecia");
        break;
        case '7':
            System.out.println(cp + " esta en el area de Gotan");
        break;
        case '8':
            System.out.println(cp + " esta en el area de Metropolis");
        break;
        default:
            System.out.println(cp + " la opcion no es valida.  !!!!!!!Error!!!!!!");
    }
}
    public static void main(String[] args) {
        Codigopostal codpostal = new Codigopostal();
        codpostal.CodigoPostal();
    }
    
}
