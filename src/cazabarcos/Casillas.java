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
public class Casillas {
    JButton boton;
    String Estado;
    public void botones(){
      formulario_inicio fo = new formulario_inicio();
      for(int i=0;i<fo.tamano();i++){
          boton = new JButton();
          boton.setText(i+"");
          boton.setVisible(true);
      } 
    }
}
