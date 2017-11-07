/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazabarcos;

import java.util.ArrayList;

/**
 *
 * @author PC-SELE
 */
public class Rejilla {
 
    int alto,ancho;
    Casilla casillas [][];
    public Rejilla(){
    }
    
    public void CrearRejilla(int al, int an){
        
        this.alto = al;
        this.ancho = an;
        casillas = new Casilla[alto][ancho];     
        
        
    }
}
