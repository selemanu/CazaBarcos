/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazabarcos;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author PC-SELE
 */
public class Barco {
    private int tamaño;
    private String nombre;
    ArrayList<Barco> barcos;
    /*-------------------------------------*/
    Barco barco1;
    Barco barco2;
    Barco barco3;
    Barco barco4;
    /*-------------------------------------*/
    public Barco(String nombre,int tamaño) {
        this.nombre = nombre;
        this.tamaño=tamaño;
        barcos = new ArrayList();
        ponbarcos();
        
    }
    
    public void ponbarcos(){
        barco1= new Barco("Porta Aviones",4);
        barco2= new Barco("Submarino",3);
        barco1= new Barco("Fragata",2);
        barco1= new Barco("Velero",1);
        
        this.barcos.add(barco1);
        this.barcos.add(barco2);
        this.barcos.add(barco3);
        this.barcos.add(barco4);
    }
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
