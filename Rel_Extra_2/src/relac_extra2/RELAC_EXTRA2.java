/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relac_extra2;

import Entidad.Cine;

/**
 *
 * @author lorena
 */
public class RELAC_EXTRA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cine pelis=new Cine();
       pelis.crearSala();
        System.out.println(pelis.toString());
        pelis.llenarSala(pelis);
        System.out.println(pelis.toString());
    }
    
}
