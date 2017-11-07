/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazabarcos;

import javax.swing.JButton;

/**
 *
 * @author PC-SELE
 */
public class Casilla {
    JButton boton;
    String Estado="nada"; //Nada,Agua,Hundido,Tocado
    Barco b;
    
public Casilla(String estado){
    this.Estado= estado;
    Casillas();
    b=null;
}

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Barco getB() {
        return b;
    }

    public void setB(Barco b) {
        this.b = b;
    }


public void Casillas(){
    
}
}
